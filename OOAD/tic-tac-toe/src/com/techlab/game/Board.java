package com.techlab.game;

public class Board {

	Cell[][] cells;

	public void printBoard(String[][] cells) {
		System.out.println("  0   1   2");
		for (int row = 0; row < 3; row++) {
			System.out.print(row);
			for (int column = 0; column < 3; column++) {
				if (cells[row][column] == "x" || cells[row][column] == "o") {
					System.out.print(" " + cells[row][column] + "_|");
				} else {
					cells[row][column] = ".";
					System.out.print(" " + cells[row][column] + "_|");
				}
			}
			System.out.println("");
		}
	}

}
