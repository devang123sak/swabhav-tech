package com.techlab.button;

public class LogListener implements IListener {

	@Override
	public void update(Button button) {
		System.out.println("Logging Changed...");
	}

}
