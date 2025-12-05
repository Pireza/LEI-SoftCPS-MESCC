/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage;
import pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode;
import pt.ipp.isep.mescc.ramde.dslmealymachine.State;
import pt.ipp.isep.mescc.ramde.dslmealymachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl#getInitialnode <em>Initialnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getInitialnode() <em>Initialnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialnode()
	 * @generated
	 * @ordered
	 */
	protected InitialNode initialnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslmealymachinePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmealymachinePackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					DslmealymachinePackage.STATE__INCOMING, DslmealymachinePackage.TRANSITION__TARGET_STATE);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					DslmealymachinePackage.STATE__OUTGOING, DslmealymachinePackage.TRANSITION__SOURCE_STATE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialNode getInitialnode() {
		if (initialnode != null && initialnode.eIsProxy()) {
			InternalEObject oldInitialnode = (InternalEObject) initialnode;
			initialnode = (InitialNode) eResolveProxy(oldInitialnode);
			if (initialnode != oldInitialnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslmealymachinePackage.STATE__INITIALNODE,
							oldInitialnode, initialnode));
			}
		}
		return initialnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode basicGetInitialnode() {
		return initialnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialnode(InitialNode newInitialnode, NotificationChain msgs) {
		InitialNode oldInitialnode = initialnode;
		initialnode = newInitialnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DslmealymachinePackage.STATE__INITIALNODE, oldInitialnode, newInitialnode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialnode(InitialNode newInitialnode) {
		if (newInitialnode != initialnode) {
			NotificationChain msgs = null;
			if (initialnode != null)
				msgs = ((InternalEObject) initialnode).eInverseRemove(this,
						DslmealymachinePackage.INITIAL_NODE__INITIAL_STATE, InitialNode.class, msgs);
			if (newInitialnode != null)
				msgs = ((InternalEObject) newInitialnode).eInverseAdd(this,
						DslmealymachinePackage.INITIAL_NODE__INITIAL_STATE, InitialNode.class, msgs);
			msgs = basicSetInitialnode(newInitialnode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmealymachinePackage.STATE__INITIALNODE,
					newInitialnode, newInitialnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DslmealymachinePackage.STATE__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
		case DslmealymachinePackage.STATE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
		case DslmealymachinePackage.STATE__INITIALNODE:
			if (initialnode != null)
				msgs = ((InternalEObject) initialnode).eInverseRemove(this,
						DslmealymachinePackage.INITIAL_NODE__INITIAL_STATE, InitialNode.class, msgs);
			return basicSetInitialnode((InitialNode) otherEnd, msgs);
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
		case DslmealymachinePackage.STATE__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
		case DslmealymachinePackage.STATE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
		case DslmealymachinePackage.STATE__INITIALNODE:
			return basicSetInitialnode(null, msgs);
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
		case DslmealymachinePackage.STATE__NAME:
			return getName();
		case DslmealymachinePackage.STATE__INCOMING:
			return getIncoming();
		case DslmealymachinePackage.STATE__OUTGOING:
			return getOutgoing();
		case DslmealymachinePackage.STATE__INITIALNODE:
			if (resolve)
				return getInitialnode();
			return basicGetInitialnode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DslmealymachinePackage.STATE__NAME:
			setName((String) newValue);
			return;
		case DslmealymachinePackage.STATE__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends Transition>) newValue);
			return;
		case DslmealymachinePackage.STATE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends Transition>) newValue);
			return;
		case DslmealymachinePackage.STATE__INITIALNODE:
			setInitialnode((InitialNode) newValue);
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
		case DslmealymachinePackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DslmealymachinePackage.STATE__INCOMING:
			getIncoming().clear();
			return;
		case DslmealymachinePackage.STATE__OUTGOING:
			getOutgoing().clear();
			return;
		case DslmealymachinePackage.STATE__INITIALNODE:
			setInitialnode((InitialNode) null);
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
		case DslmealymachinePackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DslmealymachinePackage.STATE__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case DslmealymachinePackage.STATE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case DslmealymachinePackage.STATE__INITIALNODE:
			return initialnode != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
