package com.techlab.game.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.game.Board;
import com.techlab.game.Cell;
import com.techlab.game.ResultAnalyzer;

public class BoardTest {

	Board board = new Board();
	String[][] cells=new String[3][3];
	@Test
	public void printBoardTest() {

		cells[0][0]="x";
		cells[0][1]="o";
		cells[0][2]="o";
		cells[1][0]="x";
		cells[1][1]="o";
		//String[][] expected = { { "x", "o", "o" }, { "x", "o", "x" },{ "x", "x", "" } };
		String[][] val = { { "x", "o", "o" }, { "x", "o", "x" },{ "x", "x", "" } };
		
		//assertArrayEquals(expecteds, actuals);
	}

}
