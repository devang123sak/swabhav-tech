package com.techlab.testman;

import com.techlab.man.Boy;
import com.techlab.man.Man;

public class TestManBoy {

	public static void main(String[] args) {

		Man x; // x extends Man or subclass of Man
		x = new Boy();

		x.drink();
		x.eat();
		x.play();
	}

}
