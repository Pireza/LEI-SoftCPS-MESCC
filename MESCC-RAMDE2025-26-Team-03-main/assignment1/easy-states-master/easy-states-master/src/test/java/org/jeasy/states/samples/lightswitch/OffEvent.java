package org.jeasy.states.samples.lightswitch;

import org.jeasy.states.api.AbstractEvent;

public class OffEvent extends AbstractEvent {
    public OffEvent(){
        super("Off Event");
    }
    protected OffEvent(String eventName){
        super(eventName);
    }
}
