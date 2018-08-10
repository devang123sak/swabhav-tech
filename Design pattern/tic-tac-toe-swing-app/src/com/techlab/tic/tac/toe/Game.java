package com.techlab.tic.tac.toe;


public class Game {

	TicTacToeGui ticTacToeGui=new TicTacToeGui();
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
				playerTurn="Draw";
				ticTacToeGui.displayResultLabel(playerTurn);
			}
		} catch (Exception e) {
		}
		return false;
	}

}
