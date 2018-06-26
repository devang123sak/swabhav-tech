package com.techlab.ocp.refactor;

public class NewYearRate implements IRate {

	@Override
	public float rate() {
		return (8.5f / 100);

	}

	@Override
	public String toString() {
		NewYearRate newYearRate = new NewYearRate();
		String rate = Float.toString((float) newYearRate.rate()*100);
		return rate;

	}
}
