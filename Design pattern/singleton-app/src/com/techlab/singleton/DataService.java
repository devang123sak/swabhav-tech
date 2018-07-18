package com.techlab.singleton;

public class DataService {

	static DataService container;

	private DataService() {
		System.out.println("Data Service created");
	}

	public static DataService getInstance() {
		if (container == null)
			container = new DataService();
		return container;
	}

	public void doSomething() {
		System.out.println("do some work " + this.hashCode());
	}
}
