package testClass;

public class Palindrome {

	public static void main(String[] args) {

		String var = "madam";
		boolean isTrue = true;
		for (int count = 0; count <= var.length() / 2; count++) {
			int a = count;
			int b = var.length() - count - 1;
			if (var.charAt(a) == var.charAt(b)) {
				// System.out.println(var.charAt(count));
				isTrue = true;

			} else {
				isTrue = false;
			}

		}
		if (isTrue) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
