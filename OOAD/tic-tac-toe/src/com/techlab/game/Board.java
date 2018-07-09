package com.techlab.game;

public class Board {

	Cell[][] cells;

	public void printBoard(String[][] cells) {
		System.out.println("  0   1   2");
		for (int row = 0; row < 3; row++) {
			System.out.print(row);
			for (int column = 0; column < 3; column++) {
				System.out.print(" " + cells[row][column] + "_|");

			}
			System.out.println("");
		}
	}

}
