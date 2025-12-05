package org.jeasy.states.samples.model;

import org.jeasy.states.samples.MealyState;
import org.jeasy.states.api.*;
import org.jeasy.states.core.*;
import org.jeasy.states.samples.lightswitch.*;
import java.util.HashSet;
import java.util.Date;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) throws FiniteStateMachineException {
        State LightOff = new MealyState("Light Off");
        State LightOn = new MealyState("Light On");
        
        Set<State> states = new HashSet<>();
        states.add(LightOff);
        states.add(LightOn);
        
        Transition LightOn_LightOff = new TransitionBuilder()
            .name("LightOn_LightOff")
            .sourceState(LightOn)
            .eventType(Offispressed.class)
            .eventHandler(new LightOn_LightOff_Offispressed())
            .targetState(LightOff)
            .build();
        Transition LightOff_LightOn = new TransitionBuilder()
            .name("LightOff_LightOn")
            .sourceState(LightOff)
            .eventType(Onispressed.class)
            .eventHandler(new LightOff_LightOn_Onispressed())
            .targetState(LightOn)
            .build();
        
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, LightOff)
        .registerTransition(LightOn_LightOff)
        .registerTransition(LightOff_LightOn)
        .build();
        
        System.out.println("Initial State : " + fsm.getCurrentState().getName());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("On is pressed");
        System.out.println("Off is pressed");
        System.out.println("Press 'q' to quit.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("On is pressed")) {
                fsm.fire(new Onispressed());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("Off is pressed")) {
                fsm.fire(new Offispressed());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("Bye!");
                System.exit(0);
            } 
        }
    }
}


	

