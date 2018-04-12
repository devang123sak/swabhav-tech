package swabhav.tech;

public class TestReturnFunction {

	public static void main(String[] args) {
		double pi = getPiValue();
		System.out.println(pi);

		boolean isEven = checkEven(9);
		System.out.println(isEven);
		boolean isPrime = checkPrime(23);
		System.out.println(isPrime);
	}

	static double getPiValue() {
		return 22 / 7.0;
	}

	static boolean checkEven(int number) {

		if (number % 2 == 0) {
			return true;

		} else {
			return false;
		}

	}

	static boolean checkPrime(int number) {
		int newValue = 0, halfValue = number / 2;
		for (int count = 2; count <= halfValue; count++) {
			newValue = number % count;
			if (newValue == 0) {

				return false;

			}

		}

		return true;
	}

}
