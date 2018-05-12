package com.techlab.compiler;

class TapeDeck {
	boolean canRecord = false;

	void playtype() {
		System.out.println("tape playing");
	}

	void recordTape() {
		System.out.println("tape recording");
	}
}

public class TapeDeckTestDrive {

	public static void main(String[] args) {
		TapeDeck t = new TapeDeck();
		t.canRecord = true;
		t.playtype();

		if (t.canRecord == true) {
			t.recordTape();
		}

	}

}
