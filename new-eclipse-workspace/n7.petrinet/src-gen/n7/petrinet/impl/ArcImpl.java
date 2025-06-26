/**
 */
package n7.petrinet.impl;

import n7.petrinet.Arc;
import n7.petrinet.ArcType;
import n7.petrinet.Direction;
import n7.petrinet.Node;
import n7.petrinet.petrinetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link n7.petrinet.impl.ArcImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link n7.petrinet.impl.ArcImpl#getToNode <em>To Node</em>}</li>
 *   <li>{@link n7.petrinet.impl.ArcImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link n7.petrinet.impl.ArcImpl#getArcType <em>Arc Type</em>}</li>
 *   <li>{@link n7.petrinet.impl.ArcImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends PetrinetElementImpl implements Arc {
	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected Node fromNode;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected Node toNode;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArcType() <em>Arc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcType()
	 * @generated
	 * @ordered
	 */
	protected static final ArcType ARC_TYPE_EDEFAULT = ArcType.NORMAL;

	/**
	 * The cached value of the '{@link #getArcType() <em>Arc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcType()
	 * @generated
	 * @ordered
	 */
	protected ArcType arcType = ARC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.P2T;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return petrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getFromNode() {
		if (fromNode != null && fromNode.eIsProxy()) {
			InternalEObject oldFromNode = (InternalEObject)fromNode;
			fromNode = (Node)eResolveProxy(oldFromNode);
			if (fromNode != oldFromNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, petrinetPackage.ARC__FROM_NODE, oldFromNode, fromNode));
			}
		}
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromNode(Node newFromNode, NotificationChain msgs) {
		Node oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__FROM_NODE, oldFromNode, newFromNode);
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
	public void setFromNode(Node newFromNode) {
		if (newFromNode != fromNode) {
			NotificationChain msgs = null;
			if (fromNode != null)
				msgs = ((InternalEObject)fromNode).eInverseRemove(this, petrinetPackage.NODE__IN_ARC, Node.class, msgs);
			if (newFromNode != null)
				msgs = ((InternalEObject)newFromNode).eInverseAdd(this, petrinetPackage.NODE__IN_ARC, Node.class, msgs);
			msgs = basicSetFromNode(newFromNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__FROM_NODE, newFromNode, newFromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getToNode() {
		if (toNode != null && toNode.eIsProxy()) {
			InternalEObject oldToNode = (InternalEObject)toNode;
			toNode = (Node)eResolveProxy(oldToNode);
			if (toNode != oldToNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, petrinetPackage.ARC__TO_NODE, oldToNode, toNode));
			}
		}
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToNode(Node newToNode, NotificationChain msgs) {
		Node oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__TO_NODE, oldToNode, newToNode);
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
	public void setToNode(Node newToNode) {
		if (newToNode != toNode) {
			NotificationChain msgs = null;
			if (toNode != null)
				msgs = ((InternalEObject)toNode).eInverseRemove(this, petrinetPackage.NODE__OUT_ARC, Node.class, msgs);
			if (newToNode != null)
				msgs = ((InternalEObject)newToNode).eInverseAdd(this, petrinetPackage.NODE__OUT_ARC, Node.class, msgs);
			msgs = basicSetToNode(newToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__TO_NODE, newToNode, newToNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType getArcType() {
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcType(ArcType newArcType) {
		ArcType oldArcType = arcType;
		arcType = newArcType == null ? ARC_TYPE_EDEFAULT : newArcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__ARC_TYPE, oldArcType, arcType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, petrinetPackage.ARC__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case petrinetPackage.ARC__FROM_NODE:
				if (fromNode != null)
					msgs = ((InternalEObject)fromNode).eInverseRemove(this, petrinetPackage.NODE__IN_ARC, Node.class, msgs);
				return basicSetFromNode((Node)otherEnd, msgs);
			case petrinetPackage.ARC__TO_NODE:
				if (toNode != null)
					msgs = ((InternalEObject)toNode).eInverseRemove(this, petrinetPackage.NODE__OUT_ARC, Node.class, msgs);
				return basicSetToNode((Node)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case petrinetPackage.ARC__FROM_NODE:
				return basicSetFromNode(null, msgs);
			case petrinetPackage.ARC__TO_NODE:
				return basicSetToNode(null, msgs);
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
			case petrinetPackage.ARC__FROM_NODE:
				if (resolve) return getFromNode();
				return basicGetFromNode();
			case petrinetPackage.ARC__TO_NODE:
				if (resolve) return getToNode();
				return basicGetToNode();
			case petrinetPackage.ARC__WEIGHT:
				return getWeight();
			case petrinetPackage.ARC__ARC_TYPE:
				return getArcType();
			case petrinetPackage.ARC__DIRECTION:
				return getDirection();
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
			case petrinetPackage.ARC__FROM_NODE:
				setFromNode((Node)newValue);
				return;
			case petrinetPackage.ARC__TO_NODE:
				setToNode((Node)newValue);
				return;
			case petrinetPackage.ARC__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case petrinetPackage.ARC__ARC_TYPE:
				setArcType((ArcType)newValue);
				return;
			case petrinetPackage.ARC__DIRECTION:
				setDirection((Direction)newValue);
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
			case petrinetPackage.ARC__FROM_NODE:
				setFromNode((Node)null);
				return;
			case petrinetPackage.ARC__TO_NODE:
				setToNode((Node)null);
				return;
			case petrinetPackage.ARC__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case petrinetPackage.ARC__ARC_TYPE:
				setArcType(ARC_TYPE_EDEFAULT);
				return;
			case petrinetPackage.ARC__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case petrinetPackage.ARC__FROM_NODE:
				return fromNode != null;
			case petrinetPackage.ARC__TO_NODE:
				return toNode != null;
			case petrinetPackage.ARC__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case petrinetPackage.ARC__ARC_TYPE:
				return arcType != ARC_TYPE_EDEFAULT;
			case petrinetPackage.ARC__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (weight: ");
		result.append(weight);
		result.append(", arcType: ");
		result.append(arcType);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
