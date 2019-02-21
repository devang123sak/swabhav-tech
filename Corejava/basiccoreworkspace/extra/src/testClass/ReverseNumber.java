package testClass;

public class ReverseNumber {

	public static void main(String[] args) {

		int n = 1478525, reverse = 0;

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;

		}

		System.out.println("Reverse of the number is " + reverse);

	}

}
