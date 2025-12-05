	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class ValidateEventToIdle implements EventHandler<EventInvalidEvent> {
	    public void handleEvent(EventInvalidEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Event Invalid Event");
	    }
	}
