package com.techlab.manboy;

public class Man implements IManners {

	@Override
	public void wish() {
		System.out.println("Man say Hello.");
	}

	@Override
	public void depart() {
		System.out.println("Man is Leaving");
	}

}
