	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class LightOff_LightOn_Onispressed implements EventHandler<Onispressed> {
	    public void handleEvent(Onispressed e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("On is pressed");
	    }
	}
