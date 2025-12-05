	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class OnGrabbermode_OnGrabbermode_MoveleverRight implements EventHandler<MoveleverRight> {
	    public void handleEvent(MoveleverRight e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Move lever - Right");
	    }
	}
