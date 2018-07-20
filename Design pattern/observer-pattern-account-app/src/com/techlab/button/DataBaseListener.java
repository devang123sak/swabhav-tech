package com.techlab.button;

public class DataBaseListener implements IListener {

	@Override
	public void update(Button button) {

		System.out.println("new update DataBase save " + "\n"
				+ button.getText() + " " + button.getHeight() + " "
				+ button.getWeight());
	}
}
