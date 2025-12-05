package org.jeasy.states.samples.lightswitch.mealy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;
import org.jeasy.states.samples.lightswitch.OffEvent;
import org.jeasy.states.samples.lightswitch.OnEvent;
import org.jeasy.states.samples.lightswitch.Dim;
import org.jeasy.states.samples.lightswitch.Medium;
import org.jeasy.states.samples.lightswitch.Dark;
import org.jeasy.states.samples.MealyState;
import org.jeasy.states.samples.lightswitch.Bright;



class Launcher {
    public static void main(String[] args) throws FiniteStateMachineException {

    	State off = new MealyState("Lights Out");
    	State dim = new MealyState("Dim Light");
    	State med = new MealyState("Medium Light");
    	State high = new MealyState("Bright Light");

        Set<State> states = new HashSet<>();
        states.add(off);
        states.add(med);
        states.add(dim);
        states.add(high);

        Transition pressOnWhenOff = new TransitionBuilder()
                .name("Off to Dim")
                .sourceState(off)
                .eventType(OnEvent.class)
                .eventHandler(new Dim())
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
                .eventHandler(new Medium())
                .build();

        Transition pressOffWhenDim = new TransitionBuilder()
                .name("Dim to Off")
                .sourceState(dim)
                .eventType(OffEvent.class)
                .targetState(off)
                .eventHandler(new Dark())
                .build();

        Transition pressOnWhenMedium = new TransitionBuilder()
                .name("Medium to High")
                .sourceState(med)
                .eventType(OnEvent.class)
                .targetState(high)
                .eventHandler(new Bright())
                .build();

        Transition pressOffWhenMedium = new TransitionBuilder()
                .name("Medium to Off")
                .sourceState(med)
                .eventType(OffEvent.class)
                .targetState(off)
                .eventHandler(new Dark())
                .build();

        Transition pressOnWhenBright = new TransitionBuilder()
                .name("High to Dim")
                .sourceState(high)
                .eventType(OnEvent.class)
                .targetState(dim)
                .eventHandler(new Dim())
                .build();

        Transition pressOffWhenBright = new TransitionBuilder()
                .name("High to Off")
                .sourceState(high)
                .eventType(OffEvent.class)
                .targetState(off)
                .eventHandler(new Dark())
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
            }
            if (input.trim().equalsIgnoreCase("0")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing Off event...");
                lightswitchStateMachine.fire(new OffEvent());
                System.out.println("Lightswitch state : " + lightswitchStateMachine.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("input = " + input.trim());
                System.out.println("Bye!");
                System.exit(0);
            }
        }

    }
}
