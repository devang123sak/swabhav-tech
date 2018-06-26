package com.techlab.ocp.refactor;

public class HoliRate implements IRate {

	@Override
	public float rate() {
		return (8.0f/100);
	}
	
	@Override
	public String toString()
	{
		HoliRate holiRate=new HoliRate();
		String rate=Float.toString((float) holiRate.rate()*100);
		return rate;
	}

}
