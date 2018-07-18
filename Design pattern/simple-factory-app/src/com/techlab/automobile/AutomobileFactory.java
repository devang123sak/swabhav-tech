package com.techlab.automobile;

import com.techlab.automobile.IAutomobile;

public class AutomobileFactory {

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

}
