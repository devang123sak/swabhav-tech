package swabhav.tech;

public class TestSwitchSyntax {

	public static void main(String[] args) {
		System.out.println("1) Addition");
		System.out.println("2) Subtracation");
		System.out.println("3) Multiplication");
		System.out.println("4) Divison");
		// int number = 1;
		char operator = '-';
		System.out.println("Given value is = " + operator);
		System.out.println();

		caseStudy(operator);

	}

	private static void caseStudy(int operator) {
		switch (operator) {
		case '+': {
			System.out.println("a+b");
			break;
		}
		case '-': {
			System.out.println("a-b");
			break;
		}
		case '*': {
			System.out.println("a*b");
			break;
		}
		case '/': {
			System.out.println("a/b");
			break;
		}
		default: {
			System.out.println("Enter right value");
		}
		}
	}

}
