	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class Clawdown_Pinched_PressActionbutton implements EventHandler<PressActionbutton> {
	    public void handleEvent(PressActionbutton e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Press Action button");
	    }
	}
