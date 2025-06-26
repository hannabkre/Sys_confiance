/**
 */
package n7.petrinet.impl;

import n7.petrinet.TimeInterval;
import n7.petrinet.Transition;
import n7.petrinet.petrinetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link n7.petrinet.impl.TransitionImpl#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NodeImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval timeInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return petrinetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInterval getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeInterval(TimeInterval newTimeInterval, NotificationChain msgs) {
		TimeInterval oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, petrinetPackage.TRANSITION__TIME_INTERVAL, oldTimeInterval, newTimeInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeInterval(TimeInterval newTimeInterval) {
		if (newTimeInterval != timeInterval) {
			NotificationChain msgs = null;
			if (timeInterval != null)
				msgs = ((InternalEObject)timeInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - petrinetPackage.TRANSITION__TIME_INTERVAL, null, msgs);
			if (newTimeInterval != null)
				msgs = ((InternalEObject)newTimeInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - petrinetPackage.TRANSITION__TIME_INTERVAL, null, msgs);
			msgs = basicSetTimeInterval(newTimeInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, petrinetPackage.TRANSITION__TIME_INTERVAL, newTimeInterval, newTimeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case petrinetPackage.TRANSITION__TIME_INTERVAL:
				return basicSetTimeInterval(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case petrinetPackage.TRANSITION__TIME_INTERVAL:
				return getTimeInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case petrinetPackage.TRANSITION__TIME_INTERVAL:
				setTimeInterval((TimeInterval)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case petrinetPackage.TRANSITION__TIME_INTERVAL:
				setTimeInterval((TimeInterval)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case petrinetPackage.TRANSITION__TIME_INTERVAL:
				return timeInterval != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
