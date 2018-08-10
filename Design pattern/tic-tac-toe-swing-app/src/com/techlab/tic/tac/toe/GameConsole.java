package com.techlab.tic.tac.toe;


public class GameConsole {
	Board board;
	Player player;
	Game game;
	static Mark charValue = null;
	static Mark mark = null;
	private static String icon = null;

	public String getIcon() {
		return icon;
	}

	public GameConsole() {
		board = new Board();
		player = new Player();
		game = new Game();
		board.initializeCell();
	}

	public void startGame(int x_position, int y_position)
			throws CellAlreadyMarkException {

		System.out.println(player.swicthPlayer());
		inputFromUser(board, x_position, y_position);
		printdata(board);
		game.checkCondition(board, player.playerTurn);
		System.out.println(" ");
	}

	public static void inputFromUser(Board board, int rowNumber, int colNumber)
			throws CellAlreadyMarkException {

		try {
			if (Player.playerTurn == "x") {
				charValue = Mark.X;
				icon = "X";

			} else {
				charValue = Mark.O;
				icon = "O";
			}
			board.setMark(rowNumber, colNumber, charValue);

		} catch (Exception e) {
			if (charValue.equals(Mark.X)) {
				Player.playerTurn = "";

			} else
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
