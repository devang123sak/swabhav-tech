package com.techlab.rectangle;

public class Rectangle {
	private int width, height;

	public Rectangle(int width1, int height1) {
		this.width = width1;
		this.height = height1;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setValue(int width, int height) {
		if (width > 100) {
			width = 100;
		} else if (width < 1) {
			width = 1;
		}

	}

	public void calculateArea() {

		System.out.println("width of rectangle is = " + width);
		System.out.println("Height of reactangle is = " + height);
		System.out.println("Area of rectangle = " + (width * height));

	}
}
