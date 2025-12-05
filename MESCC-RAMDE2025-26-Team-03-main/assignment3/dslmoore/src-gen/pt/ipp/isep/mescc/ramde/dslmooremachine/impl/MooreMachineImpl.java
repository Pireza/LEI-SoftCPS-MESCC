/**
 */
package pt.ipp.isep.mescc.ramde.dslmooremachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Event;
import pt.ipp.isep.mescc.ramde.dslmooremachine.InitialNode;
import pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Output;
import pt.ipp.isep.mescc.ramde.dslmooremachine.State;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moore Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl#getInitialnode <em>Initialnode</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MooreMachineImpl extends MinimalEObjectImpl.Container implements MooreMachine {
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
	 * The cached value of the '{@link #getInitialnode() <em>Initialnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialnode()
	 * @generated
	 * @ordered
	 */
	protected InitialNode initialnode;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MooreMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslmooremachinePackage.Literals.MOORE_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.MOORE_MACHINE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialNode getInitialnode() {
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
					DslmooremachinePackage.MOORE_MACHINE__INITIALNODE, oldInitialnode, newInitialnode);
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
						EOPPOSITE_FEATURE_BASE - DslmooremachinePackage.MOORE_MACHINE__INITIALNODE, null, msgs);
			if (newInitialnode != null)
				msgs = ((InternalEObject) newInitialnode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DslmooremachinePackage.MOORE_MACHINE__INITIALNODE, null, msgs);
			msgs = basicSetInitialnode(newInitialnode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.MOORE_MACHINE__INITIALNODE,
					newInitialnode, newInitialnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, DslmooremachinePackage.MOORE_MACHINE__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					DslmooremachinePackage.MOORE_MACHINE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this,
					DslmooremachinePackage.MOORE_MACHINE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, DslmooremachinePackage.MOORE_MACHINE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DslmooremachinePackage.MOORE_MACHINE__INITIALNODE:
			return basicSetInitialnode(null, msgs);
		case DslmooremachinePackage.MOORE_MACHINE__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
		case DslmooremachinePackage.MOORE_MACHINE__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case DslmooremachinePackage.MOORE_MACHINE__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		case DslmooremachinePackage.MOORE_MACHINE__STATE:
			return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
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
		case DslmooremachinePackage.MOORE_MACHINE__NAME:
			return getName();
		case DslmooremachinePackage.MOORE_MACHINE__INITIALNODE:
			return getInitialnode();
		case DslmooremachinePackage.MOORE_MACHINE__EVENT:
			return getEvent();
		case DslmooremachinePackage.MOORE_MACHINE__TRANSITION:
			return getTransition();
		case DslmooremachinePackage.MOORE_MACHINE__OUTPUT:
			return getOutput();
		case DslmooremachinePackage.MOORE_MACHINE__STATE:
			return getState();
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
		case DslmooremachinePackage.MOORE_MACHINE__NAME:
			setName((String) newValue);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__INITIALNODE:
			setInitialnode((InitialNode) newValue);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Output>) newValue);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__STATE:
			getState().clear();
			getState().addAll((Collection<? extends State>) newValue);
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
		case DslmooremachinePackage.MOORE_MACHINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__INITIALNODE:
			setInitialnode((InitialNode) null);
			return;
		case DslmooremachinePackage.MOORE_MACHINE__EVENT:
			getEvent().clear();
			return;
		case DslmooremachinePackage.MOORE_MACHINE__TRANSITION:
			getTransition().clear();
			return;
		case DslmooremachinePackage.MOORE_MACHINE__OUTPUT:
			getOutput().clear();
			return;
		case DslmooremachinePackage.MOORE_MACHINE__STATE:
			getState().clear();
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
		case DslmooremachinePackage.MOORE_MACHINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DslmooremachinePackage.MOORE_MACHINE__INITIALNODE:
			return initialnode != null;
		case DslmooremachinePackage.MOORE_MACHINE__EVENT:
			return event != null && !event.isEmpty();
		case DslmooremachinePackage.MOORE_MACHINE__TRANSITION:
			return transition != null && !transition.isEmpty();
		case DslmooremachinePackage.MOORE_MACHINE__OUTPUT:
			return output != null && !output.isEmpty();
		case DslmooremachinePackage.MOORE_MACHINE__STATE:
			return state != null && !state.isEmpty();
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

} //MooreMachineImpl
