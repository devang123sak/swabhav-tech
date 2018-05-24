package com.techlab.manboy;

public class Boy implements IEmotional, IManners {

	@Override
	public void wish() {
		System.out.println("Boy say Hello.");

	}

	@Override
	public void depart() {
		System.out.println("Boy leaveing.");
	}

	@Override
	public void cry() {
		System.out.println("Boy is crying.");

	}

	@Override
	public void laugh() {
		System.out.println("Boy is laughing.");

	}

}
