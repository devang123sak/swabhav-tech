package com.techlab.automobile;

class Bmw implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW start " + hashCode());
	}

	@Override
	public void stop() {
		System.out.println("BMW stop " + hashCode());
	}

}
