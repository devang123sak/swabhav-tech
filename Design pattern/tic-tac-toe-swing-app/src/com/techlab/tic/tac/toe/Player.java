package com.techlab.tic.tac.toe;

public class Player {

	public static String playerTurn = "o";

	public String swicthPlayer() {
		String currentPlayerTurn = null;
		if (playerTurn == "x")
			playerTurn = "o";
		else
			playerTurn = "x";
		if (playerTurn == "x") {
			currentPlayerTurn = "Player x's is turn";
		} else if (playerTurn == "o") {
			currentPlayerTurn = "Player o's is turn";
		}
		return currentPlayerTurn;
	}

}
