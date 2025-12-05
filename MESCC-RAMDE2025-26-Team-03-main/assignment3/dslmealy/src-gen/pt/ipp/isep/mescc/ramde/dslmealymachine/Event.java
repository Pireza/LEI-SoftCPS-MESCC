/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces eventNameMustStartWithUppercase nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces='self.name.trim().size() &gt;= 3' eventNameMustStartWithUppercase='self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0' nameMustHaveThirtyCharactersAtMax='self.name.trim().size() &lt;= 30' nameShouldNotContainSpecialCharacters='self.name.characters()-&gt;forAll(c | \'\\\\|!\"@#\243$\247%&amp;/{[]=}?\\\'\273\253+*\250`\264~^.:,;\'.indexOf(c) = 0)' nameShouldNotContainNumbers='self.name.characters()-&gt;forAll(c | \'0123456789\'.indexOf(c) = 0)'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference list.
	 * The list contents are of type {@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition}.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getEvent_Transition()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.Transition#getEvent
	 * @model opposite="event" required="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Event
