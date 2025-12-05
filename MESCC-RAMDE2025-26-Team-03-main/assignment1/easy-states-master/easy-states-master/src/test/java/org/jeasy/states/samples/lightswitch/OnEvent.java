package org.jeasy.states.samples.lightswitch;

import org.jeasy.states.api.AbstractEvent;

public class OnEvent extends AbstractEvent{
    public OnEvent(){
        super("On Event");
    }
    protected OnEvent(String eventName){
        super(eventName);
    }
}
