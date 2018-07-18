package com.techlab.game;

public class Game {
	ResultAnalyzer resultAnalyzer = new ResultAnalyzer();

	public boolean checkCondition(Board board, String playerTurn) {
		try {
			boolean result = resultAnalyzer.win(board);
			if (result == true) {
				System.out.println("******  " + playerTurn
						+ "'s Player win  ******");
				System.exit(0);
			} else if (board.isFull() == false) {
				System.out.println("******  Match draw  ******");
				System.exit(0);
			}
		} catch (Exception e) {
		}
		return false;
	}

}
