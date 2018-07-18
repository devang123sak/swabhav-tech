package com.techlab.singleton.test;

import com.techlab.singleton.DataService;

public class DataServiceTest {

	public static void main(String[] args) {

		DataService sv1 = DataService.getInstance();
		DataService sv2 = DataService.getInstance();

		sv1.doSomething();
		sv2.doSomething();

		System.out.println("sv1 hashCode = " + sv1.hashCode());
		System.out.println("sv2 hashCode = " + sv2.hashCode());

	}

}
