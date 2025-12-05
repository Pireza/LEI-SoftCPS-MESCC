
package org.jeasy.states.samples.ess;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.TransitionBuilder;
import org.jeasy.states.core.FiniteStateMachineBuilder;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class Launcher {
    public static void main(String[] args) throws FiniteStateMachineException {

        State idle = new State("Idle");
        State updateStatus = new State("Update Status");
        State processEvent = new State("Process Event");
        State validateEvent = new State("Validate Event");
        State activateAlarm = new State("Activate Alarm");
        State recordData = new State("Record Data");
        
        Set<State> states = new HashSet<>();
        states.add(idle);
        states.add(updateStatus);
        states.add(processEvent);
        states.add(validateEvent);
        states.add(activateAlarm);
        states.add(recordData);
        
        Transition updateStatusToRecordData = new TransitionBuilder()
            .name("Update Status To Record Data")
            .sourceState(updateStatus)
            .eventType(StatusUpdatedEvent.class)
            .eventHandler(new UpdateStatusToRecordData())
            .targetState(recordData)
            .build();

        Transition validateEventToIdle = new TransitionBuilder()
            .name("Validate Event To Idle")
            .sourceState(validateEvent)
            .eventType(EventInvalidEvent.class)
            .eventHandler(new ValidateEventToIdle())
            .targetState(idle)
            .build();

        Transition processEventToValidateEvent = new TransitionBuilder()
            .name("Process Event To Validate Event")
            .sourceState(processEvent)
            .eventType(SendEventForValidationEvent.class)
            .eventHandler(new ProcessEventToValidateEvent())
            .targetState(validateEvent)
            .build();

        Transition activateAlarmToUpdateStatus = new TransitionBuilder()
            .name("Activate Alarm To Update Status")
            .sourceState(activateAlarm)
            .eventType(AlarmActivatedEvent.class)
            .eventHandler(new ActivateAlarmToUpdateStatus())
            .targetState(updateStatus)
            .build();

        Transition idleToProcessEvent = new TransitionBuilder()
            .name("Idle To Process Event")
            .sourceState(idle)
            .eventType(ReceiveEventEvent.class)
            .eventHandler(new IdleToProcessEvent())
            .targetState(processEvent)
            .build();

        Transition recordDataToIdle = new TransitionBuilder()
            .name("Record Data To Idle")
            .sourceState(recordData)
            .eventType(DataRecordedEvent.class)
            .eventHandler(new RecordDataToIdle())
            .targetState(idle)
            .build();

        Transition validateEventToActivateAlarm = new TransitionBuilder()
            .name("Validate Event To Activate Alarm")
            .sourceState(validateEvent)
            .eventType(EventValidEvent.class)
            .eventHandler(new ValidateEventToActivateAlarm())
            .targetState(activateAlarm)
            .build();

        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, idle)
        .registerTransition(updateStatusToRecordData)
        .registerTransition(validateEventToIdle)
        .registerTransition(processEventToValidateEvent)
        .registerTransition(activateAlarmToUpdateStatus)
        .registerTransition(idleToProcessEvent)
        .registerTransition(recordDataToIdle)
        .registerTransition(validateEventToActivateAlarm)
        .build();
        
        System.out.println("Initial State : " + fsm.getCurrentState().getName());
        
        Scanner scanner = new Scanner(System.in);
       	System.out.println("Which event do you want to fire? (Enter the number)");

		System.out.println("1. Send Event For Validation Event");
		System.out.println("2. Data Recorded Event");
		System.out.println("3. Alarm Activated Event");
		System.out.println("4. Status Updated Event");
		System.out.println("5. Receive Event Event");
		System.out.println("6. Event Valid Event");
		System.out.println("7. Event Invalid Event");

		System.out.println("\nPress 'q' to quit.\n");

		while (true) {
    		System.out.print("Enter your choice: ");
    		String input = scanner.nextLine();

    		if (input.trim().equals("1")) {
				System.out.println("Firing Send Event For Validation Event...");
       			fsm.fire(new SendEventForValidationEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}
    		if (input.trim().equals("2")) {
				System.out.println("Firing Data Recorded Event...");
       			fsm.fire(new DataRecordedEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}
    		if (input.trim().equals("3")) {
				System.out.println("Firing Alarm Activated Event...");
       			fsm.fire(new AlarmActivatedEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}
    		if (input.trim().equals("4")) {
				System.out.println("Firing Status Updated Event...");
       			fsm.fire(new StatusUpdatedEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}
    		if (input.trim().equals("5")) {
				System.out.println("Firing Receive Event Event...");
       			fsm.fire(new ReceiveEventEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}
    		if (input.trim().equals("6")) {
				System.out.println("Firing Event Valid Event...");
       			fsm.fire(new EventValidEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}
    		if (input.trim().equals("7")) {
				System.out.println("Firing Event Invalid Event...");
       			fsm.fire(new EventInvalidEvent());
        		System.out.println("Current State : " + fsm.getCurrentState().getName());
    		}

    		if (input.trim().equals("q")) {
        		System.out.println("Bye!");
        		System.exit(0);
    		}
            System.out.println();
    	}
	}
}
