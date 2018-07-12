package com.techlab.game.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.game.ResultAnalyzer;

public class ResultAnalyzerTest {
	ResultAnalyzer resultAnalyzer = new ResultAnalyzer();

	@Test
	public void hasWonTest() {

		boolean expected = true;

		String[][] value = { { "x", "o", "o" }, { "o", "x", "o" },
				{ "x", "o", "o" } };
		boolean actual = resultAnalyzer.hasWon(value, "o");
		assertEquals(expected, actual);
	}

	@Test
	public void drawGameTest() {

		boolean expected = true;
		String[][] value = { { "x", "o", "o" }, { "x", "o", "x" },
				{ "o", "x", "x" } };
		boolean actual = resultAnalyzer.drawGame(value);

		assertEquals(expected, actual);
	}

}
