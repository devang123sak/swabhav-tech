package com.techlab.lsp.violation.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.lsp.violation.Rectangle;
import com.techlab.lsp.violation.Square;

public class SquareJUnitTest {

	@Test
	public void shouldNotChangeWidth_ifHeightChange(Rectangle r) {

		// Arrange
		Square square = new Square(30);
		int expected = 30;

		// Act

		int beforeChangeWidth = r.getWidth();
		r.setWidth(50);
		int afterChangeWidth = r.getWidth();
		System.out.println("Before = " + beforeChangeWidth);
		System.out.println("After = " + afterChangeWidth);
		int actual = beforeChangeWidth;
		assertEquals(expected, actual);

	}

}
