
package org.jeasy.states.samples.essTests;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;
import org.junit.Test;
import org.junit.Before;

import java.util.Set;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

import org.jeasy.states.samples.ess.ReceiveEventEvent;
import org.jeasy.states.samples.ess.IdleToProcessEvent;
import org.jeasy.states.samples.ess.DataRecordedEvent;
import org.jeasy.states.samples.ess.RecordDataToIdle;
import org.jeasy.states.samples.ess.AlarmActivatedEvent;
import org.jeasy.states.samples.ess.ActivateAlarmToUpdateStatus;
import org.jeasy.states.samples.ess.SendEventForValidationEvent;
import org.jeasy.states.samples.ess.ProcessEventToValidateEvent;
import org.jeasy.states.samples.ess.EventValidEvent;
import org.jeasy.states.samples.ess.ValidateEventToActivateAlarm;
import org.jeasy.states.samples.ess.EventInvalidEvent;
import org.jeasy.states.samples.ess.ValidateEventToIdle;
import org.jeasy.states.samples.ess.StatusUpdatedEvent;
import org.jeasy.states.samples.ess.UpdateStatusToRecordData;

public class ControlSystemStateMachineTest {
    private State recordData;
    private State validateEvent;
    private State processEvent;
    private State idle;
    private State updateStatus;
    private State activateAlarm;
    private Set<State> states;

    private Transition idleToProcessEvent;
    private Transition recordDataToIdle;
    private Transition activateAlarmToUpdateStatus;
    private Transition processEventToValidateEvent;
    private Transition validateEventToActivateAlarm;
    private Transition validateEventToIdle;
    private Transition updateStatusToRecordData;

    @Before
    public void setUp() {
        // Create States
        recordData = new State("Record Data");
        validateEvent = new State("Validate Event");
        processEvent = new State("Process Event");
        idle = new State("Idle");
        updateStatus = new State("Update Status");
        activateAlarm = new State("Activate Alarm");

        states = new HashSet<>();
        states.add(recordData);
        states.add(validateEvent);
        states.add(processEvent);
        states.add(idle);
        states.add(updateStatus);
        states.add(activateAlarm);

        // Create Transitions
        idleToProcessEvent = new TransitionBuilder()
            .name("Idle To Process Event")
            .sourceState(idle)
            .eventType(ReceiveEventEvent.class)
            .eventHandler(new IdleToProcessEvent())
            .targetState(processEvent)
            .build();

        recordDataToIdle = new TransitionBuilder()
            .name("Record Data To Idle")
            .sourceState(recordData)
            .eventType(DataRecordedEvent.class)
            .eventHandler(new RecordDataToIdle())
            .targetState(idle)
            .build();

        activateAlarmToUpdateStatus = new TransitionBuilder()
            .name("Activate Alarm To Update Status")
            .sourceState(activateAlarm)
            .eventType(AlarmActivatedEvent.class)
            .eventHandler(new ActivateAlarmToUpdateStatus())
            .targetState(updateStatus)
            .build();

        processEventToValidateEvent = new TransitionBuilder()
            .name("Process Event To Validate Event")
            .sourceState(processEvent)
            .eventType(SendEventForValidationEvent.class)
            .eventHandler(new ProcessEventToValidateEvent())
            .targetState(validateEvent)
            .build();

        validateEventToActivateAlarm = new TransitionBuilder()
            .name("Validate Event To Activate Alarm")
            .sourceState(validateEvent)
            .eventType(EventValidEvent.class)
            .eventHandler(new ValidateEventToActivateAlarm())
            .targetState(activateAlarm)
            .build();

        validateEventToIdle = new TransitionBuilder()
            .name("Validate Event To Idle")
            .sourceState(validateEvent)
            .eventType(EventInvalidEvent.class)
            .eventHandler(new ValidateEventToIdle())
            .targetState(idle)
            .build();

        updateStatusToRecordData = new TransitionBuilder()
            .name("Update Status To Record Data")
            .sourceState(updateStatus)
            .eventType(StatusUpdatedEvent.class)
            .eventHandler(new UpdateStatusToRecordData())
            .targetState(recordData)
            .build();

    }


    @Test
    public void shouldChangeTransition_IdleToProcessEvent() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, idle)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new ReceiveEventEvent());

        assertEquals(
            fsm.getCurrentState(),
            processEvent
        );
    }

    @Test
    public void shouldChangeTransition_RecordDataToIdle() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, recordData)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new DataRecordedEvent());

        assertEquals(
            fsm.getCurrentState(),
            idle
        );
    }

    @Test
    public void shouldChangeTransition_ActivateAlarmToUpdateStatus() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, activateAlarm)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new AlarmActivatedEvent());

        assertEquals(
            fsm.getCurrentState(),
            updateStatus
        );
    }

    @Test
    public void shouldChangeTransition_ProcessEventToValidateEvent() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, processEvent)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new SendEventForValidationEvent());

        assertEquals(
            fsm.getCurrentState(),
            validateEvent
        );
    }

    @Test
    public void shouldChangeTransition_ValidateEventToActivateAlarm() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, validateEvent)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new EventValidEvent());

        assertEquals(
            fsm.getCurrentState(),
            activateAlarm
        );
    }

    @Test
    public void shouldChangeTransition_ValidateEventToIdle() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, validateEvent)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new EventInvalidEvent());

        assertEquals(
            fsm.getCurrentState(),
            idle
        );
    }

    @Test
    public void shouldChangeTransition_UpdateStatusToRecordData() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, updateStatus)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        fsm.fire(new StatusUpdatedEvent());

        assertEquals(
            fsm.getCurrentState(),
            recordData
        );
    }


    @Test
    public void shouldNotChangeState_InvalidTransitions() throws FiniteStateMachineException {
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, idle)
            .registerTransition(idleToProcessEvent)
            .registerTransition(recordDataToIdle)
            .registerTransition(activateAlarmToUpdateStatus)
            .registerTransition(processEventToValidateEvent)
            .registerTransition(validateEventToActivateAlarm)
            .registerTransition(validateEventToIdle)
            .registerTransition(updateStatusToRecordData)
            .build();

        // Pick event of a transition that doesn't start at initial state
        fsm.fire(new DataRecordedEvent());
        fsm.fire(new AlarmActivatedEvent());
        fsm.fire(new SendEventForValidationEvent());
        fsm.fire(new EventValidEvent());
        fsm.fire(new EventInvalidEvent());
        fsm.fire(new StatusUpdatedEvent());

        assertEquals(
            fsm.getCurrentState(),
            idle
        );
    }
}

