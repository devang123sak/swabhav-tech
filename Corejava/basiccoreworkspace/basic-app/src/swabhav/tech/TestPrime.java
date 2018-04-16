package swabhav.tech;

public class TestPrime {

	public static void main(String[] args) {
		// primeValue(21);
		// printAllPrimeBelow(100);
		printAllPrimeBetweenRange(10, 50);

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
			for (int count = 2; count <= number; count++) {
				int halfValue = count / 2;
				boolean isPrime = true;

				for (int count1 = 2; count1 <= halfValue; count1++) {
					int newValue = count % count1;
					if (newValue == 0) {
						isPrime = false;

					}

				}
				if (isPrime) {
					System.out.println(count);

				}
			}

		}
	}

	static void printAllPrimeBetweenRange(int start, int end) {
		for (int count = start; count <= end; count++) {
			int halfValue = count / 2;
			boolean isPrime = true;
			for (int count1 = 2; count1 <= halfValue; count1++) {
				int newValue = count % count1;
				if (newValue == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(count);
			}
		}
	}

}
