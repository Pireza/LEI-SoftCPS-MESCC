/**
 */
package pt.ipp.isep.mescc.ramde.dslmealymachine.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachineFactory;
import pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage;
import pt.ipp.isep.mescc.ramde.dslmealymachine.Event;
import pt.ipp.isep.mescc.ramde.dslmealymachine.InitialNode;
import pt.ipp.isep.mescc.ramde.dslmealymachine.MealyMachine;
import pt.ipp.isep.mescc.ramde.dslmealymachine.Output;
import pt.ipp.isep.mescc.ramde.dslmealymachine.State;
import pt.ipp.isep.mescc.ramde.dslmealymachine.Transition;
import pt.ipp.isep.mescc.ramde.dslmealymachine.util.DslmealymachineValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslmealymachinePackageImpl extends EPackageImpl implements DslmealymachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mealyMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslmealymachinePackageImpl() {
		super(eNS_URI, DslmealymachineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DslmealymachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslmealymachinePackage init() {
		if (isInited)
			return (DslmealymachinePackage) EPackage.Registry.INSTANCE.getEPackage(DslmealymachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDslmealymachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DslmealymachinePackageImpl theDslmealymachinePackage = registeredDslmealymachinePackage instanceof DslmealymachinePackageImpl
				? (DslmealymachinePackageImpl) registeredDslmealymachinePackage
				: new DslmealymachinePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDslmealymachinePackage.createPackageContents();

		// Initialize created meta-data
		theDslmealymachinePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDslmealymachinePackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return DslmealymachineValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDslmealymachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslmealymachinePackage.eNS_URI, theDslmealymachinePackage);
		return theDslmealymachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMealyMachine() {
		return mealyMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMealyMachine_Name() {
		return (EAttribute) mealyMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyMachine_Event() {
		return (EReference) mealyMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyMachine_Transition() {
		return (EReference) mealyMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyMachine_Initialnode() {
		return (EReference) mealyMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyMachine_State() {
		return (EReference) mealyMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyMachine_Output() {
		return (EReference) mealyMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Name() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Incoming() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Outgoing() {
		return (EReference) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Initialnode() {
		return (EReference) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialNode_InitialState() {
		return (EReference) initialNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Name() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Transition() {
		return (EReference) outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Transition() {
		return (EReference) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Name() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Event() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Output() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_TargetState() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_SourceState() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslmealymachineFactory getDslmealymachineFactory() {
		return (DslmealymachineFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		mealyMachineEClass = createEClass(MEALY_MACHINE);
		createEAttribute(mealyMachineEClass, MEALY_MACHINE__NAME);
		createEReference(mealyMachineEClass, MEALY_MACHINE__EVENT);
		createEReference(mealyMachineEClass, MEALY_MACHINE__TRANSITION);
		createEReference(mealyMachineEClass, MEALY_MACHINE__INITIALNODE);
		createEReference(mealyMachineEClass, MEALY_MACHINE__STATE);
		createEReference(mealyMachineEClass, MEALY_MACHINE__OUTPUT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
		createEReference(stateEClass, STATE__INCOMING);
		createEReference(stateEClass, STATE__OUTGOING);
		createEReference(stateEClass, STATE__INITIALNODE);

		initialNodeEClass = createEClass(INITIAL_NODE);
		createEReference(initialNodeEClass, INITIAL_NODE__INITIAL_STATE);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__NAME);
		createEReference(outputEClass, OUTPUT__TRANSITION);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);
		createEReference(eventEClass, EVENT__TRANSITION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEReference(transitionEClass, TRANSITION__EVENT);
		createEReference(transitionEClass, TRANSITION__OUTPUT);
		createEReference(transitionEClass, TRANSITION__TARGET_STATE);
		createEReference(transitionEClass, TRANSITION__SOURCE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mealyMachineEClass, MealyMachine.class, "MealyMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMealyMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, MealyMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyMachine_Event(), this.getEvent(), null, "event", null, 1, -1, MealyMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyMachine_Transition(), this.getTransition(), null, "transition", null, 1, -1,
				MealyMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyMachine_Initialnode(), this.getInitialNode(), null, "initialnode", null, 1, 1,
				MealyMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyMachine_State(), this.getState(), null, "state", null, 2, -1, MealyMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyMachine_Output(), this.getOutput(), null, "output", null, 1, -1, MealyMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Incoming(), this.getTransition(), this.getTransition_TargetState(), "incoming", null, 1,
				-1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Outgoing(), this.getTransition(), this.getTransition_SourceState(), "outgoing", null, 1,
				-1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Initialnode(), this.getInitialNode(), this.getInitialNode_InitialState(), "initialnode",
				null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialNode_InitialState(), this.getState(), this.getState_Initialnode(), "initialState",
				null, 1, 1, InitialNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Output.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Transition(), this.getTransition(), this.getTransition_Output(), "transition", null, 1,
				-1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Transition(), this.getTransition(), this.getTransition_Event(), "transition", null, 1,
				-1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Event(), this.getEvent(), this.getEvent_Transition(), "event", null, 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Output(), this.getOutput(), this.getOutput_Transition(), "output", null, 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TargetState(), this.getState(), this.getState_Incoming(), "targetState", null, 1,
				1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_SourceState(), this.getState(), this.getState_Outgoing(), "sourceState", null, 1,
				1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(mealyMachineEClass, source, new String[] { "constraints",
				"onlyOneStateMachinePerDiagramIsAllowed machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces machineNameMustStartWithUppercase statesNamesShouldBeUnique transitionsNamesShouldBeUnique outputNamesShouldBeUnique eventNamesShouldBeUnique nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers twoTransitionsShouldNotTakeTheSameSourceAndEvent" });
		addAnnotation(stateEClass, source, new String[] { "constraints",
				"stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces stateNameMustStartWithUppercase stateShouldBeTheTargetOfAtLeastOneTransition stateShouldBeTheSourceOfAtLeastOneTransition nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers" });
		addAnnotation(outputEClass, source, new String[] { "constraints",
				"outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces outputNameMustStartWithUppercase nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers" });
		addAnnotation(eventEClass, source, new String[] { "constraints",
				"eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces eventNameMustStartWithUppercase nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers" });
		addAnnotation(transitionEClass, source, new String[] { "constraints",
				"transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces transitionNameMustStartWithUppercase nameMustHaveThirtyCharactersAtMax nameShouldNotContainSpecialCharacters nameShouldNotContainNumbers" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(mealyMachineEClass, source, new String[] { "onlyOneStateMachinePerDiagramIsAllowed",
				"MealyMachine.allInstances() -> size() = 1",
				"machineNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				"self.name.trim().size() >= 3", "machineNameMustStartWithUppercase",
				"self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0",
				"statesNamesShouldBeUnique",
				"self.state -> forAll(s1, s2 | s1 <> s2 implies s1.name.trim().equalsIgnoreCase(s2.name.trim()) = false)",
				"transitionsNamesShouldBeUnique",
				"self.transition -> forAll(t1, t2 | t1 <> t2 implies t1.name.trim().equalsIgnoreCase(t2.name.trim()) = false)",
				"outputNamesShouldBeUnique",
				"self.output -> forAll(o1, o2 | o1 <> o2 implies o1.name.trim().equalsIgnoreCase(o2.name.trim()) = false)",
				"eventNamesShouldBeUnique",
				"self.event -> forAll(e1, e2 | e1 <> e2 implies e1.name.trim().equalsIgnoreCase(e2.name.trim()) = false)",
				"nameMustHaveThirtyCharactersAtMax", "self.name.trim().size() <= 30",
				"nameShouldNotContainSpecialCharacters",
				"self.name.characters()->forAll(c | \'\\\\|!\"@#\u00a3$\u00a7%&/{[]=}?\\\'\u00bb\u00ab+*\u00a8`\u00b4~^.:,;\'.indexOf(c) = 0)",
				"nameShouldNotContainNumbers", "self.name.characters()->forAll(c | \'0123456789\'.indexOf(c) = 0)",
				"twoTransitionsShouldNotTakeTheSameSourceAndEvent",
				"self.transition -> forAll(t1, t2 | (t1 <> t2 and t1.event = t2.event implies t1.sourceState <> t2.sourceState) or (t1 <> t2 and t1.sourceState = t2.sourceState implies t1.event <> t2.event))" });
		addAnnotation(stateEClass, source, new String[] {
				"stateNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces", "self.name.trim().size() >= 3",
				"stateNameMustStartWithUppercase",
				"self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0",
				"stateShouldBeTheTargetOfAtLeastOneTransition", "self.incoming -> size() >= 1",
				"stateShouldBeTheSourceOfAtLeastOneTransition", "self.outgoing -> size() >= 1",
				"nameMustHaveThirtyCharactersAtMax", "self.name.trim().size() <= 30",
				"nameShouldNotContainSpecialCharacters",
				"self.name.characters()->forAll(c | \'\\\\|!\"@#\u00a3$\u00a7%&/{[]=}?\\\'\u00bb\u00ab+*\u00a8`\u00b4~^.:,;\'.indexOf(c) = 0)",
				"nameShouldNotContainNumbers", "self.name.characters()->forAll(c | \'0123456789\'.indexOf(c) = 0)" });
		addAnnotation(outputEClass, source, new String[] {
				"outputNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces", "self.name.trim().size() >= 3",
				"outputNameMustStartWithUppercase",
				"self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0",
				"nameMustHaveThirtyCharactersAtMax", "self.name.trim().size() <= 30",
				"nameShouldNotContainSpecialCharacters",
				"self.name.characters()->forAll(c | \'\\\\|!\"@#\u00a3$\u00a7%&/{[]=}?\\\'\u00bb\u00ab+*\u00a8`\u00b4~^.:,;\'.indexOf(c) = 0)",
				"nameShouldNotContainNumbers", "self.name.characters()->forAll(c | \'0123456789\'.indexOf(c) = 0)" });
		addAnnotation(eventEClass, source, new String[] {
				"eventNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces", "self.name.trim().size() >= 3",
				"eventNameMustStartWithUppercase",
				"self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0",
				"nameMustHaveThirtyCharactersAtMax", "self.name.trim().size() <= 30",
				"nameShouldNotContainSpecialCharacters",
				"self.name.characters()->forAll(c | \'\\\\|!\"@#\u00a3$\u00a7%&/{[]=}?\\\'\u00bb\u00ab+*\u00a8`\u00b4~^.:,;\'.indexOf(c) = 0)",
				"nameShouldNotContainNumbers", "self.name.characters()->forAll(c | \'0123456789\'.indexOf(c) = 0)" });
		addAnnotation(transitionEClass, source, new String[] {
				"transitionNameMustHaveAtLeastThreeCharactersExcludingRepeatingEmptySpaces",
				"self.name.trim().size() >= 3", "transitionNameMustStartWithUppercase",
				"self.name.trim().substring(1, 1).toUpper().compareTo(self.name.trim().substring(1, 1)) = 0",
				"nameMustHaveThirtyCharactersAtMax", "self.name.trim().size() <= 30",
				"nameShouldNotContainSpecialCharacters",
				"self.name.characters()->forAll(c | \'\\\\|!\"@#\u00a3$\u00a7%&/{[]=}?\\\'\u00bb\u00ab+*\u00a8`\u00b4~^.:,;\'.indexOf(c) = 0)",
				"nameShouldNotContainNumbers", "self.name.characters()->forAll(c | \'0123456789\'.indexOf(c) = 0)" });
	}

} //DslmealymachinePackageImpl
