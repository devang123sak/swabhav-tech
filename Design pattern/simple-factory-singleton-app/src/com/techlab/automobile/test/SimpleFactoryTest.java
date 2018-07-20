package com.techlab.automobile.test;

import com.techlab.automobile.AutomobileFactory;
import com.techlab.automobile.Autotype;
import com.techlab.automobile.IAutomobile;

public class SimpleFactoryTest {

	public static void main(String[] args) {

		AutomobileFactory automobileFactory = AutomobileFactory.getInstance();
		automobileFactory.code();
		AutomobileFactory automobileFactory1 = AutomobileFactory.getInstance();
		automobileFactory1.code();

		IAutomobile auto = automobileFactory.make(Autotype.BMW);
		auto.start();
		auto.stop();

		IAutomobile auto1 = automobileFactory.make(Autotype.TESLA);
		auto1.start();
		auto1.stop();

	}

}
