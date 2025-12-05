	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class ProcessEventToValidateEvent implements EventHandler<SendEventForValidationEvent> {
	    public void handleEvent(SendEventForValidationEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Send Event For Validation Event");
	    }
	}
