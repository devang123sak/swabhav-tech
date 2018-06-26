package com.techlab.isp.refactor;

public class Manager implements IWorkAndEat {

	@Override
	public void startWork() {

		System.out.println("Manager Start Work..");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stop Work..");
	}

	@Override
	public void startEat() {
		System.out.println("Manager Start Eating..");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stop Eating..");
	}

}
