package com.techlab.player.test;

import com.techlab.player.*;

public class TestArray {

	public static void main(String[] args) {
		Player[] manyPlayers = new Player[3];

		manyPlayers[0] = new Player(10, "dev");
		manyPlayers[1] = new Player(20, "rahul");
		manyPlayers[2] = new Player(30, "sachin");

		for (Player p : manyPlayers) {
			System.out.println("name = "+p.getName());
			System.out.println("id = "+p.getId());
		}

	}

}
