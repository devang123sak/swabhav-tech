package com.techlab.lsp.refactor.test;

import com.techlab.lsp.refactor.IPolygon;
import com.techlab.lsp.refactor.Rectangle;
import com.techlab.lsp.refactor.Square;

public class IPolygonTest {

	public static void main(String[] args) {

		IPolygon shape = new Rectangle(20, 30);
		System.out.println("Area of Rectangle = " + shape.calculateArea());

		IPolygon shape2 = new Square(30);
		System.out.println("Area of Square = " + shape2.calculateArea());
	}

}
