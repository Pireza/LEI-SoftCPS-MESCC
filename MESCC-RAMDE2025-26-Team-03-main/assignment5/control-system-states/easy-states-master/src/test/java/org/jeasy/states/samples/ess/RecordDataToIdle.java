	package org.jeasy.states.samples.ess;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class RecordDataToIdle implements EventHandler<DataRecordedEvent> {
	    public void handleEvent(DataRecordedEvent e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Data Recorded Event");
	    }
	}
