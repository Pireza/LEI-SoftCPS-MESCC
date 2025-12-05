/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces transitionNameMustStartWithUppercase nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces='self.name.trim().size() &gt;= 3' transitionNameMustStartWithUppercase='self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0' nameMustHaveThirtyCharactersAtMax='self.name.trim().size() &lt;= 30' nameShouldNotContainSpecialCharacters='self.name.characters()-&gt;forAll(c | \'\\\\|!\"@#\243$\247%&amp;/{[]=}?\\\'\273\253+*\250`\264~^.:,;\'.indexOf(c) = 0)' nameShouldNotContainNumbers='self.name.characters()-&gt;forAll(c | \'0123456789\'.indexOf(c) = 0)'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getTransition_Event()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getTransition
	 * @model opposite="transition" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Output#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getTransition_Output()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Output#getTransition
	 * @model opposite="transition" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getTransition_TargetState()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(State)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getTransition_SourceState()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSourceState();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(State value);

} // Transition
