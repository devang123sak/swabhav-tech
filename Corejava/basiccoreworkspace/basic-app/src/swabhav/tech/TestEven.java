package swabhav.tech;

public class TestEven {
	public static void main(String[] args) {
		System.out.println("Display even number");
		// printEvenNo(50);
		printEvenNo(30, 60);

	}

	static void printEvenNo(int number) {
		int count;
		for (count = 0; count <= number; count += 2) {
			System.out.println(count);

		}
	}

	static void printEvenNo(int start, int end) {
		for (int count = start; count <= end; count += 2) {
			System.out.println(count);
		}
	}
}
