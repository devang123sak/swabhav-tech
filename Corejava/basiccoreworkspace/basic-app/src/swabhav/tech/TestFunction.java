package swabhav.tech;

public class TestFunction {

	public static void main(String[] args) {
		// printLine();
		printLine("@");

	}

	private static void printLine(String string) {

		System.out.println("2222222222");
		int count = 1;
		while (count < 100) {
			System.out.print(string);
			count = count + 1;
		}

	}

	static void printLine() {
		System.out
				.println("======================================================");

	}

}
