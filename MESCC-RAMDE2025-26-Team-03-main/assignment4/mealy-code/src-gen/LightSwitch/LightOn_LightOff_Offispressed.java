	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class LightOn_LightOff_Offispressed implements EventHandler<Offispressed> {
	    public void handleEvent(Offispressed e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Off is pressed");
	    }
	}
