package com.techlab.inheritance.constructor;

public abstract class A {
	int foo;

	public A(int foo) {
		System.out.println("A created " + foo);
	}

	abstract void run();

	public String display(String data) {
		System.out.println("Data from A class");
		return data;
	}

}
