package com.techlab.game;

public class ResultAnalyzer {

	public boolean win(Board board) {
		Cell[][] cellArray = board.getAllCell();
		if (checkHorizontal(cellArray) == true
				|| checkVertical(cellArray) == true
				|| checkDiagonal(cellArray) == true) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkVertical(Cell[][] cellArray) {

		for (int i = 0; i < 3; i++) {
			if (cellArray[0][i].getMark() != Mark.EMPTY
					&& cellArray[0][i].getMark() == cellArray[1][i].getMark()
					&& cellArray[1][i].getMark() == cellArray[2][i].getMark()) {
				return true;
			}
		}
		return false;
	}

	private boolean checkHorizontal(Cell[][] cellArray) {

		for (int i = 0; i < 3; i++) {
			if (cellArray[i][0].getMark() != Mark.EMPTY
					&& cellArray[i][0].getMark() == cellArray[i][1].getMark()
					&& cellArray[i][1].getMark() == cellArray[i][2].getMark()) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagonal(Cell[][] cellArray) {
		if (cellArray[0][0].getMark() != Mark.EMPTY
				&& cellArray[0][0].getMark() == cellArray[1][1].getMark()
				&& cellArray[1][1].getMark() == cellArray[2][2].getMark()) {
			return true;
		} else if (cellArray[0][2].getMark() != Mark.EMPTY
				&& cellArray[0][2].getMark() == cellArray[1][1].getMark()
				&& cellArray[1][1].getMark() == cellArray[2][0].getMark()) {
			return true;
		} else {
			return false;
		}

	}
}
