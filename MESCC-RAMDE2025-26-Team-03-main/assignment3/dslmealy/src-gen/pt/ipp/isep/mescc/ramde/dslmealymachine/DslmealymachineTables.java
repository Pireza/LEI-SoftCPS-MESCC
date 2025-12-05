/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /pt.ipp.isep.mescc.ramde.dslmealymachine/model/dslmealymachine.ecore
 * using:
 *   /pt.ipp.isep.mescc.ramde.dslmealymachine/model/dslmealymachine.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package pt.ipp.isep.mescc.ramde.dslmealymachine;

import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
// import pt.ipp.isep.mescc.ramde.dslmealymachine.DslmealymachineTables;

/**
 * DslmealymachineTables provides the dispatch tables for the dslmealymachine for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DslmealymachineTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DslmealymachinePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DslmealymachineTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Event = new EcoreExecutorType(DslmealymachinePackage.Literals.EVENT, PACKAGE, 0);
		public static final EcoreExecutorType _InitialNode = new EcoreExecutorType(DslmealymachinePackage.Literals.INITIAL_NODE, PACKAGE, 0);
		public static final EcoreExecutorType _MealyMachine = new EcoreExecutorType(DslmealymachinePackage.Literals.MEALY_MACHINE, PACKAGE, 0);
		public static final EcoreExecutorType _Output = new EcoreExecutorType(DslmealymachinePackage.Literals.OUTPUT, PACKAGE, 0);
		public static final EcoreExecutorType _State = new EcoreExecutorType(DslmealymachinePackage.Literals.STATE, PACKAGE, 0);
		public static final EcoreExecutorType _Transition = new EcoreExecutorType(DslmealymachinePackage.Literals.TRANSITION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Event,
			_InitialNode,
			_MealyMachine,
			_Output,
			_State,
			_Transition
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Event__Event = new ExecutorFragment(Types._Event, DslmealymachineTables.Types._Event);
		private static final ExecutorFragment _Event__OclAny = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Event__OclElement = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InitialNode__InitialNode = new ExecutorFragment(Types._InitialNode, DslmealymachineTables.Types._InitialNode);
		private static final ExecutorFragment _InitialNode__OclAny = new ExecutorFragment(Types._InitialNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InitialNode__OclElement = new ExecutorFragment(Types._InitialNode, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MealyMachine__MealyMachine = new ExecutorFragment(Types._MealyMachine, DslmealymachineTables.Types._MealyMachine);
		private static final ExecutorFragment _MealyMachine__OclAny = new ExecutorFragment(Types._MealyMachine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MealyMachine__OclElement = new ExecutorFragment(Types._MealyMachine, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Output__OclAny = new ExecutorFragment(Types._Output, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Output__OclElement = new ExecutorFragment(Types._Output, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Output__Output = new ExecutorFragment(Types._Output, DslmealymachineTables.Types._Output);

		private static final ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _State__State = new ExecutorFragment(Types._State, DslmealymachineTables.Types._State);

		private static final ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, DslmealymachineTables.Types._Transition);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Event__name = new EcoreExecutorProperty(DslmealymachinePackage.Literals.EVENT__NAME, Types._Event, 0);
		public static final ExecutorProperty _Event__transition = new EcoreExecutorProperty(DslmealymachinePackage.Literals.EVENT__TRANSITION, Types._Event, 1);
		public static final ExecutorProperty _Event__MealyMachine__event = new ExecutorPropertyWithImplementation("MealyMachine", Types._Event, 2, new EcoreLibraryOppositeProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__EVENT));

		public static final ExecutorProperty _InitialNode__initialState = new EcoreExecutorProperty(DslmealymachinePackage.Literals.INITIAL_NODE__INITIAL_STATE, Types._InitialNode, 0);
		public static final ExecutorProperty _InitialNode__MealyMachine__initialnode = new ExecutorPropertyWithImplementation("MealyMachine", Types._InitialNode, 1, new EcoreLibraryOppositeProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__INITIALNODE));

		public static final ExecutorProperty _MealyMachine__event = new EcoreExecutorProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__EVENT, Types._MealyMachine, 0);
		public static final ExecutorProperty _MealyMachine__initialnode = new EcoreExecutorProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__INITIALNODE, Types._MealyMachine, 1);
		public static final ExecutorProperty _MealyMachine__name = new EcoreExecutorProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__NAME, Types._MealyMachine, 2);
		public static final ExecutorProperty _MealyMachine__output = new EcoreExecutorProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__OUTPUT, Types._MealyMachine, 3);
		public static final ExecutorProperty _MealyMachine__state = new EcoreExecutorProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__STATE, Types._MealyMachine, 4);
		public static final ExecutorProperty _MealyMachine__transition = new EcoreExecutorProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__TRANSITION, Types._MealyMachine, 5);

		public static final ExecutorProperty _Output__name = new EcoreExecutorProperty(DslmealymachinePackage.Literals.OUTPUT__NAME, Types._Output, 0);
		public static final ExecutorProperty _Output__transition = new EcoreExecutorProperty(DslmealymachinePackage.Literals.OUTPUT__TRANSITION, Types._Output, 1);
		public static final ExecutorProperty _Output__MealyMachine__output = new ExecutorPropertyWithImplementation("MealyMachine", Types._Output, 2, new EcoreLibraryOppositeProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__OUTPUT));

		public static final ExecutorProperty _State__incoming = new EcoreExecutorProperty(DslmealymachinePackage.Literals.STATE__INCOMING, Types._State, 0);
		public static final ExecutorProperty _State__initialnode = new EcoreExecutorProperty(DslmealymachinePackage.Literals.STATE__INITIALNODE, Types._State, 1);
		public static final ExecutorProperty _State__name = new EcoreExecutorProperty(DslmealymachinePackage.Literals.STATE__NAME, Types._State, 2);
		public static final ExecutorProperty _State__outgoing = new EcoreExecutorProperty(DslmealymachinePackage.Literals.STATE__OUTGOING, Types._State, 3);
		public static final ExecutorProperty _State__MealyMachine__state = new ExecutorPropertyWithImplementation("MealyMachine", Types._State, 4, new EcoreLibraryOppositeProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__STATE));

		public static final ExecutorProperty _Transition__event = new EcoreExecutorProperty(DslmealymachinePackage.Literals.TRANSITION__EVENT, Types._Transition, 0);
		public static final ExecutorProperty _Transition__name = new EcoreExecutorProperty(DslmealymachinePackage.Literals.TRANSITION__NAME, Types._Transition, 1);
		public static final ExecutorProperty _Transition__output = new EcoreExecutorProperty(DslmealymachinePackage.Literals.TRANSITION__OUTPUT, Types._Transition, 2);
		public static final ExecutorProperty _Transition__sourceState = new EcoreExecutorProperty(DslmealymachinePackage.Literals.TRANSITION__SOURCE_STATE, Types._Transition, 3);
		public static final ExecutorProperty _Transition__targetState = new EcoreExecutorProperty(DslmealymachinePackage.Literals.TRANSITION__TARGET_STATE, Types._Transition, 4);
		public static final ExecutorProperty _Transition__MealyMachine__transition = new ExecutorPropertyWithImplementation("MealyMachine", Types._Transition, 5, new EcoreLibraryOppositeProperty(DslmealymachinePackage.Literals.MEALY_MACHINE__TRANSITION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Event =
			{
				Fragments._Event__OclAny /* 0 */,
				Fragments._Event__OclElement /* 1 */,
				Fragments._Event__Event /* 2 */
			};
		private static final int /*@NonNull*/ [] __Event = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InitialNode =
			{
				Fragments._InitialNode__OclAny /* 0 */,
				Fragments._InitialNode__OclElement /* 1 */,
				Fragments._InitialNode__InitialNode /* 2 */
			};
		private static final int /*@NonNull*/ [] __InitialNode = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MealyMachine =
			{
				Fragments._MealyMachine__OclAny /* 0 */,
				Fragments._MealyMachine__OclElement /* 1 */,
				Fragments._MealyMachine__MealyMachine /* 2 */
			};
		private static final int /*@NonNull*/ [] __MealyMachine = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Output =
			{
				Fragments._Output__OclAny /* 0 */,
				Fragments._Output__OclElement /* 1 */,
				Fragments._Output__Output /* 2 */
			};
		private static final int /*@NonNull*/ [] __Output = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__State /* 2 */
			};
		private static final int /*@NonNull*/ [] __State = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Transition /* 2 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Event.initFragments(_Event, __Event);
			Types._InitialNode.initFragments(_InitialNode, __InitialNode);
			Types._MealyMachine.initFragments(_MealyMachine, __MealyMachine);
			Types._Output.initFragments(_Output, __Output);
			Types._State.initFragments(_State, __State);
			Types._Transition.initFragments(_Transition, __Transition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Event__Event = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InitialNode__InitialNode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InitialNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InitialNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MealyMachine__MealyMachine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MealyMachine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MealyMachine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Output__Output = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Output__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Output__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _State__State = {};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Event__Event.initOperations(_Event__Event);
			Fragments._Event__OclAny.initOperations(_Event__OclAny);
			Fragments._Event__OclElement.initOperations(_Event__OclElement);

			Fragments._InitialNode__InitialNode.initOperations(_InitialNode__InitialNode);
			Fragments._InitialNode__OclAny.initOperations(_InitialNode__OclAny);
			Fragments._InitialNode__OclElement.initOperations(_InitialNode__OclElement);

			Fragments._MealyMachine__MealyMachine.initOperations(_MealyMachine__MealyMachine);
			Fragments._MealyMachine__OclAny.initOperations(_MealyMachine__OclAny);
			Fragments._MealyMachine__OclElement.initOperations(_MealyMachine__OclElement);

			Fragments._Output__OclAny.initOperations(_Output__OclAny);
			Fragments._Output__OclElement.initOperations(_Output__OclElement);
			Fragments._Output__Output.initOperations(_Output__Output);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__State.initOperations(_State__State);

			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Event = {
			DslmealymachineTables.Properties._Event__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslmealymachineTables.Properties._Event__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InitialNode = {
			DslmealymachineTables.Properties._InitialNode__initialState,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MealyMachine = {
			DslmealymachineTables.Properties._MealyMachine__event,
			DslmealymachineTables.Properties._MealyMachine__initialnode,
			DslmealymachineTables.Properties._MealyMachine__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslmealymachineTables.Properties._MealyMachine__output,
			DslmealymachineTables.Properties._MealyMachine__state,
			DslmealymachineTables.Properties._MealyMachine__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Output = {
			DslmealymachineTables.Properties._Output__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslmealymachineTables.Properties._Output__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _State = {
			DslmealymachineTables.Properties._State__incoming,
			DslmealymachineTables.Properties._State__initialnode,
			DslmealymachineTables.Properties._State__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslmealymachineTables.Properties._State__outgoing
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Transition = {
			DslmealymachineTables.Properties._Transition__event,
			DslmealymachineTables.Properties._Transition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslmealymachineTables.Properties._Transition__output,
			DslmealymachineTables.Properties._Transition__sourceState,
			DslmealymachineTables.Properties._Transition__targetState
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Event__Event.initProperties(_Event);
			Fragments._InitialNode__InitialNode.initProperties(_InitialNode);
			Fragments._MealyMachine__MealyMachine.initProperties(_MealyMachine);
			Fragments._Output__Output.initProperties(_Output);
			Fragments._State__State.initProperties(_State);
			Fragments._Transition__Transition.initProperties(_Transition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslmealymachineTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DslmealymachineTables();
	}

	private DslmealymachineTables() {
		super(DslmealymachinePackage.eNS_URI);
	}
}
