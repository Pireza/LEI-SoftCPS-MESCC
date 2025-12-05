	package org.jeasy.states.samples.model;
	
	import org.jeasy.states.api.*;
	import java.util.Date;
	
	public class OnDroppermode_OnDroppermode_MoveleverUp implements EventHandler<MoveleverUp> {
	    public void handleEvent(MoveleverUp e) {
	        System.out.println("Event '" + e.getName() + "' triggered at " + new Date(e.getTimestamp()));
	        System.out.println("Move lever - Up");
	    }
	}
