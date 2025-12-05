package org.jeasy.states.samples.model;

import org.jeasy.states.api.*;
import org.jeasy.states.core.*;
import org.jeasy.states.samples.MooreState;
import org.jeasy.states.samples.turnstile.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Launcher {
    public static void main(String[] args) throws FiniteStateMachineException {
        State Locked = new MooreState("Locked", "Lock");
        State Unlocked = new MooreState("Unlocked", "Unlock");
        
        Set<State> states = new HashSet<>();
        states.add(Locked);
        states.add(Unlocked);
        
        Transition Locked_Unlocked = new TransitionBuilder()
            .name("Locked_Unlocked")
            .sourceState(Locked)
            .eventType(Coin.class)
            .targetState(Unlocked)
            .build();
        Transition Unlocked_Locked = new TransitionBuilder()
            .name("Unlocked_Locked")
            .sourceState(Unlocked)
            .eventType(Push.class)
            .targetState(Locked)
            .build();
        
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, Locked)
        .registerTransition(Locked_Unlocked)
        .registerTransition(Unlocked_Locked)
        .build();
        
        System.out.println("Initial State : " + fsm.getCurrentState().getName());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("Coin");
        System.out.println("Push");
        System.out.println("Press 'q' to quit.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("Coin")) {
                fsm.fire(new Coin());
                System.out.println("State : " + fsm.getCurrentState().getName());
                System.out.println("Output : " + fsm.getCurrentState().getOutput());
            }
            if (input.trim().equalsIgnoreCase("Push")) {
                fsm.fire(new Push());
                System.out.println("State : " + fsm.getCurrentState().getName());
                System.out.println("Output : " + fsm.getCurrentState().getOutput());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }
}

	

