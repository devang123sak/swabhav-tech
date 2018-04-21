package com.techlab.areaofallshape;

public class Circle {
	private double pi = 3.14159, radiusValue;

	public Circle(int radiusValue) {
		this.radiusValue = radiusValue;

	}

	public double getRadiusValue() {
		return radiusValue;
	}

	public void setRadiusValue(double radiusValue) {
		this.radiusValue = radiusValue;
	}

	public void printArea() {
		double area = pi * radiusValue * radiusValue;
		System.out.println("Area of circle is = " + area);
	}

}
