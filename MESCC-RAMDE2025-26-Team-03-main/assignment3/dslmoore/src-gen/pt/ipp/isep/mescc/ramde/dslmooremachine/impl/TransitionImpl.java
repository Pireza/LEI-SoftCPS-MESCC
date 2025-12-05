/**
 */
package pt.ipp.isep.mescc.ramde.dslmooremachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Event;
import pt.ipp.isep.mescc.ramde.dslmooremachine.State;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected State sourceState;

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
		return DslmooremachinePackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.TRANSITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslmooremachinePackage.TRANSITION__EVENT,
							oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DslmooremachinePackage.TRANSITION__EVENT, oldEvent, newEvent);
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
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject) event).eInverseRemove(this, DslmooremachinePackage.EVENT__TRANSITION,
						Event.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject) newEvent).eInverseAdd(this, DslmooremachinePackage.EVENT__TRANSITION,
						Event.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.TRANSITION__EVENT, newEvent,
					newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (State) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DslmooremachinePackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(State newTargetState, NotificationChain msgs) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DslmooremachinePackage.TRANSITION__TARGET_STATE, oldTargetState, newTargetState);
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
	public void setTargetState(State newTargetState) {
		if (newTargetState != targetState) {
			NotificationChain msgs = null;
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this, DslmooremachinePackage.STATE__INCOMING,
						State.class, msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject) newTargetState).eInverseAdd(this, DslmooremachinePackage.STATE__INCOMING,
						State.class, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.TRANSITION__TARGET_STATE,
					newTargetState, newTargetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getSourceState() {
		if (sourceState != null && sourceState.eIsProxy()) {
			InternalEObject oldSourceState = (InternalEObject) sourceState;
			sourceState = (State) eResolveProxy(oldSourceState);
			if (sourceState != oldSourceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DslmooremachinePackage.TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
			}
		}
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceState(State newSourceState, NotificationChain msgs) {
		State oldSourceState = sourceState;
		sourceState = newSourceState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DslmooremachinePackage.TRANSITION__SOURCE_STATE, oldSourceState, newSourceState);
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
	public void setSourceState(State newSourceState) {
		if (newSourceState != sourceState) {
			NotificationChain msgs = null;
			if (sourceState != null)
				msgs = ((InternalEObject) sourceState).eInverseRemove(this, DslmooremachinePackage.STATE__OUTGOING,
						State.class, msgs);
			if (newSourceState != null)
				msgs = ((InternalEObject) newSourceState).eInverseAdd(this, DslmooremachinePackage.STATE__OUTGOING,
						State.class, msgs);
			msgs = basicSetSourceState(newSourceState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.TRANSITION__SOURCE_STATE,
					newSourceState, newSourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DslmooremachinePackage.TRANSITION__EVENT:
			if (event != null)
				msgs = ((InternalEObject) event).eInverseRemove(this, DslmooremachinePackage.EVENT__TRANSITION,
						Event.class, msgs);
			return basicSetEvent((Event) otherEnd, msgs);
		case DslmooremachinePackage.TRANSITION__TARGET_STATE:
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this, DslmooremachinePackage.STATE__INCOMING,
						State.class, msgs);
			return basicSetTargetState((State) otherEnd, msgs);
		case DslmooremachinePackage.TRANSITION__SOURCE_STATE:
			if (sourceState != null)
				msgs = ((InternalEObject) sourceState).eInverseRemove(this, DslmooremachinePackage.STATE__OUTGOING,
						State.class, msgs);
			return basicSetSourceState((State) otherEnd, msgs);
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
		case DslmooremachinePackage.TRANSITION__EVENT:
			return basicSetEvent(null, msgs);
		case DslmooremachinePackage.TRANSITION__TARGET_STATE:
			return basicSetTargetState(null, msgs);
		case DslmooremachinePackage.TRANSITION__SOURCE_STATE:
			return basicSetSourceState(null, msgs);
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
		case DslmooremachinePackage.TRANSITION__NAME:
			return getName();
		case DslmooremachinePackage.TRANSITION__EVENT:
			if (resolve)
				return getEvent();
			return basicGetEvent();
		case DslmooremachinePackage.TRANSITION__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case DslmooremachinePackage.TRANSITION__SOURCE_STATE:
			if (resolve)
				return getSourceState();
			return basicGetSourceState();
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
		case DslmooremachinePackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case DslmooremachinePackage.TRANSITION__EVENT:
			setEvent((Event) newValue);
			return;
		case DslmooremachinePackage.TRANSITION__TARGET_STATE:
			setTargetState((State) newValue);
			return;
		case DslmooremachinePackage.TRANSITION__SOURCE_STATE:
			setSourceState((State) newValue);
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
		case DslmooremachinePackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DslmooremachinePackage.TRANSITION__EVENT:
			setEvent((Event) null);
			return;
		case DslmooremachinePackage.TRANSITION__TARGET_STATE:
			setTargetState((State) null);
			return;
		case DslmooremachinePackage.TRANSITION__SOURCE_STATE:
			setSourceState((State) null);
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
		case DslmooremachinePackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DslmooremachinePackage.TRANSITION__EVENT:
			return event != null;
		case DslmooremachinePackage.TRANSITION__TARGET_STATE:
			return targetState != null;
		case DslmooremachinePackage.TRANSITION__SOURCE_STATE:
			return sourceState != null;
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

} //TransitionImpl
