package com.techlab.game;

public class Cell {
	private static int row;
	private static int column;
	private static String[][] cell;

	public Cell() {
		cell = new String[3][3];
	}

	public static String[][] getCell() {
		return cell;
	}

	public int findEmptyCell(String[][] cell) {

		int emptyCellCount = 0;
		for (row = 0; row < 3; row++) {
			for (column = 0; column < 3; column++) {
				if (cell[row][column] == "x" || cell[row][column] == "o") {
				} else {
					emptyCellCount++;
				}
			}
		}
		return emptyCellCount;
	}

	public static String[][] placeMark(int rowNumber, int colNumber,
			String charValue) {
		cell[rowNumber][colNumber] = charValue;
		return cell;
	}
}
