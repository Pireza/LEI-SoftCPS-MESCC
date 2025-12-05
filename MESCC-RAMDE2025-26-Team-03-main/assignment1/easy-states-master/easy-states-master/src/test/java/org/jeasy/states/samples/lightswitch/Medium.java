package org.jeasy.states.samples.lightswitch;

import java.util.Date;

import org.jeasy.states.api.EventHandler;


public class Medium implements EventHandler<OnEvent> {
    public void handleEvent(OnEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Bringing lights to medium brightness...");
    }
}
