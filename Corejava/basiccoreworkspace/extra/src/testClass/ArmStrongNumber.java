package testClass;

public class ArmStrongNumber {

	public static void main(String args[]) {
		int a, b, c, sum, e, f;

		for (int count = 0; count < 1000; count++) {
			a = count % 10;
			e = count / 10;
			b = e % 10;
			f = count / 100;
			c = f % 10;

			sum = (a * a * a) + (b * b * b) + (c * c * c);

			if (count == sum) {
				System.out.println("NUmber = " + sum);
			}
		}
	}
}
