/**
 * generated by Xtext 2.38.0
 */
package fr.n7.pDL1.impl;

import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.Ressource;
import fr.n7.pDL1.UseRessource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL1.impl.UseRessourceImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link fr.n7.pDL1.impl.UseRessourceImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseRessourceImpl extends MinimalEObjectImpl.Container implements UseRessource
{
  /**
   * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRessource()
   * @generated
   * @ordered
   */
  protected Ressource ressource;

  /**
   * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected static final int QUANTITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected int quantity = QUANTITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseRessourceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDL1Package.Literals.USE_RESSOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ressource getRessource()
  {
    if (ressource != null && ressource.eIsProxy())
    {
      InternalEObject oldRessource = (InternalEObject)ressource;
      ressource = (Ressource)eResolveProxy(oldRessource);
      if (ressource != oldRessource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDL1Package.USE_RESSOURCE__RESSOURCE, oldRessource, ressource));
      }
    }
    return ressource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ressource basicGetRessource()
  {
    return ressource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRessource(Ressource newRessource)
  {
    Ressource oldRessource = ressource;
    ressource = newRessource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.USE_RESSOURCE__RESSOURCE, oldRessource, ressource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getQuantity()
  {
    return quantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantity(int newQuantity)
  {
    int oldQuantity = quantity;
    quantity = newQuantity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.USE_RESSOURCE__QUANTITY, oldQuantity, quantity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PDL1Package.USE_RESSOURCE__RESSOURCE:
        if (resolve) return getRessource();
        return basicGetRessource();
      case PDL1Package.USE_RESSOURCE__QUANTITY:
        return getQuantity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDL1Package.USE_RESSOURCE__RESSOURCE:
        setRessource((Ressource)newValue);
        return;
      case PDL1Package.USE_RESSOURCE__QUANTITY:
        setQuantity((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PDL1Package.USE_RESSOURCE__RESSOURCE:
        setRessource((Ressource)null);
        return;
      case PDL1Package.USE_RESSOURCE__QUANTITY:
        setQuantity(QUANTITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PDL1Package.USE_RESSOURCE__RESSOURCE:
        return ressource != null;
      case PDL1Package.USE_RESSOURCE__QUANTITY:
        return quantity != QUANTITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (quantity: ");
    result.append(quantity);
    result.append(')');
    return result.toString();
  }

} //UseRessourceImpl
