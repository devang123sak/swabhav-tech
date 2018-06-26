package com.techlab.lsp.violation.test;

import com.techlab.lsp.violation.Rectangle;
import com.techlab.lsp.violation.Square;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(30, 20);
		System.out.println("Area of Rectangle = " + rectangle.calculateArea());

		Square square = new Square(30);
		System.out.println("Area of Square = " + square.calculateArea());
	}

}
