package com.techlab.junit;

import static org.junit.Assert.*;

import org.junit.Test;

// WE can test multiple test in one class... 
public class MathsTest {

	@Test
	public void shouldAddPositivesNumbersToReturnResult() {

		// Arrange
		Maths math = new Maths();
		int expected = 30;
		// Act
		int actual = math.add(10, 20);
		assertEquals(expected, actual);

	}

	@Test
	public void shouldSubPositivesNumbersToReturnResult() {

		// Arrange
		Maths math = new Maths();
		int expected = 20;
		// Act
		int actual = math.sub(30, 10);
		assertEquals(expected, actual);

	}

	@Test
	public void shouldMultiPositivesNumbersToReturnResult() {

		// Arrange
		Maths math = new Maths();
		int expected = 200;
		// Act
		int actual = math.multi(10, 20);
		assertEquals(expected, actual);

	}

}
