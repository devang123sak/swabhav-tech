package com.techlab.drumkit;

class DrumKit {

	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	void playHotHat() {
		System.out.println("ding ding da-ding");
	}

}

public class DrumKitTsetDrive {

	public static void main(String[] args) {

		DrumKit d = new DrumKit();
		d.playSnare();
		d.playHotHat();

	}

}
