package com.techlab.automobile;

public class TeslaFactory implements IAutoFactory {

	@Override
	public IAuto make() {
		return new Tesla();
	}

}
