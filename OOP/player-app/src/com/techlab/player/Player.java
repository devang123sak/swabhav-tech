package com.techlab.player;

public class Player {

	private String name;
	private int id;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
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

	public void setAge(int age)
	{
		this.age=age;
	}
	public Player whoIsElder(Player player) {

		if (this.age < player.getAge()) {
			
			return this ;
		} else {
			return player;
		}
	}
}
