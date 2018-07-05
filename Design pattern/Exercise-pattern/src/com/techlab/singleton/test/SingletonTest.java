package com.techlab.singleton.test;

import com.techlab.singleton.Singleton;

public class SingletonTest {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();

	}

}
