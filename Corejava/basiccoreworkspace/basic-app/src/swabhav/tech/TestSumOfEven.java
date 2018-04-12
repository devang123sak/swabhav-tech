package swabhav.tech;

public class TestSumOfEven {

	public static void main(String[] args) {

		SumOfEven(10, 20);

	}

	static void SumOfEven(int number) {
		int sum = 0;

		for (int count = 0; count <= number; count++) {

			int newValue = count % 2;
			if (newValue == 0) {
				sum = sum + count;
				newValue = newValue + 1;
			}
		}
		System.out.println("Sum of Even number till " + number + " = " + sum);

	}

	static void SumOfEven(int start, int end) {

		int sum = 0;

		for (int count = start; count <= end; count++) {
			int newValue = start % 2;
			if (newValue == 0) {
				sum = sum + count;

			}

		}
		System.out.println("Sum of number between " + start + " to " + end
				+ " is = " + sum);
	}
}
