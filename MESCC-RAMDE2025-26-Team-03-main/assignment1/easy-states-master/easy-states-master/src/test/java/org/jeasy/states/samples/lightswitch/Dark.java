package org.jeasy.states.samples.lightswitch;

import java.util.Date;

import org.jeasy.states.api.EventHandler;

public class Dark implements EventHandler<OffEvent>{

    @Override
    public void handleEvent(OffEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Turning the lights OFF...");
    }
    
}
