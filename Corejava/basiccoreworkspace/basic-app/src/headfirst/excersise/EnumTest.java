package headfirst.excersise;

import headfirst.excersise.Enum.Gender;

public class EnumTest {
	// Enum declaration can be done outside a Class or inside a Class but not
	// inside a Method.
	enum Color {
		RED, GREEN, YELLOW
	};

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	public static void main(String[] args) {
		// for direct output below command is used.
		Color c1 = Color.RED;
		System.out.println("Color is = " + c1);

		// for print all values inside enum value() method used.
		for (Color c : Color.values()) {
			System.out.println(c);

		}

		Gender g = Gender.MALE;
		System.out.println(g);
	}

}
