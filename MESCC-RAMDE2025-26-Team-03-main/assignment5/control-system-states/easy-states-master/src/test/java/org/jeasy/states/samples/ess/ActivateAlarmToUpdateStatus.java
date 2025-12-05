	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class ActivateAlarmToUpdateStatus implements EventHandler<AlarmActivatedEvent> {
	    public void handleEvent(AlarmActivatedEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Alarm Activated Event");
	    }
	}
