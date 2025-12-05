package org.jeasy.states.samples.lightswitch.moore;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;
import org.jeasy.states.samples.MooreState;
import org.jeasy.states.samples.lightswitch.OffEvent;
import org.jeasy.states.samples.lightswitch.OnEvent;


class Launcher {
    public static void main(String[] args) throws FiniteStateMachineException {

    	State off = new MooreState("brightnessOut", "Lights Out");
    	State dim = new MooreState("brightnessDim", "Dim Light");
    	State med = new MooreState("brightnessMedium", "Medium Light");
    	State high = new MooreState("brightnessBright", "Bright Light");

        Set<State> states = new HashSet<>();
        states.add(off);
        states.add(med);
        states.add(dim);
        states.add(high);

        Transition pressOnWhenOff = new TransitionBuilder()
                .name("Off to Dim")
                .sourceState(off)
                .eventType(OnEvent.class)
                .targetState(dim)
                .build();

        Transition pressOffWhenOff = new TransitionBuilder()
                .name("Off to Off")
                .sourceState(off)
                .eventType(OffEvent.class)
                .targetState(off)
                .build();

        Transition pressOnWhenDim = new TransitionBuilder()
                .name("Dim to Medium")
                .sourceState(dim)
                .eventType(OnEvent.class)
                .targetState(med)
                .build();

        Transition pressOffWhenDim = new TransitionBuilder()
                .name("Dim to Off")
                .sourceState(dim)
                .eventType(OffEvent.class)
                .targetState(off)
                .build();

        Transition pressOnWhenMedium = new TransitionBuilder()
                .name("Medium to High")
                .sourceState(med)
                .eventType(OnEvent.class)
                .targetState(high)
                .build();

        Transition pressOffWhenMedium = new TransitionBuilder()
                .name("Medium to Off")
                .sourceState(med)
                .eventType(OffEvent.class)
                .targetState(off)
                .build();

        Transition pressOnWhenBright = new TransitionBuilder()
                .name("High to Dim")
                .sourceState(high)
                .eventType(OnEvent.class)
                .targetState(dim)
                .build();

        Transition pressOffWhenBright = new TransitionBuilder()
                .name("High to Off")
                .sourceState(high)
                .eventType(OffEvent.class)
                .targetState(off)
                .build();

        FiniteStateMachine lightswitchStateMachine = new FiniteStateMachineBuilder(states, off)
                .registerTransition(pressOnWhenOff)
                .registerTransition(pressOffWhenOff)
                .registerTransition(pressOnWhenDim)
                .registerTransition(pressOffWhenDim)
                .registerTransition(pressOnWhenMedium)
                .registerTransition(pressOffWhenMedium)
                .registerTransition(pressOnWhenBright)
                .registerTransition(pressOffWhenBright)
                .build();

        System.out.println("LightSwitch initial state : " + lightswitchStateMachine.getCurrentState().getName());

		Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("1. On [1]");
        System.out.println("2. Off [0]");
        System.out.println("Press [q] to quit,");
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("1")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing On event...");
                lightswitchStateMachine.fire(new OnEvent());
                System.out.println("Lightswitch state : " + lightswitchStateMachine.getCurrentState().getName());
                System.out.println("Lightswitch output : " + lightswitchStateMachine.getCurrentState().getOutput());
            }
            if (input.trim().equalsIgnoreCase("0")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing Off event...");
                lightswitchStateMachine.fire(new OffEvent());
                System.out.println("Lightswitch state : " + lightswitchStateMachine.getCurrentState().getName());
                System.out.println("Lightswitch output : " + lightswitchStateMachine.getCurrentState().getOutput());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("input = " + input.trim());
                System.out.println("Bye!");
                System.exit(0);
            }
        }

    }
}
