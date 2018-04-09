package swabhav.tech;

public class TestTable {
	public static void main(String[] args) {
		printTable(5);
		printTable(7);

	}

	static void printTable(int number) {
		System.out.println("Displaying the Table of" + number);
		int count = 1;
		while (count <= 10) {
			System.out.println(count + " x " + number + "=" + (count * number));
			count = count + 1;
		}
	}
}
