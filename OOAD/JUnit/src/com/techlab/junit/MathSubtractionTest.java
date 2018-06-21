package com.techlab.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathSubtractionTest {

	@Test
	public void shouldSubPositivesNumbersToReturnResult() {

		//Arrange
		Maths math = new Maths();
		int expected = 20;
		//Act
		int actual = math.sub(30, 10);
		assertEquals(expected, actual);

	}
}
