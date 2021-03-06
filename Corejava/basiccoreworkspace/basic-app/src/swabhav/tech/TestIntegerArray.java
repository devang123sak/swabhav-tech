package swabhav.tech;

public class TestIntegerArray {

	public static void main(String[] args) {
		int[] nos = { 10, 20, 70, 80, 30, 40 };
		// printNumber(nos);
		// printSum(nos);
		// printAverage(nos);
		// printArrayOfMax(nos);
		printSecondMax(nos);
	}

	static void printNumber(int[] nos) {

		for (int n : nos) {
			System.out.println(n);
		}

	}

	static void printSum(int[] nos) {

		int sumValue = 0;
		for (int n : nos) {
			sumValue = sumValue + n;
		}
		System.out.println("Sum of all nos array is = " + sumValue);
	}

	static void printAverage(int[] nos) {

		int sumValue = 0;
		for (int n : nos) {
			sumValue = sumValue + n;
		}
		double averageValue = sumValue / nos.length;
		System.out.println("Average value of nos array = " + averageValue);
	}

	static void printArrayOfMax(int[] nos) {
		int maxValue = nos[0];
		for (int n : nos) {
			if (maxValue < n) {
				maxValue = n;
			}
		}
		System.out.println(maxValue);

	}

	static void printSecondMax(int[] nos) {

		int largestValue = nos[0];
		int secondValue = nos[0];

		for (int n : nos) {
			if (largestValue < n) {
				secondValue = largestValue;
				largestValue = n;

			} else if (n > secondValue) {
				secondValue = n;
			}
		}
		System.out.println("highest value = " + largestValue);
		System.out.println("Second highest value = " + secondValue);
	}
}
