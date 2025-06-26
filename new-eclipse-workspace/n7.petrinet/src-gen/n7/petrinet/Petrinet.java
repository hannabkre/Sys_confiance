/**
 */
package n7.petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link n7.petrinet.Petrinet#getPetrinetElements <em>Petrinet Elements</em>}</li>
 *   <li>{@link n7.petrinet.Petrinet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see n7.petrinet.petrinetPackage#getPetrinet()
 * @model
 * @generated
 */
public interface Petrinet extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinet Elements</b></em>' containment reference list.
	 * The list contents are of type {@link n7.petrinet.PetrinetElement}.
	 * It is bidirectional and its opposite is '{@link n7.petrinet.PetrinetElement#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Elements</em>' containment reference list.
	 * @see n7.petrinet.petrinetPackage#getPetrinet_PetrinetElements()
	 * @see n7.petrinet.PetrinetElement#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<PetrinetElement> getPetrinetElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see n7.petrinet.petrinetPackage#getPetrinet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link n7.petrinet.Petrinet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Petrinet
