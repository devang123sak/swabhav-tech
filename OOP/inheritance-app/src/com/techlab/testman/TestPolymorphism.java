package com.techlab.testman;

import com.techlab.man.Boy;
import com.techlab.man.Infant;
import com.techlab.man.Kid;
import com.techlab.man.Man;

public class TestPolymorphism {

	public static void main(String[] args) {

		Man x = new Man();// compile time polymorphism
		x.drink();
		x.eat();

		TestPolymorphism t = new TestPolymorphism();
		t.atThePark(new Boy());// runtime polymorphism
		t.atThePark(new Kid());
		t.atThePark(new Infant());

	}

	public void atThePark(Man x) {
		System.out.println("At the park");
		x.play();
	}
}
