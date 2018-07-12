package com.techlab.game.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.game.Cell;

public class CellTest {
	
	Cell cell = new Cell();

	@Test
	public void findEmptyCellTest() {

		
		int expected = 0;
		
		String[][] value={ { "x", "x", "o" }, { "x", "o", "x" },{ "x", "x", "x" } };
		int actual=cell.findEmptyCell(value);
		
			assertEquals(expected,actual);
	}
	
	
	@Test
	public void placeMarkTest() {
		
		
		String[][] expected=new String[3][3];
		expected[1][1]="x";
		String[][] actual=cell.placeMark(1,1,"x");
		
		assertEquals(expected,actual);
	}

	
	@Test
	public void checkPlaceMarkTest() {
	
		boolean expected=true;
		String[][] value={ { "x", "x", "o" }, { "x", "o", "x" },{ "x", "", "" } };
		boolean actual=Cell.checkPlaceMark(value, 2, 2);
		assertEquals(expected,actual);
	}
	
}
