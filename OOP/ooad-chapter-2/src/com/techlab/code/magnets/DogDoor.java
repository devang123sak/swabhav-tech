package com.techlab.code.magnets;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private Bark allowedBarks;
	private List barks;

	public DogDoor() {
		this.open = false;
		barks = new ArrayList();
	}

	public Bark getAllowedBarks() {
		return allowedBarks;
	}

	public void setAllowedBarks(Bark allowedBarks) {
		this.allowedBarks = allowedBarks;
	}

	public boolean isOpen() {
		return open;
	}

	public List getBarks() {
		return barks;
	}

	public void setBarks(List barks) {
		this.barks = barks;
	}

	public void open() {
		System.out.println("The dog door opens...");
		open = true;
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The dog door close...");
		open = false;
	}

	public void addAllowedBark(Bark bark) {
		barks.add(bark);
	}
}
