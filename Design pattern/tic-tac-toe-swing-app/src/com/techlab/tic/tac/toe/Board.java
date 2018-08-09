package com.techlab.tic.tac.toe;

public class Board {
	Cell[][] cells = new Cell[3][3];

	public Cell[][] getAllCell() {
		return cells;
	}

	public Cell[][] initializeCell() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				cells[row][col] = new Cell();
			}
		}
		return cells;
	}

	public void setMark(int row, int col, Mark mark) throws Exception {

		try {
			if (checkPlaceMark(row, col, mark) == true) {
				if ((0 <= row && row < 3) && (0 <= col && col < 3)) {
					cells[row][col].setMark(mark);
				} else {
					System.out.println("Invalid number");
				}
			} else {
				throw new CellAlreadyMarkException("Cell Already mark. ");
			}
		} catch (CellAlreadyMarkException ex) {
			System.out.println(ex.message);
			throw new Exception();
		}

	}

	private boolean checkPlaceMark(int row, int col, Mark mark) {
		if (cells[row][col].getMark() == Mark.EMPTY) {
			return true;
		}
		return false;
	}

	public Boolean isFull() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (cells[row][col].getMark() == Mark.EMPTY)
					return true;
			}
		}
		return false;
	}

}
