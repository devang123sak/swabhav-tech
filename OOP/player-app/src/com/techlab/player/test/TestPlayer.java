package com.techlab.player.test;

import com.techlab.player.*;

public class TestPlayer {

	public static void main(String[] args) {
		Player p1 = new Player(100, "sachin", 25);
		System.out.println("p1 = " + p1.howManyObjects());
		displayData(p1);

		Player p2 = new Player(200, "rahul", 50);
		System.out.println("p1 = " + p1.howManyObjects());
		System.out.println(Player.headCount());
		displayData(p2);

		// Player p = p1.whoIsElder(p2);
		// System.out.println(p);

		Player p3 = new Player(300, "raj");
		System.out.println("p1 = " + p1.howManyObjects());
		displayData(p3);

		System.out.println("p2 = " + p2.howManyObjects());
		System.out.println("p3 = " + p3.howManyObjects());
	}

	public static void displayData(Player player) {
		System.out.println("Name = " + player.getName());
		System.out.println("ID = " + player.getId());
		System.out.println("Age = " + player.getAge());
		System.out.println("Head count " + Player.headCount());
		System.out.println(" ");
	}
}
