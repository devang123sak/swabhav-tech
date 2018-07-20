package com.techlab.button;

import java.util.ArrayList;
import java.util.List;

public class Button {

	private String text;
	private int height;
	private int width;
	private List<IListener> observers = new ArrayList<IListener>();

	public Button(String text, int height, int weight) {
		this.text = text;
		this.height = height;
		this.width = weight;
	}

	public String getText() {
		return text;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return width;
	}

	public void press() {
		notifyListener();
	}

	public List<IListener> addListener(IListener listener) {
		observers.add(listener);
		return observers;
	}

	public void notifyListener() {

		for (IListener observer : observers) {
			observer.update(this);
		}
	}
}
