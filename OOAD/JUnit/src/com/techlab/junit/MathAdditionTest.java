package com.techlab.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathAdditionTest {

	@Test
	public void shouldAddPositivesNumbersToReturnResult() {

		//Arrange
		Maths math = new Maths();
		int expected = 30;
		//Act
		int actual = math.add(10, 20);
		assertEquals(expected, actual);

	}

}
