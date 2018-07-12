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

		if (checkPlaceMark(getCell(), rowNumber, colNumber) == true)
			cell[rowNumber][colNumber] = charValue;
		return cell;
	}

	public static boolean checkPlaceMark(String[][] cell, int rowNumber,
			int colNumber) {
		if (cell[rowNumber][colNumber] == "x"
				|| cell[rowNumber][colNumber] == "o") {
			System.out.println("Mark is already present here");

			return false;
		}
		return true;
	}
}
