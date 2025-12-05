/**
 */
package pt.ipp.isep.mescc.ramde.dslmooremachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DslmooremachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dslmooremachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dslmooremachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dslmooremachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslmooremachinePackage eINSTANCE = pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl <em>Moore Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getMooreMachine()
	 * @generated
	 */
	int MOORE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initialnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE__INITIALNODE = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE__TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE__OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE__STATE = 5;

	/**
	 * The number of structural features of the '<em>Moore Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Moore Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOORE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.EventImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET_STATE = 2;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_STATE = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.OutputImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__STATE = 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.InitialNodeImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INITIAL_STATE = 0;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Initialnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIALNODE = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine <em>Moore Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moore Machine</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine
	 * @generated
	 */
	EClass getMooreMachine();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getName()
	 * @see #getMooreMachine()
	 * @generated
	 */
	EAttribute getMooreMachine_Name();

	/**
	 * Returns the meta object for the containment reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getInitialnode <em>Initialnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialnode</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getInitialnode()
	 * @see #getMooreMachine()
	 * @generated
	 */
	EReference getMooreMachine_Initialnode();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getEvent()
	 * @see #getMooreMachine()
	 * @generated
	 */
	EReference getMooreMachine_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getTransition()
	 * @see #getMooreMachine()
	 * @generated
	 */
	EReference getMooreMachine_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getOutput()
	 * @see #getMooreMachine()
	 * @generated
	 */
	EReference getMooreMachine_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getState()
	 * @see #getMooreMachine()
	 * @generated
	 */
	EReference getMooreMachine_State();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Event#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Event#getTransition()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Transition();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getTargetState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TargetState();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Transition#getSourceState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SourceState();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.Output#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.Output#getState()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_State();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.InitialNode#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.InitialNode#getInitialState()
	 * @see #getInitialNode()
	 * @generated
	 */
	EReference getInitialNode_InitialState();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.State#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.State#getOutput()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Output();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.State#getInitialnode <em>Initialnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialnode</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.State#getInitialnode()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Initialnode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslmooremachineFactory getDslmooremachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl <em>Moore Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.MooreMachineImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getMooreMachine()
		 * @generated
		 */
		EClass MOORE_MACHINE = eINSTANCE.getMooreMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOORE_MACHINE__NAME = eINSTANCE.getMooreMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Initialnode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOORE_MACHINE__INITIALNODE = eINSTANCE.getMooreMachine_Initialnode();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOORE_MACHINE__EVENT = eINSTANCE.getMooreMachine_Event();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOORE_MACHINE__TRANSITION = eINSTANCE.getMooreMachine_Transition();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOORE_MACHINE__OUTPUT = eINSTANCE.getMooreMachine_Output();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOORE_MACHINE__STATE = eINSTANCE.getMooreMachine_State();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.EventImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRANSITION = eINSTANCE.getEvent_Transition();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.TransitionImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.OutputImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__STATE = eINSTANCE.getOutput_State();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.InitialNodeImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_NODE__INITIAL_STATE = eINSTANCE.getInitialNode_InitialState();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.StateImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.impl.DslmooremachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTPUT = eINSTANCE.getState_Output();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Initialnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INITIALNODE = eINSTANCE.getState_Initialnode();

	}

} //DslmooremachinePackage
