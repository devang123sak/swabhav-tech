package com.techlab.game;

import java.util.Scanner;

public class GameConsole {

	static Cell cell;
	Game game;
	Board board;
	Player player;

	public void startGame() {

		cell = new Cell();
		board = new Board();
		player = new Player();
		boolean playing = true;
		while (playing) {
			System.out.println(player.swicthPlayer());
			inputFromUser();
			board.printBoard(cell.getCell());
			game.checkCondition();
			System.out.println(" ");

		}
	}

	public static void inputFromUser() {
		String charValue = null;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter row number:");
			int rowNumber = scan.nextInt();
			System.out.println("Enter col number:");
			int colNumber = scan.nextInt();

			if (Player.playerTurn == "x") {
				charValue = "x";
			} else {
				charValue = "o";
			}

			Cell.placeMark(rowNumber, colNumber, charValue);
			System.out.println("(" + rowNumber + "," + colNumber + ")"
					+ charValue);
		} catch (Exception e) {
			if (charValue == "x")
				Player.playerTurn = "";
			else
				Player.playerTurn = "x";
			System.out.println("Enter valid number");
		}
	}

}
