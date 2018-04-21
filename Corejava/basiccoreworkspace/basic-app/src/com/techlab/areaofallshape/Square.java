package com.techlab.areaofallshape;

public class Square {
	private double height;

	public double getData(double height) {
		return height;
	}

	public void setData(double height) {
		this.height = height;
	}

	public void areaOfSquare() {
		double area = (height * height);
		System.out.println("Area Of Square = " + area);
	}

}
