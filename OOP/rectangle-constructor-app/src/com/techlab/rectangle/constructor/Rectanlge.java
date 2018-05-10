package com.techlab.rectangle.constructor;

public class Rectanlge {
	private int width;
	private int height;

	public Rectanlge(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public double rectangleArea() {
		double area = 0;
		area = width * height;
		return area;
	}

}
