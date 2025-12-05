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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage;
import pt.ipp.isep.mescc.ramde.dslmooremachine.InitialNode;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Output;
import pt.ipp.isep.mescc.ramde.dslmooremachine.State;
import pt.ipp.isep.mescc.ramde.dslmooremachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl#getInitialnode <em>Initialnode</em>}</li>
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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

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
		return DslmooremachinePackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (Output) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslmooremachinePackage.STATE__OUTPUT,
							oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DslmooremachinePackage.STATE__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, DslmooremachinePackage.OUTPUT__STATE,
						Output.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, DslmooremachinePackage.OUTPUT__STATE,
						Output.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.STATE__OUTPUT, newOutput,
					newOutput));
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
					DslmooremachinePackage.STATE__INCOMING, DslmooremachinePackage.TRANSITION__TARGET_STATE);
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
					DslmooremachinePackage.STATE__OUTGOING, DslmooremachinePackage.TRANSITION__SOURCE_STATE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslmooremachinePackage.STATE__INITIALNODE,
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
					DslmooremachinePackage.STATE__INITIALNODE, oldInitialnode, newInitialnode);
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
						DslmooremachinePackage.INITIAL_NODE__INITIAL_STATE, InitialNode.class, msgs);
			if (newInitialnode != null)
				msgs = ((InternalEObject) newInitialnode).eInverseAdd(this,
						DslmooremachinePackage.INITIAL_NODE__INITIAL_STATE, InitialNode.class, msgs);
			msgs = basicSetInitialnode(newInitialnode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslmooremachinePackage.STATE__INITIALNODE,
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
		case DslmooremachinePackage.STATE__OUTPUT:
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, DslmooremachinePackage.OUTPUT__STATE,
						Output.class, msgs);
			return basicSetOutput((Output) otherEnd, msgs);
		case DslmooremachinePackage.STATE__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
		case DslmooremachinePackage.STATE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
		case DslmooremachinePackage.STATE__INITIALNODE:
			if (initialnode != null)
				msgs = ((InternalEObject) initialnode).eInverseRemove(this,
						DslmooremachinePackage.INITIAL_NODE__INITIAL_STATE, InitialNode.class, msgs);
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
		case DslmooremachinePackage.STATE__OUTPUT:
			return basicSetOutput(null, msgs);
		case DslmooremachinePackage.STATE__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
		case DslmooremachinePackage.STATE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
		case DslmooremachinePackage.STATE__INITIALNODE:
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
		case DslmooremachinePackage.STATE__NAME:
			return getName();
		case DslmooremachinePackage.STATE__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		case DslmooremachinePackage.STATE__INCOMING:
			return getIncoming();
		case DslmooremachinePackage.STATE__OUTGOING:
			return getOutgoing();
		case DslmooremachinePackage.STATE__INITIALNODE:
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
		case DslmooremachinePackage.STATE__NAME:
			setName((String) newValue);
			return;
		case DslmooremachinePackage.STATE__OUTPUT:
			setOutput((Output) newValue);
			return;
		case DslmooremachinePackage.STATE__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends Transition>) newValue);
			return;
		case DslmooremachinePackage.STATE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends Transition>) newValue);
			return;
		case DslmooremachinePackage.STATE__INITIALNODE:
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
		case DslmooremachinePackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DslmooremachinePackage.STATE__OUTPUT:
			setOutput((Output) null);
			return;
		case DslmooremachinePackage.STATE__INCOMING:
			getIncoming().clear();
			return;
		case DslmooremachinePackage.STATE__OUTGOING:
			getOutgoing().clear();
			return;
		case DslmooremachinePackage.STATE__INITIALNODE:
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
		case DslmooremachinePackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DslmooremachinePackage.STATE__OUTPUT:
			return output != null;
		case DslmooremachinePackage.STATE__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case DslmooremachinePackage.STATE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case DslmooremachinePackage.STATE__INITIALNODE:
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
