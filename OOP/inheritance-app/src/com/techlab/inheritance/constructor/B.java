package com.techlab.inheritance.constructor;

public class B extends A {
	String data;

	public B() {
		super(100);
		System.out.println("B created");
	}

	public B(int foo) {
		super(foo);// Constructor call must be the first statement in a
					// constructor
		System.out.println("B created");
	}

	public String run(String data) {
		System.out.println("run");
		return data;
	}

	public String getData() {
		System.out.println("hi");
		return data;
	}

	public void setData(String data) {
		System.out.println("set data called with  paramerer" + data);
		this.data = data;
	}

	@Override
	void run() {

	}

}
