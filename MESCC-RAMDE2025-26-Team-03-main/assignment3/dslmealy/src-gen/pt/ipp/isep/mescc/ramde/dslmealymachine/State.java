/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getInitialnode <em>Initialnode</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces stateNameMustStartWithUppercase stateShouldBeTheTargetOfAtLeastOneTransition stateShouldBeTheSourceOfAtLeastOneTransition nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces='self.name.trim().size() &gt;= 3' stateNameMustStartWithUppercase='self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0' stateShouldBeTheTargetOfAtLeastOneTransition='self.incoming -&gt; size() &gt;= 1' stateShouldBeTheSourceOfAtLeastOneTransition='self.outgoing -&gt; size() &gt;= 1' nameMustHaveThirtyCharactersAtMax='self.name.trim().size() &lt;= 30' nameShouldNotContainSpecialCharacters='self.name.characters()-&gt;forAll(c | \'\\\\|!\"@#\243$\247%&amp;/{[]=}?\\\'\273\253+*\250`\264~^.:,;\'.indexOf(c) = 0)' nameShouldNotContainNumbers='self.name.characters()-&gt;forAll(c | \'0123456789\'.indexOf(c) = 0)'"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition}.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getState_Incoming()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getTargetState
	 * @model opposite="targetState" required="true"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition}.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getState_Outgoing()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getSourceState
	 * @model opposite="sourceState" required="true"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Initialnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialnode</em>' reference.
	 * @see #setInitialnode(InitialNode)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getState_Initialnode()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode#getInitialState
	 * @model opposite="initialState"
	 * @generated
	 */
	InitialNode getInitialnode();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getInitialnode <em>Initialnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialnode</em>' reference.
	 * @see #getInitialnode()
	 * @generated
	 */
	void setInitialnode(InitialNode value);

} // State
