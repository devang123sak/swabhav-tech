package com.techlab.automobile;

public class AudiFactory implements IAutoFactory{

	@Override
	public IAuto make() {
		return new Audi();
	}

}
