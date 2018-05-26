package com.techlab.test.manboy;

import com.techlab.manboy.Boy;
import com.techlab.manboy.IEmotional;
import com.techlab.manboy.IManners;
import com.techlab.manboy.Man;

public class TestClass {

	public static void main(String[] args) {
		//atTheMovie(new Man());
		atTheMovie(new Boy());

		atTheParty(new Man());
		atTheParty(new Boy());

	}

	public static void atTheMovie(IEmotional obj) {
		obj.cry();
		obj.laugh();
	}

	public static void atTheParty(IManners obj) {
		obj.wish();
		obj.depart();
	}

}
