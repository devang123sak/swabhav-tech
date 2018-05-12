package com.techlab.rectangle;

public class Rectangle {

	private int width;
	private int height;
	private ColorType color;

	public int getWidth() {
		return width;
	}

	public void setWidth(int side) {
		this.width = checkCondition(side);

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int side) {
		this.height = checkCondition(side);
	}

	public ColorType getColorType() {
		return color;
	}

	public void setColor(ColorType color) {
		this.color = color;

	}

	public double calculateArea() {

		double area = 0;
		area = width * height;
		return area;
	}

	private static int checkCondition(int side) {
		if (side < 0) {
			side = 1;
		} else if (side > 100) {
			side = 100;
		}
		return side;
	}

}
