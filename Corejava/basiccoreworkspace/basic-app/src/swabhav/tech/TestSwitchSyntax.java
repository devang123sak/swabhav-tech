package swabhav.tech;

public class TestSwitchSyntax {

	public static void main(String[] args) {
		System.out.println("1) Addition");
		System.out.println("2) Subtracation");
		System.out.println("3) Multiplication");
		System.out.println("4) Divison");
		int number = 1;
		System.out.println("Given value is = " + number);
		System.out.println();
		
		
		caseStudy(number);

	}

	private static void caseStudy(int number) {
		switch (number) {
		case "addition": {
			System.out.println("a+b");
			break;
		}
		case "subtracation": {
			System.out.println("a-b");
			break;
		}
		case "multiply": {
			System.out.println("a*b");
			break;
		}
		case "division": {
			System.out.println("a/b");
			break;
		}
		default: {
			System.out.println("Enter right value");
		}
		}
	}

}
