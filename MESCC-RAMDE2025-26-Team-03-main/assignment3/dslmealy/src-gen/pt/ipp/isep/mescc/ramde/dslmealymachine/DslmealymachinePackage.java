/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine;

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
 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DslmealymachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dslmealymachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dslmealymachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dslmealymachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslmealymachinePackage eINSTANCE = pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.MealyMachineImpl <em>Mealy Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.MealyMachineImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getMealyMachine()
	 * @generated
	 */
	int MEALY_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE__TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Initialnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE__INITIALNODE = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE__STATE = 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE__OUTPUT = 5;

	/**
	 * The number of structural features of the '<em>Mealy Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mealy Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = 2;

	/**
	 * The feature id for the '<em><b>Initialnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIALNODE = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.InitialNodeImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 2;

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
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.OutputImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getOutput()
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
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TRANSITION = 1;

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
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.EventImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

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
	 * The meta object id for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.TransitionImpl
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

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
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET_STATE = 3;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_STATE = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine <em>Mealy Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mealy Machine</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine
	 * @generated
	 */
	EClass getMealyMachine();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getName()
	 * @see #getMealyMachine()
	 * @generated
	 */
	EAttribute getMealyMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getEvent()
	 * @see #getMealyMachine()
	 * @generated
	 */
	EReference getMealyMachine_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getTransition()
	 * @see #getMealyMachine()
	 * @generated
	 */
	EReference getMealyMachine_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getInitialnode <em>Initialnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialnode</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getInitialnode()
	 * @see #getMealyMachine()
	 * @generated
	 */
	EReference getMealyMachine_Initialnode();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getState()
	 * @see #getMealyMachine()
	 * @generated
	 */
	EReference getMealyMachine_State();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine#getOutput()
	 * @see #getMealyMachine()
	 * @generated
	 */
	EReference getMealyMachine_Output();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getInitialnode <em>Initialnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialnode</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getInitialnode()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Initialnode();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode#getInitialState()
	 * @see #getInitialNode()
	 * @generated
	 */
	EReference getInitialNode_InitialState();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Output#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Output#getTransition()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Transition();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getTransition()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Transition();

	/**
	 * Returns the meta object for class '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getTargetState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TargetState();

	/**
	 * Returns the meta object for the reference '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source State</em>'.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getSourceState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SourceState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslmealymachineFactory getDslmealymachineFactory();

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
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.MealyMachineImpl <em>Mealy Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.MealyMachineImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getMealyMachine()
		 * @generated
		 */
		EClass MEALY_MACHINE = eINSTANCE.getMealyMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEALY_MACHINE__NAME = eINSTANCE.getMealyMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_MACHINE__EVENT = eINSTANCE.getMealyMachine_Event();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_MACHINE__TRANSITION = eINSTANCE.getMealyMachine_Transition();

		/**
		 * The meta object literal for the '<em><b>Initialnode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_MACHINE__INITIALNODE = eINSTANCE.getMealyMachine_Initialnode();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_MACHINE__STATE = eINSTANCE.getMealyMachine_State();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_MACHINE__OUTPUT = eINSTANCE.getMealyMachine_Output();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.StateImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getState()
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

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.InitialNodeImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getInitialNode()
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
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.OutputImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getOutput()
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
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__TRANSITION = eINSTANCE.getOutput_Transition();

		/**
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.EventImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getEvent()
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
		 * The meta object literal for the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.TransitionImpl
		 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.impl.DslmealymachinePackageImpl#getTransition()
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
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

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

	}

} //DslmealymachinePackage
