package swabhav.tech;

public class TestPrime {

	public static void main(String[] args) {
		// primeValue(21);
		// printAllPrimeBelow(10);
		int isPrint = primeNumber(13);
		System.out.println(isPrint);
	}

	static void primeValue(int number) {
		boolean isPrime = true;
		int newValue = 0;
		int halfValue = number / 2;
		for (int count = 2; count <= halfValue; count++) {

			newValue = number % count;
			if (newValue == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("This is prime number");
		} else {
			System.out.println("This is not prime number");
		}

	}

	static void printAllPrimeBelow(int number) {
		{

		}
	}

	static int primeNumber(int number) {

		int newValue = 0, halfNumber = number / 2;
		for (int count = 2; count <= halfNumber; count++) {

			newValue = number % count;
			if (newValue == 0) {

			

			}
		}

		return newValue;

	}
}
