	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class OnGrabbermode_OnGrabbermode_MoveleverLeft implements EventHandler<MoveleverLeft> {
	    public void handleEvent(MoveleverLeft e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Move lever - Left");
	    }
	}
