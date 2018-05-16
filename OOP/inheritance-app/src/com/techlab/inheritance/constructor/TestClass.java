package com.techlab.inheritance.constructor;

public class TestClass {

	public static void main(String[] args) {

		B b1 = new B();
		B b2 = new B();

		B b3 = new B(200);
		B b4 = new B(300);

		A a = new B(1000);
		a.run();// without abstract method in class A a can not access run
				// method.
	}
}