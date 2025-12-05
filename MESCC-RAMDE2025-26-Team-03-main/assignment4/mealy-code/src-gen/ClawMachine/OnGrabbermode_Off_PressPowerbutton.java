	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class OnGrabbermode_Off_PressPowerbutton implements EventHandler<PressPowerbutton> {
	    public void handleEvent(PressPowerbutton e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Press Power button");
	    }
	}
