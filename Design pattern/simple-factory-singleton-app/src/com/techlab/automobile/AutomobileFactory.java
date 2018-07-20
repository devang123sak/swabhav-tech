package com.techlab.automobile;

import com.techlab.automobile.IAutomobile;

public class AutomobileFactory {

	static AutomobileFactory container;

	private AutomobileFactory() {

	}

	public IAutomobile make(Autotype autotype) {
		switch (autotype) {
		case BMW:
			return new Bmw();
		case AUDI:
			return new Audi();
		case TESLA:
			return new Tesla();
		}
		return null;
	}

	public static AutomobileFactory getInstance() {
		if (container == null)
			container = new AutomobileFactory();
		return container;
	}

	public void code() {
		System.out.println("factory hashcode-" + hashCode());
	}
}
