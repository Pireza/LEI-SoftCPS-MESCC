/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getInitialNode()
 * @model
 * @generated
 */
public interface InitialNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.State#getInitialnode <em>Initialnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#getInitialNode_InitialState()
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.State#getInitialnode
	 * @model opposite="initialnode" required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

} // InitialNode
