package com.techlab.game;

import java.util.Scanner;

public class GameConsole {

	public void startGame() throws CellAlreadyMarkException {

		Board board = new Board();
		Player player = new Player();
		Game game = new Game();
		board.initializeCell();
		boolean playing = true;
		while (playing) {
			System.out.println(player.swicthPlayer());
			inputFromUser(board);

			printdata(board);
			game.checkCondition(board, player.playerTurn);
			System.out.println(" ");

		}
	}

	public static void inputFromUser(Board board)
			throws CellAlreadyMarkException {
		Mark charValue = null;
		Mark mark = null;

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter row number:");
			int rowNumber = scan.nextInt();
			System.out.println("Enter col number:");
			int colNumber = scan.nextInt();

			if (Player.playerTurn == "x") {
				charValue = Mark.X;
			} else {
				charValue = Mark.O;
			}

			board.setMark(rowNumber, colNumber, charValue);
			System.out.println("(" + rowNumber + "," + colNumber + ")"
					+ charValue);
		} catch (Exception e) {
			if (charValue.equals(Mark.X))
				Player.playerTurn = "";
			else
				Player.playerTurn = "x";
		}

	}

	public static void printdata(Board board) {
		Cell[][] values = board.getAllCell();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + values[i][j] + "_|");

			}
			System.out.println("");
		}
		System.out.println("");
	}
}
