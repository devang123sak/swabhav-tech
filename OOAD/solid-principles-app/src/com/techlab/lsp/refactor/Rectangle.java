package com.techlab.lsp.refactor;

public class Rectangle implements IPolygon {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int calculateArea() {
		int area = height * width;
		return area;
	}
}
