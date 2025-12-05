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
        State OnGrabbermode = new MealyState("On -  Grabber mode");
        State OnDroppermode = new MealyState("On - Dropper mode");
        State Clawdown = new MealyState("Claw down");
        State Off = new MealyState("Off");
        State Pinched = new MealyState("Pinched");
        
        Set<State> states = new HashSet<>();
        states.add(OnGrabbermode);
        states.add(OnDroppermode);
        states.add(Clawdown);
        states.add(Off);
        states.add(Pinched);
        
        Transition Off_OnGrabbermode = new TransitionBuilder()
            .name("Off_OnGrabbermode")
            .sourceState(Off)
            .eventType(PressPowerbutton.class)
            .eventHandler(new Off_OnGrabbermode_PressPowerbutton())
            .targetState(OnGrabbermode)
            .build();
        Transition OnGrabbermode_OnGrabbermode = new TransitionBuilder()
            .name("OnGrabbermode_OnGrabbermode")
            .sourceState(OnGrabbermode)
            .eventType(MoveleverRight.class)
            .eventHandler(new OnGrabbermode_OnGrabbermode_MoveleverRight())
            .targetState(OnGrabbermode)
            .build();
        Transition OnGrabbermode_OnGrabbermode = new TransitionBuilder()
            .name("OnGrabbermode_OnGrabbermode")
            .sourceState(OnGrabbermode)
            .eventType(MoveleverLeft.class)
            .eventHandler(new OnGrabbermode_OnGrabbermode_MoveleverLeft())
            .targetState(OnGrabbermode)
            .build();
        Transition OnGrabbermode_OnGrabbermode = new TransitionBuilder()
            .name("OnGrabbermode_OnGrabbermode")
            .sourceState(OnGrabbermode)
            .eventType(MoveleverUp.class)
            .eventHandler(new OnGrabbermode_OnGrabbermode_MoveleverUp())
            .targetState(OnGrabbermode)
            .build();
        Transition OnGrabbermode_OnGrabbermode = new TransitionBuilder()
            .name("OnGrabbermode_OnGrabbermode")
            .sourceState(OnGrabbermode)
            .eventType(MoveleverDown.class)
            .eventHandler(new OnGrabbermode_OnGrabbermode_MoveleverDown())
            .targetState(OnGrabbermode)
            .build();
        Transition OnDroppermode_OnDroppermode = new TransitionBuilder()
            .name("OnDroppermode_OnDroppermode")
            .sourceState(OnDroppermode)
            .eventType(MoveleverRight.class)
            .eventHandler(new OnDroppermode_OnDroppermode_MoveleverRight())
            .targetState(OnDroppermode)
            .build();
        Transition OnDroppermode_OnDroppermode = new TransitionBuilder()
            .name("OnDroppermode_OnDroppermode")
            .sourceState(OnDroppermode)
            .eventType(MoveleverLeft.class)
            .eventHandler(new OnDroppermode_OnDroppermode_MoveleverLeft())
            .targetState(OnDroppermode)
            .build();
        Transition OnDroppermode_OnDroppermode = new TransitionBuilder()
            .name("OnDroppermode_OnDroppermode")
            .sourceState(OnDroppermode)
            .eventType(MoveleverUp.class)
            .eventHandler(new OnDroppermode_OnDroppermode_MoveleverUp())
            .targetState(OnDroppermode)
            .build();
        Transition OnDroppermode_OnDroppermode = new TransitionBuilder()
            .name("OnDroppermode_OnDroppermode")
            .sourceState(OnDroppermode)
            .eventType(MoveleverDown.class)
            .eventHandler(new OnDroppermode_OnDroppermode_MoveleverDown())
            .targetState(OnDroppermode)
            .build();
        Transition OnGrabbermode_Clawdown = new TransitionBuilder()
            .name("OnGrabbermode_Clawdown")
            .sourceState(OnGrabbermode)
            .eventType(PressActionbutton.class)
            .eventHandler(new OnGrabbermode_Clawdown_PressActionbutton())
            .targetState(Clawdown)
            .build();
        Transition Clawdown_Pinched = new TransitionBuilder()
            .name("Clawdown_Pinched")
            .sourceState(Clawdown)
            .eventType(PressActionbutton.class)
            .eventHandler(new Clawdown_Pinched_PressActionbutton())
            .targetState(Pinched)
            .build();
        Transition Pinched_OnDroppermode = new TransitionBuilder()
            .name("Pinched_OnDroppermode")
            .sourceState(Pinched)
            .eventType(PressActionbutton.class)
            .eventHandler(new Pinched_OnDroppermode_PressActionbutton())
            .targetState(OnDroppermode)
            .build();
        Transition OnDroppermode_OnGrabbermode = new TransitionBuilder()
            .name("OnDroppermode_OnGrabbermode")
            .sourceState(OnDroppermode)
            .eventType(PressActionbutton.class)
            .eventHandler(new OnDroppermode_OnGrabbermode_PressActionbutton())
            .targetState(OnGrabbermode)
            .build();
        Transition OnGrabbermode_Off = new TransitionBuilder()
            .name("OnGrabbermode_Off")
            .sourceState(OnGrabbermode)
            .eventType(PressPowerbutton.class)
            .eventHandler(new OnGrabbermode_Off_PressPowerbutton())
            .targetState(Off)
            .build();
        Transition OnDroppermode_Off = new TransitionBuilder()
            .name("OnDroppermode_Off")
            .sourceState(OnDroppermode)
            .eventType(PressPowerbutton.class)
            .eventHandler(new OnDroppermode_Off_PressPowerbutton())
            .targetState(Off)
            .build();
        
        FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, Off)
        .registerTransition(Off_OnGrabbermode)
        .registerTransition(OnGrabbermode_OnGrabbermode)
        .registerTransition(OnGrabbermode_OnGrabbermode)
        .registerTransition(OnGrabbermode_OnGrabbermode)
        .registerTransition(OnGrabbermode_OnGrabbermode)
        .registerTransition(OnDroppermode_OnDroppermode)
        .registerTransition(OnDroppermode_OnDroppermode)
        .registerTransition(OnDroppermode_OnDroppermode)
        .registerTransition(OnDroppermode_OnDroppermode)
        .registerTransition(OnGrabbermode_Clawdown)
        .registerTransition(Clawdown_Pinched)
        .registerTransition(Pinched_OnDroppermode)
        .registerTransition(OnDroppermode_OnGrabbermode)
        .registerTransition(OnGrabbermode_Off)
        .registerTransition(OnDroppermode_Off)
        .build();
        
        System.out.println("Initial State : " + fsm.getCurrentState().getName());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("Press Action button");
        System.out.println("Move lever - Right");
        System.out.println("Move lever - Left");
        System.out.println("Move lever - Up");
        System.out.println("Move lever - Down");
        System.out.println("Press Power button");
        System.out.println("Press 'q' to quit.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("Press Action button")) {
                fsm.fire(new PressActionbutton());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("Move lever - Right")) {
                fsm.fire(new MoveleverRight());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("Move lever - Left")) {
                fsm.fire(new MoveleverLeft());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("Move lever - Up")) {
                fsm.fire(new MoveleverUp());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("Move lever - Down")) {
                fsm.fire(new MoveleverDown());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("Press Power button")) {
                fsm.fire(new PressPowerbutton());
                System.out.println("State : " + fsm.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("Bye!");
                System.exit(0);
            } 
        }
    }
}


	

