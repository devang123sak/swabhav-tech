package com.techlab.automobile;

public class BmwFactory implements IAutoFactory {

	@Override
	public IAuto make() {

		return new Bmw();
	}

}
