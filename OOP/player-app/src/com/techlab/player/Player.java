package com.techlab.player;

public class Player {

	private String name;
	private int id;
	private int age;
	private static int numberOfObject;
	private static int headCount;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("player created");
		numberOfObject = numberOfObject + 1;
		headCount = headCount + 1;

	}

	public Player(int id, String name) {
		this(id, name, 18);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player whoIsElder(Player player) {

		if (this.age > player.getAge()) {

			return this;
		}
		return player;

	}

	public int howManyObjects() {

		return numberOfObject;
	}

	public static int headCount() {

		return headCount;
	}

	@Override
	public String toString() {
		String data = "name = " + name + " ID = " + id + " age = " + age;
		return data;
	}

}
