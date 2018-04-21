package com.techlab.areaofallshape;

public class Triangle {
	private double height, base;

	public Triangle(int height1, int base1) {
		this.base = base1;
		this.height = height1;
	}

	public void areaOfTraingle() {
		double area = (0.5 * height * base);
		System.out.println("Area of Traingle is = " + area);

	}

}
