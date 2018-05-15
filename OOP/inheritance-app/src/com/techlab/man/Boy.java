package com.techlab.man;

public class Boy extends Man {

	public Boy() {
		System.out.println("Boy created");
	}

	public void read() {
		System.out.println("Boy is Reading");
	}

	@Override
	// Annotations
	public void play() {
		System.out.println("Boy is Playing");
	}

}
