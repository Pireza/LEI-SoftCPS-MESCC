/**
 */
package pt.ipp.isep.mescc.ramde.dslmooremachine.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pt.ipp.isep.mescc.ramde.dslmooremachine.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pt.ipp.isep.mescc.ramde.dslmooremachine.DslmooremachinePackage
 * @generated
 */
public class DslmooremachineValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DslmooremachineValidator INSTANCE = new DslmooremachineValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pt.ipp.isep.mescc.ramde.dslmooremachine";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslmooremachineValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return DslmooremachinePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case DslmooremachinePackage.MOORE_MACHINE:
			return validateMooreMachine((MooreMachine) value, diagnostics, context);
		case DslmooremachinePackage.EVENT:
			return validateEvent((Event) value, diagnostics, context);
		case DslmooremachinePackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case DslmooremachinePackage.OUTPUT:
			return validateOutput((Output) value, diagnostics, context);
		case DslmooremachinePackage.INITIAL_NODE:
			return validateInitialNode((InitialNode) value, diagnostics, context);
		case DslmooremachinePackage.STATE:
			return validateState((State) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine(MooreMachine mooreMachine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mooreMachine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_onlyOneStateMachinePerDiagramIsAllowed(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(
					mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_machineNameMustStartWithUppercase(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_statesNamesShouldBeUnique(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_transitionsNamesShouldBeUnique(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_outputNamesShouldBeUnique(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_eventNamesShouldBeUnique(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_nameMustHaveThirtyCharactersAtMax(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_nameShouldNotContainSpecialCharacters(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_nameShouldNotContainNumbers(mooreMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMooreMachine_twoTransitionsShouldNotTakeTheSameSourceAndEvent(mooreMachine, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyOneStateMachinePerDiagramIsAllowed constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__ONLY_ONE_STATE_MACHINE_PER_DIAGRAM_IS_ALLOWED__EEXPRESSION = "MooreMachine.allInstances() -> size() = 1";

	/**
	 * Validates the onlyOneStateMachinePerDiagramIsAllowed constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_onlyOneStateMachinePerDiagramIsAllowed(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "onlyOneStateMachinePerDiagramIsAllowed",
				MOORE_MACHINE__ONLY_ONE_STATE_MACHINE_PER_DIAGRAM_IS_ALLOWED__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__MACHINE_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION = "self.name.trim().size() >= 3";

	/**
	 * Validates the machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(
			MooreMachine mooreMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				MOORE_MACHINE__MACHINE_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the machineNameMustStartWithUppercase constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__MACHINE_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0";

	/**
	 * Validates the machineNameMustStartWithUppercase constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_machineNameMustStartWithUppercase(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "machineNameMustStartWithUppercase",
				MOORE_MACHINE__MACHINE_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the statesNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__STATES_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION = "self.state -> forAll(s1, s2 | s1 <> s2 implies s1.name.trim().equalsIgnoreCase(s2.name.trim()) = false)";

	/**
	 * Validates the statesNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_statesNamesShouldBeUnique(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "statesNamesShouldBeUnique",
				MOORE_MACHINE__STATES_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the transitionsNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__TRANSITIONS_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION = "self.transition -> forAll(t1, t2 | t1 <> t2 implies t1.name.trim().equalsIgnoreCase(t2.name.trim()) = false)";

	/**
	 * Validates the transitionsNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_transitionsNamesShouldBeUnique(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "transitionsNamesShouldBeUnique",
				MOORE_MACHINE__TRANSITIONS_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the outputNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__OUTPUT_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION = "self.output -> forAll(o1, o2 | o1 <> o2 implies o1.name.trim().equalsIgnoreCase(o2.name.trim()) = false)";

	/**
	 * Validates the outputNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_outputNamesShouldBeUnique(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "outputNamesShouldBeUnique",
				MOORE_MACHINE__OUTPUT_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the eventNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__EVENT_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION = "self.event -> forAll(e1, e2 | e1 <> e2 implies e1.name.trim().equalsIgnoreCase(e2.name.trim()) = false)";

	/**
	 * Validates the eventNamesShouldBeUnique constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_eventNamesShouldBeUnique(MooreMachine mooreMachine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "eventNamesShouldBeUnique",
				MOORE_MACHINE__EVENT_NAMES_SHOULD_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustHaveThirtyCharactersAtMax constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION = "self.name.trim().size() <= 30";

	/**
	 * Validates the nameMustHaveThirtyCharactersAtMax constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_nameMustHaveThirtyCharactersAtMax(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustHaveThirtyCharactersAtMax",
				MOORE_MACHINE__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainSpecialCharacters constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION = "self.name.characters()->forAll(c | '\\\\|!\"@#£$§%&/{[]=}?\\'»«+*¨`´~^.:,;'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainSpecialCharacters constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_nameShouldNotContainSpecialCharacters(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainSpecialCharacters",
				MOORE_MACHINE__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainNumbers constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION = "self.name.characters()->forAll(c | '0123456789'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainNumbers constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_nameShouldNotContainNumbers(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainNumbers",
				MOORE_MACHINE__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the twoTransitionsShouldNotTakeTheSameSourceAndEvent constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOORE_MACHINE__TWO_TRANSITIONS_SHOULD_NOT_TAKE_THE_SAME_SOURCE_AND_EVENT__EEXPRESSION = "self.transition -> forAll(t1, t2 | (t1 <> t2 and t1.event = t2.event implies t1.sourceState <> t2.sourceState) or (t1 <> t2 and t1.sourceState = t2.sourceState implies t1.event <> t2.event))";

	/**
	 * Validates the twoTransitionsShouldNotTakeTheSameSourceAndEvent constraint of '<em>Moore Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMooreMachine_twoTransitionsShouldNotTakeTheSameSourceAndEvent(MooreMachine mooreMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.MOORE_MACHINE, mooreMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "twoTransitionsShouldNotTakeTheSameSourceAndEvent",
				MOORE_MACHINE__TWO_TRANSITIONS_SHOULD_NOT_TAKE_THE_SAME_SOURCE_AND_EVENT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(event,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_eventNameMustStartWithUppercase(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_nameMustHaveThirtyCharactersAtMax(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_nameShouldNotContainSpecialCharacters(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_nameShouldNotContainNumbers(event, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__EVENT_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION = "self.name.trim().size() >= 3";

	/**
	 * Validates the eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(Event event,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				EVENT__EVENT_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the eventNameMustStartWithUppercase constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__EVENT_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0";

	/**
	 * Validates the eventNameMustStartWithUppercase constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_eventNameMustStartWithUppercase(Event event, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "eventNameMustStartWithUppercase",
				EVENT__EVENT_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustHaveThirtyCharactersAtMax constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION = "self.name.trim().size() <= 30";

	/**
	 * Validates the nameMustHaveThirtyCharactersAtMax constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_nameMustHaveThirtyCharactersAtMax(Event event, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustHaveThirtyCharactersAtMax",
				EVENT__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainSpecialCharacters constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION = "self.name.characters()->forAll(c | '\\\\|!\"@#£$§%&/{[]=}?\\'»«+*¨`´~^.:,;'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainSpecialCharacters constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_nameShouldNotContainSpecialCharacters(Event event, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainSpecialCharacters",
				EVENT__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainNumbers constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION = "self.name.characters()->forAll(c | '0123456789'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainNumbers constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_nameShouldNotContainNumbers(Event event, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainNumbers",
				EVENT__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(
					transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_transitionNameMustStartWithUppercase(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_nameMustHaveThirtyCharactersAtMax(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_nameShouldNotContainSpecialCharacters(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_nameShouldNotContainNumbers(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__TRANSITION_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION = "self.name.trim().size() >= 3";

	/**
	 * Validates the transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(
			Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				TRANSITION__TRANSITION_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the transitionNameMustStartWithUppercase constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__TRANSITION_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0";

	/**
	 * Validates the transitionNameMustStartWithUppercase constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_transitionNameMustStartWithUppercase(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "transitionNameMustStartWithUppercase",
				TRANSITION__TRANSITION_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the nameMustHaveThirtyCharactersAtMax constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION = "self.name.trim().size() <= 30";

	/**
	 * Validates the nameMustHaveThirtyCharactersAtMax constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_nameMustHaveThirtyCharactersAtMax(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustHaveThirtyCharactersAtMax",
				TRANSITION__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainSpecialCharacters constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION = "self.name.characters()->forAll(c | '\\\\|!\"@#£$§%&/{[]=}?\\'»«+*¨`´~^.:,;'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainSpecialCharacters constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_nameShouldNotContainSpecialCharacters(Transition transition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainSpecialCharacters",
				TRANSITION__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainNumbers constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION = "self.name.characters()->forAll(c | '0123456789'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainNumbers constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_nameShouldNotContainNumbers(Transition transition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainNumbers",
				TRANSITION__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(output, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOutput_outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(output,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOutput_outputNameMustStartWithUppercase(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOutput_nameMustHaveThirtyCharactersAtMax(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOutput_nameShouldNotContainSpecialCharacters(output, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOutput_nameShouldNotContainNumbers(output, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT__OUTPUT_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION = "self.name.trim().size() >= 3";

	/**
	 * Validates the outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput_outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(Output output,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.OUTPUT, output, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				OUTPUT__OUTPUT_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the outputNameMustStartWithUppercase constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT__OUTPUT_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0";

	/**
	 * Validates the outputNameMustStartWithUppercase constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput_outputNameMustStartWithUppercase(Output output, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.OUTPUT, output, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "outputNameMustStartWithUppercase",
				OUTPUT__OUTPUT_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustHaveThirtyCharactersAtMax constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION = "self.name.trim().size() <= 30";

	/**
	 * Validates the nameMustHaveThirtyCharactersAtMax constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput_nameMustHaveThirtyCharactersAtMax(Output output, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.OUTPUT, output, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustHaveThirtyCharactersAtMax",
				OUTPUT__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainSpecialCharacters constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION = "self.name.characters()->forAll(c | '\\\\|!\"@#£$§%&/{[]=}?\\'»«+*¨`´~^.:,;'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainSpecialCharacters constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput_nameShouldNotContainSpecialCharacters(Output output, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.OUTPUT, output, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainSpecialCharacters",
				OUTPUT__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainNumbers constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION = "self.name.characters()->forAll(c | '0123456789'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainNumbers constraint of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput_nameShouldNotContainNumbers(Output output, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.OUTPUT, output, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainNumbers",
				OUTPUT__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode(InitialNode initialNode, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(state,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_stateNameMustStartWithUppercase(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_stateShouldBeTheTargetOfAtLeastOneTransition(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_stateShouldBeTheSourceOfAtLeastOneTransition(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_nameMustHaveThirtyCharactersAtMax(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_nameShouldNotContainSpecialCharacters(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_nameShouldNotContainNumbers(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__STATE_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION = "self.name.trim().size() >= 3";

	/**
	 * Validates the stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces(State state,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				STATE__STATE_NAME_MUST_HAVE_AT_LEAST_THREE_CHARACTERS_EXCLUDING_REPEATING_EMPTY_SPACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the stateNameMustStartWithUppercase constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__STATE_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0";

	/**
	 * Validates the stateNameMustStartWithUppercase constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_stateNameMustStartWithUppercase(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "stateNameMustStartWithUppercase",
				STATE__STATE_NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the stateShouldBeTheTargetOfAtLeastOneTransition constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__STATE_SHOULD_BE_THE_TARGET_OF_AT_LEAST_ONE_TRANSITION__EEXPRESSION = "self.incoming -> size() >= 1";

	/**
	 * Validates the stateShouldBeTheTargetOfAtLeastOneTransition constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_stateShouldBeTheTargetOfAtLeastOneTransition(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "stateShouldBeTheTargetOfAtLeastOneTransition",
				STATE__STATE_SHOULD_BE_THE_TARGET_OF_AT_LEAST_ONE_TRANSITION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the stateShouldBeTheSourceOfAtLeastOneTransition constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__STATE_SHOULD_BE_THE_SOURCE_OF_AT_LEAST_ONE_TRANSITION__EEXPRESSION = "self.outgoing -> size() >= 1";

	/**
	 * Validates the stateShouldBeTheSourceOfAtLeastOneTransition constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_stateShouldBeTheSourceOfAtLeastOneTransition(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "stateShouldBeTheSourceOfAtLeastOneTransition",
				STATE__STATE_SHOULD_BE_THE_SOURCE_OF_AT_LEAST_ONE_TRANSITION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustHaveThirtyCharactersAtMax constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION = "self.name.trim().size() <= 30";

	/**
	 * Validates the nameMustHaveThirtyCharactersAtMax constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_nameMustHaveThirtyCharactersAtMax(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustHaveThirtyCharactersAtMax",
				STATE__NAME_MUST_HAVE_THIRTY_CHARACTERS_AT_MAX__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainSpecialCharacters constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION = "self.name.characters()->forAll(c | '\\\\|!\"@#£$§%&/{[]=}?\\'»«+*¨`´~^.:,;'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainSpecialCharacters constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_nameShouldNotContainSpecialCharacters(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainSpecialCharacters",
				STATE__NAME_SHOULD_NOT_CONTAIN_SPECIAL_CHARACTERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameShouldNotContainNumbers constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION = "self.name.characters()->forAll(c | '0123456789'.indexOf(c) = 0)";

	/**
	 * Validates the nameShouldNotContainNumbers constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_nameShouldNotContainNumbers(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DslmooremachinePackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameShouldNotContainNumbers",
				STATE__NAME_SHOULD_NOT_CONTAIN_NUMBERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DslmooremachineValidator
