package com.techlab.inheritance.constructor;

public class B extends A {

	public B() {
		super(100);
		System.out.println("B created");
	}

	public B(int foo) {
		super(foo);
		System.out.println("B created");
	}

}
