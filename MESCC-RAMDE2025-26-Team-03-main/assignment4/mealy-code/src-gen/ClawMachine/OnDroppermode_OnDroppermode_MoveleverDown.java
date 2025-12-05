	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class OnDroppermode_OnDroppermode_MoveleverDown implements EventHandler<MoveleverDown> {
	    public void handleEvent(MoveleverDown e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Move lever - Down");
	    }
	}
