package com.techlab.observer.test;

import com.techlab.observer.BinaryObserver;
import com.techlab.observer.HexaObserver;
import com.techlab.observer.OctalObserver;
import com.techlab.observer.Subject;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
