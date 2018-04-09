package swabhav.tech;

public class TestGrade {

	public static void main(String[] args) {

		resultOf(7.2f);
		resultOf(5.5f);

	}

	static void resultOf(float cgpa) {
		
		if (cgpa >= 8) {
			System.out.println("Result is outstanding");
		} else if (cgpa >= 7) {
			System.out.println("Result is first class");
		} else if (cgpa >= 6) {
			System.out.println("Result is second class");
		} else if (cgpa < 6) {
			System.out.println("Result is fail");
		}
	}

}
