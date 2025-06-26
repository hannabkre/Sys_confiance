package simplepdl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.UseRessource;
import simplepdl.Ressource;
import simplepdl.util.SimplepdlSwitch;


/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class SimplePDLValidator extends SimplepdlSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public SimplePDLValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcess(simplepdl.Process object) {
		// Contraintes sur process
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite
		for (ProcessElement pe : object.getProcessElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un ProcessElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkDefinition(WorkDefinition object) {
		// Contraintes sur WD
		this.result.recordIfFailed(
				object.getName() != null || object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'activité ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_DEFINITION)
					.allMatch(pe -> (pe.equals(object) || !((WorkDefinition) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de l'activité (" + object.getName() + ") n'est pas unique");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkSequence.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkSequence(WorkSequence object) {
		// Contrainte 1 : pas de boucle sur soi-même
		this.result.recordIfFailed(
			!object.getPredecessor().equals(object.getSuccessor()),
			object,
			"La dépendance relie l'activité " + object.getPredecessor().getName() + " à elle-même"
		);

		// Contrainte 2 : pas de doublon de type entre deux mêmes activités
		boolean duplicateExists = object.getProcess().getProcessElements().stream()
			.filter(pe -> pe instanceof WorkSequence)
			.map(pe -> (WorkSequence) pe)
			.filter(ws -> ws != object) // on ignore soi-même
			.anyMatch(ws ->
				ws.getPredecessor().equals(object.getPredecessor())
				&& ws.getSuccessor().equals(object.getSuccessor())
				&& ws.getLinkType().equals(object.getLinkType())
			);

		this.result.recordIfFailed(
			!duplicateExists,
			object,
			"Il existe déjà une dépendance de type " + object.getLinkType()
				+ " entre " + object.getPredecessor().getName()
				+ " et " + object.getSuccessor().getName()
		);

		return null;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est une Guidance.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseGuidance(Guidance object) {
		this.result.recordIfFailed(
			object.getText() != null && !object.getText().isBlank(),
			object,
			"La guidance doit contenir un texte non vide"
		);
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un UseRessource.
	 * Cette méthode vérifie que la quantité demandée est valide.
	 * - La quantité doit être strictement positive.
	 * - La quantité ne doit pas dépasser celle disponible dans la ressource associée.
	 *
	 * @param object élément visité
	 * @return null pour permettre la poursuite de la visite
	 */
	@Override
	public Boolean caseUseRessource(simplepdl.UseRessource object) {
		// Quantité strictement positive
		this.result.recordIfFailed(
			object.getQuantity() > 0,
			object,
			"La quantité utilisée doit être strictement positive"
		);

		// Quantité disponible suffisante
		this.result.recordIfFailed(
			object.getQuantity() <= object.getRessource().getQuantity(),
			object,
			"La quantité utilisée (" + object.getQuantity() + ") dépasse la quantité disponible (" 
				+ object.getRessource().getQuantity() + ") de la ressource " + object.getRessource().getName()
		);

		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Ressource.
	 * Cette méthode vérifie que :
	 * - Le nom est non nul et conforme aux conventions Java.
	 * - La quantité disponible est strictement positive.
	 * - Le nom de la ressource est unique dans le processus.
	 *
	 * @param object élément visité
	 * @return null pour permettre la poursuite de la visite
	 */
	@Override
	public Boolean caseRessource(simplepdl.Ressource object) {
		// Nom valide
		this.result.recordIfFailed(
			object.getName() != null && object.getName().matches(IDENT_REGEX),
			object,
			"Le nom de la ressource ne respecte pas les conventions Java"
		);

		// Quantité disponible positive
		this.result.recordIfFailed(
			object.getQuantity() > 0,
			object,
			"La quantité de la ressource doit être strictement positive"
		);

		// Nom unique
		this.result.recordIfFailed(
			object.getProcess().getProcessElements().stream()
				.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.RESSOURCE)
				.allMatch(pe -> (pe.equals(object) || !((simplepdl.Ressource) pe).getName().equals(object.getName()))),
			object,
			"Le nom de la ressource (" + object.getName() + ") n'est pas unique dans le processus"
		);

		return null;
	}




	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
