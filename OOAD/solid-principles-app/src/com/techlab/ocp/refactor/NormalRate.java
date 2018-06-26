package com.techlab.ocp.refactor;

public class NormalRate implements IRate {

	@Override
	public float rate() {
		return (7.8f / 100);
	}

	@Override
	public String toString() {
		NormalRate normalRate = new NormalRate();
		String rate = Float.toString((float) normalRate.rate()*100);
		return rate;
	}
}
