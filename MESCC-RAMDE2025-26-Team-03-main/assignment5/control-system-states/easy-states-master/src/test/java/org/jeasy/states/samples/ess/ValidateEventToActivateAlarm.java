	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class ValidateEventToActivateAlarm implements EventHandler<EventValidEvent> {
	    public void handleEvent(EventValidEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Event Valid Event");
	    }
	}
