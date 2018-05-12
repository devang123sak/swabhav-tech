package com.techlab.rectangle.test;

import com.techlab.rectangle.*;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(-10);
		r1.setHeight(500);
		r1.setColor(ColorType.RED);
		displayDetail(r1);
		System.out.println(" ");

		Rectangle r2 = new Rectangle();
		r2.setHeight(30);
		r2.setWidth(20);
		// r2.setColor(ColorType.GREEN);
		// displayDetail(r2);
		displayDetail(new Rectangle());// anonymous variable

	}

	public static void displayDetail(Rectangle rectangle) {

		System.out.println("Width of Rectangle = " + rectangle.getWidth());
		System.out.println("Height of Rectangle = " + rectangle.getHeight());
		System.out.println("color of Rectangle = " + rectangle.getColorType());
		System.out.println("Area of Rectangle " + rectangle.calculateArea());
	}

}
