package com.techlab.facade.test;

//Step 1:Create an interface.
//Step 2:Create concrete classes implementing the same interface.
//Step 3:Create a facade class.
//Step 4:Use the facade to draw various types of shapes.

import com.techlab.facade.ShapeMaker;

public class FacadePatternTest {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
