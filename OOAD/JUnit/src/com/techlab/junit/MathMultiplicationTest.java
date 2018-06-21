package com.techlab.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathMultiplicationTest {

	@Test
	public void shouldMulPositivesNumbersToReturnResult() {

		// Arrange
		Maths math = new Maths();
		int expected = 200;
		// Act
		int actual = math.multi(10, 20);
		assertEquals(expected, actual);

	}
}
