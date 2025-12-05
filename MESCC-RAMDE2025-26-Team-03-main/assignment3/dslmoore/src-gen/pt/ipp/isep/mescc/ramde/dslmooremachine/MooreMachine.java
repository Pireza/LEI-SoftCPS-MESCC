/**
 */
package pt.ipp.isep.mescc.ramde.dslmooremachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moore Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getInitialnode <em>Initialnode</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getOutput <em>Output</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getState <em>State</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneStateMachinePerDiagramIsAllowed machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces machineNameMustStartWithUppercase statesNamesShouldBeUnique transitionsNamesShouldBeUnique outputNamesShouldBeUnique eventNamesShouldBeUnique nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers twoTransitionsShouldNotTakeTheSameSourceAndEvent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onlyOneStateMachinePerDiagramIsAllowed='MooreMachine.allInstances() -&gt; size() = 1' machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces='self.name.trim().size() &gt;= 3' machineNameMustStartWithUppercase='self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0' statesNamesShouldBeUnique='self.state -&gt; forAll(s1, s2 | s1 &lt;&gt; s2 implies s1.name.trim().equalsIgnoreCase(s2.name.trim()) = false)' transitionsNamesShouldBeUnique='self.transition -&gt; forAll(t1, t2 | t1 &lt;&gt; t2 implies t1.name.trim().equalsIgnoreCase(t2.name.trim()) = false)' outputNamesShouldBeUnique='self.output -&gt; forAll(o1, o2 | o1 &lt;&gt; o2 implies o1.name.trim().equalsIgnoreCase(o2.name.trim()) = false)' eventNamesShouldBeUnique='self.event -&gt; forAll(e1, e2 | e1 &lt;&gt; e2 implies e1.name.trim().equalsIgnoreCase(e2.name.trim()) = false)' nameMustHaveThirtyCharactersAtMax='self.name.trim().size() &lt;= 30' nameShouldNotContainSpecialCharacters='self.name.characters()-&gt;forAll(c | \'\\\\|!\"@#\243$\247%&amp;/{[]=}?\\\'\273\253+*\250`\264~^.:,;\'.indexOf(c) = 0)' nameShouldNotContainNumbers='self.name.characters()-&gt;forAll(c | \'0123456789\'.indexOf(c) = 0)' twoTransitionsShouldNotTakeTheSameSourceAndEvent='self.transition -&gt; forAll(t1, t2 | (t1 &lt;&gt; t2 and t1.event = t2.event implies t1.sourceState &lt;&gt; t2.sourceState) or (t1 &lt;&gt; t2 and t1.sourceState = t2.sourceState implies t1.event &lt;&gt; t2.event))'"
 * @generated
 */
public interface MooreMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initialnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialnode</em>' containment reference.
	 * @see #setInitialnode(InitialNode)
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine_Initialnode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialNode getInitialnode();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmooremachine.MooreMachine#getInitialnode <em>Initialnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialnode</em>' containment reference.
	 * @see #getInitialnode()
	 * @generated
	 */
	void setInitialnode(InitialNode value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmooremachine.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmooremachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine_Transition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmooremachine.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmooremachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage#getMooreMachine_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getState();

} // MooreMachine
