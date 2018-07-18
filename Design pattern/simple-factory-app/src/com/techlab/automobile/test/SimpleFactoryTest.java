package com.techlab.automobile.test;

import com.techlab.automobile.AutomobileFactory;
import com.techlab.automobile.Autotype;
import com.techlab.automobile.IAutomobile;

public class SimpleFactoryTest {

	public static void main(String[] args) {

		AutomobileFactory f = new AutomobileFactory();

		IAutomobile auto = f.make(Autotype.BMW);
		auto.start();
		auto.stop();
		IAutomobile auto1 = f.make(Autotype.TESLA);
		auto1.start();
		auto1.stop();
		System.out.println(auto1.getClass().getSimpleName());

	}

}
