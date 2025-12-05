/*
 * The MIT License
 *
 *  Copyright (c) 2020, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.jeasy.states.core;

import java.util.HashSet;
import java.util.Set;

import org.assertj.core.api.Assertions;
import org.jeasy.states.api.AbstractEvent;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.samples.MooreState;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MooreFiniteStateMachineImplTest {

    private MooreState s1, s2;
    private FiniteStateMachineImpl stateMachine;

    @Before
    public void setUp() {
        s1 = new MooreState("s1", "output1");
        s2 = new MooreState("s2", "output2");

        Set<State> states = new HashSet<>();
        states.add(s1);
        states.add(s2);

        stateMachine = new FiniteStateMachineImpl(states, s1);
    }

    @Test
    public void whenEventIsFired_thenShouldTransitToTargetState() throws Exception {
        // Arrange
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .build();

        stateMachine.registerTransition(transition);

        // Act
        stateMachine.fire(new MoveEvent());

        // Assert
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s2);
        Assertions.assertThat(((MooreState) stateMachine.getCurrentState()).getOutput()).isEqualTo("output2");
    }

    @Test
    public void whenStateMachineIsInFinalState_thenEventShouldNotChangeState() throws Exception {
        // Arrange
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .build();

        stateMachine.registerFinalState(s1);
        stateMachine.registerTransition(transition);

        // Act
        stateMachine.fire(new MoveEvent());

        // Assert
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
        Assertions.assertThat(((MooreState) stateMachine.getCurrentState()).getOutput()).isEqualTo("output1");
    }

    @Test
    public void whenFiredEventIsNull_thenStateShouldNotChange() throws Exception {
        // Arrange
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .build();

        stateMachine.registerTransition(transition);

        // Act
        stateMachine.fire(null);

        // Assert
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
        Assertions.assertThat(((MooreState) stateMachine.getCurrentState()).getOutput()).isEqualTo("output1");
    }

    @Test
    public void whenNoRegisteredTransitionForFiredEvent_thenStateShouldNotChange() throws Exception {
        // Arrange
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .build();

        stateMachine.registerTransition(transition);

        // Act
        stateMachine.fire(new StayEvent());

        // Assert
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
        Assertions.assertThat(((MooreState) stateMachine.getCurrentState()).getOutput()).isEqualTo("output1");
    }

    // Event classes
    private static class MoveEvent extends AbstractEvent { }
    private static class StayEvent extends AbstractEvent { }
}
