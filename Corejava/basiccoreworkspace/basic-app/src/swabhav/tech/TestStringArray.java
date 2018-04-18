package swabhav.tech;

public class TestStringArray {

	public static void main(String[] args) {
		String[] names = getNames();
		printNames(names);
	}

	static String[] getNames() {
		String[] names = { "raj", "anish", "sachin", "rahul" };
		return names;
	}

	static void printNames(String[] names) {
		for (String n : names) {
			System.out.println(n);
		}
	}

}
