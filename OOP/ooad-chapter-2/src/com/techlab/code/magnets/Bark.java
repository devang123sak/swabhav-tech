package com.techlab.code.magnets;

import java.util.ArrayList;

public class Bark {
	private String sound;

	public Bark(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Object bark) {

		if (bark instanceof Bark) {
			Bark otherBark = (Bark) bark;
			if (this.sound.equalsIgnoreCase(otherBark.sound)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return sound;
	}
}
