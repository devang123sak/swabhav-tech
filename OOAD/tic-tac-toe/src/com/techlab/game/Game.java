package com.techlab.game;

public class Game {
	private static ResultAnalyzer resultAnalyzer;
	static Cell cell;

	public static void checkCondition() {
		try {
			resultAnalyzer.hasWon(cell.getCell(), Player.playerTurn);
			resultAnalyzer.drawGame(cell.getCell());
			resultAnalyzer.exitGame();
		} catch (Exception e) {
		}

	}

}
