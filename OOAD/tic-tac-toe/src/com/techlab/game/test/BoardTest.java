package com.techlab.game.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.game.Board;
import com.techlab.game.Cell;
import com.techlab.game.ResultAnalyzer;

public class BoardTest {

	Board board = new Board();

	@Test
	public void printBoardTest() {

		String[][] expected = { { "x", "o", "o" }, { "x", "o", "x" },
				{ "x", "x", "" } };
		// char[][] expected = { { 'x', 'o', 'o' }, { 'x', 'o', 'x' },{ 'x',
		// 'x', 'x' } };
		String[][] val = { { "x", "o", "o" }, { "x", "o", "x" },
				{ "x", "x", "" } };
		//String actual = board.printBoard(val);
		//assertArrayEquals(expected, actual);
	}

}
