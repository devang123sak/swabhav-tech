package com.techlab.singleton;

public class Singleton {

	private static Singleton instance = new Singleton();

	// make the constructor private so that this class cannot be instantiated
	private Singleton() {
	}

	public static Singleton getInstance() {
		System.out.println("This is SingleTon...");
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
