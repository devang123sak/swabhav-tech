package com.techlab.inheritance.example;

public class ManTest {

	public static void main(String[] args) {
		Boy b = new Boy();
		b.eat();
		b.play();
		b.walk();
		System.out.println("");

		Kid k = new Kid();
		k.read();
		k.play();
		System.out.println("");

		Man m = new Man();
		m.play();
		m.walk();
		b.eat();

	}

}
