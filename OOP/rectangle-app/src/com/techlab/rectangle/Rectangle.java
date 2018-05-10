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
		this.color = ColorType.BLUE;
		this.color = ColorType.GREEN;
		this.color = ColorType.RED;
	}

	/*
	 * public void setColor(String color) {
	 * 
	 * if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("blue") ||
	 * color.equalsIgnoreCase("green")) { this.color = color; } else {
	 * this.color = "red"; } }
	 */

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
