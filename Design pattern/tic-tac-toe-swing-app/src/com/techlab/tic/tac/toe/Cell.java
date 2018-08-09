package com.techlab.tic.tac.toe;

public class Cell {
	private Mark mark;

	public Cell() {
		mark = mark.EMPTY;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		if (mark != mark.EMPTY) {
			this.mark = mark;
		}
	}

	@Override
	public String toString() {
		return this.mark.toString();
	}

}
