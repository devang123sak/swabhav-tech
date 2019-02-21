package testClass;

public class PrimeNumberDisp {

	public static void main(String[] args) {

		int n = 13;
		int halfValue = n / 2;

		for (int count = 2; count <= halfValue; count++) {
			int val = n % count;
			if (val == 0) {
				System.out.println("not prime number");
			} else {
				System.out.println(" prime number");
			}
		}
	}

}
