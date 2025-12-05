	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class IdleToProcessEvent implements EventHandler<ReceiveEventEvent> {
	    public void handleEvent(ReceiveEventEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Receive Event Event");
	    }
	}
