package com.techlab.foo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooTest {

	@Test
	public void m1Test() {

		// Arrange
		Foo foo = new Foo();

		String expected = "inside m1";

		// Act
		String actual = foo.m1();
		assertEquals(expected, actual);
	}

	@Test
	public void m2Test() {

		// Arrange
		Foo foo = new Foo();

		String expected = "inside m1";

		// Act
		String actual = foo.m2();
		assertEquals(expected, actual);
	}

	@Test
	public void m3Test() {

		// Arrange
		Foo foo = new Foo();

		String expected = "inside m3";

		// Act
		String actual = foo.m3();
		assertEquals(expected, actual);
	}
}
