/**
 * generated by Xtext 2.38.0
 */
package fr.n7.pDL1.util;

import fr.n7.pDL1.Guidance;
import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.ProcessElement;
import fr.n7.pDL1.Ressource;
import fr.n7.pDL1.UseRessource;
import fr.n7.pDL1.WorkDefinition;
import fr.n7.pDL1.WorkSequence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.n7.pDL1.PDL1Package
 * @generated
 */
public class PDL1Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PDL1Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL1Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = PDL1Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PDL1Package.PROCESS:
      {
        fr.n7.pDL1.Process process = (fr.n7.pDL1.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDL1Package.PROCESS_ELEMENT:
      {
        ProcessElement processElement = (ProcessElement)theEObject;
        T result = caseProcessElement(processElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDL1Package.WORK_DEFINITION:
      {
        WorkDefinition workDefinition = (WorkDefinition)theEObject;
        T result = caseWorkDefinition(workDefinition);
        if (result == null) result = caseProcessElement(workDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDL1Package.WORK_SEQUENCE:
      {
        WorkSequence workSequence = (WorkSequence)theEObject;
        T result = caseWorkSequence(workSequence);
        if (result == null) result = caseProcessElement(workSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDL1Package.RESSOURCE:
      {
        Ressource ressource = (Ressource)theEObject;
        T result = caseRessource(ressource);
        if (result == null) result = caseProcessElement(ressource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDL1Package.USE_RESSOURCE:
      {
        UseRessource useRessource = (UseRessource)theEObject;
        T result = caseUseRessource(useRessource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDL1Package.GUIDANCE:
      {
        Guidance guidance = (Guidance)theEObject;
        T result = caseGuidance(guidance);
        if (result == null) result = caseProcessElement(guidance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(fr.n7.pDL1.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessElement(ProcessElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkDefinition(WorkDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkSequence(WorkSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRessource(Ressource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Ressource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Ressource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseRessource(UseRessource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guidance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guidance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuidance(Guidance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PDL1Switch
