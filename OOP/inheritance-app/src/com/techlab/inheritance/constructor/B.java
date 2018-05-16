package com.techlab.inheritance.constructor;

public class B extends A {

	public B() {
		super(100);
		System.out.println("B created");
	}

	public B(int foo) {
		super(foo);// Constructor call must be the first statement in a
					// constructor
		System.out.println("B created");
	}

	public void run() {
		System.out.println("run");
	}
}
