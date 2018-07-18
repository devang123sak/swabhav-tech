package com.techlab.game.test;

import com.techlab.game.GameConsole;
import com.techlab.game.CellAlreadyMarkException;

public class TieTacToeGameTest {

	public static void main(String[] args) throws CellAlreadyMarkException  {

		GameConsole gameConsole = new GameConsole();
		gameConsole.startGame();
	}

}
