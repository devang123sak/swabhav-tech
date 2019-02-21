package testClass;

public class EvennumberPrint {

	public static void main(String[] args) {

		System.out.println("display even number");
		evenNumber(13, 23);

	}

	public static void evenNumber(int number) {
		for (int count = 0; count <= number; count++) {
			int remainder = count % 2;
			if (remainder == 0) {
				System.out.println(count);
			}

		}
	}

	public static void evenNumber(int number1, int number2) {
		for (int count = number1; count <= number2; count++) {
			int remainder = count % 2;
			if (remainder == 0) {
				System.out.println(count);
			}

		}
	}
}
