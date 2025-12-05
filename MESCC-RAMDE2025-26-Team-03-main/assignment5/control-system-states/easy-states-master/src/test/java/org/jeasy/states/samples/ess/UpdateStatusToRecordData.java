	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class UpdateStatusToRecordData implements EventHandler<StatusUpdatedEvent> {
	    public void handleEvent(StatusUpdatedEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Status Updated Event");
	    }
	}
