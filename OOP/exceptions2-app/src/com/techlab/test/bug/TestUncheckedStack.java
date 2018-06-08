package com.techlab.test.bug;

public class TestUncheckedStack {

	public static void main(String[] args) {

		try {
			m1();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("end of main method.");
		}
	}

	public static void m1() {
		System.out.println("inside m1");
		m2();
	}

	public static void m2() {
		System.out.println("inside m2");
		m3();
	}

	public static void m3() {
		System.out.println("inside m3");
		throw new RuntimeException("exception found");
	}

}
