package com.techlab.tic.tac.toe;

import javax.swing.JFrame;

public class Game {

	private JFrame buttonAction;
	TicTacToeGui ticTacToeGui;// =new TicTacToeGui();
	ResultAnalyzer resultAnalyzer = new ResultAnalyzer();

	public boolean checkCondition(Board board, String playerTurn) {
		try {

			boolean result = resultAnalyzer.win(board);
			if (result == true) {
				System.out.println("******  " + playerTurn
						+ "'s Player win  ******");
				ticTacToeGui.displayResultLabel(playerTurn);

			} else if (board.isFull() == false) {
				System.out.println("******  Match draw  ******");
			}
		} catch (Exception e) {
		}
		return false;
	}

}
