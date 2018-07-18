package com.techlab.game;

public class CellAlreadyMarkException extends Exception {

	String message;

	public CellAlreadyMarkException(String message) {
		this.message = message;
	}

	public String toString() {
		return ("Exception Occurred: " + message);
	}
}
