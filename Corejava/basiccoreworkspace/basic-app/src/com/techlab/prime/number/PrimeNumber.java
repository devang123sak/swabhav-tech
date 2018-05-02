package com.techlab.prime.number;

public class PrimeNumber {
	private int number;

	public PrimeNumber(int number) {
		this.number = number;
	}

	public void setValue(int number) {
		this.number = number;

	}

	public void primeNumber() {
		int remainder = 0, count1;

		for (int count = 2; count <= number; count++) {

			boolean isPrime = true;
			int halfValue = count / 2;

			for (count1 = 2; count1 <= halfValue; count1++) {
				remainder = count % count1;

				if (remainder == 0) {
					isPrime = false;

				}
			}
			if (isPrime) {
				System.out.println(count);

			}
		}
	}
}
