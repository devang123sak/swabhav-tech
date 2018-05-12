package com.techlab.player.test;

import com.techlab.player.*;

public class TestPlayer {

	public static void main(String[] args) {
		Player p1 = new Player(100, "sachin", 25);
		displayData(p1);

		Player p2 = new Player(200, "rahul", 50);
		displayData(p2);

		Player p = p1.whoIsElder(p2);
		System.out.println(p);

	}

	public static void displayData(Player player) {
		System.out.println("Name = " + player.getName());
		System.out.println("ID = " + player.getId());
		System.out.println("Age = " + player.getAge());
		System.out.println(" ");
	}
}
