package com.techlab.automobile;

class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Tesla start "+hashCode());
	}

	@Override
	public void stop() {
		System.out.println("Tesla stop "+hashCode());
	}

}
