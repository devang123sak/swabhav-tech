package com.techlab.lsp.refactor;

public class Square implements IPolygon {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calculateArea() {
		int area = side * side;
		return area;
	}
}
