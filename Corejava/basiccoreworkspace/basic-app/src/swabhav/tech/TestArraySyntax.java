package swabhav.tech;

public class TestArraySyntax {

	public static void main(String[] args) {
		printArray();

	}

	static void printArray() {
		int[] arrayValue = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arrayValue.length; i++) {
			System.out.println(arrayValue[i]);
		}
	}

}
