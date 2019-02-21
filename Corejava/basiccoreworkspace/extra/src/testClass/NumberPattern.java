package testClass;

public class NumberPattern {

	public static void main(String[] args) {

		
		for(int count = 5; count >=1 ; count--) {
		
			for(int count1=6-count;count1>=1;count1--)
			{
				//int count2=6-count;
				System.out.print(count1);
			}
			System.out.println("");
		}
	}

	public void displayTraingle() {
		for (int count = 1; count <= 5; count++) {
			for (int space = 1; space <= 5 - count; space++) {
				System.out.print(" ");
			}
			for (int count1 = 1; count1 <= count; count1++) {
				// System.out.print(" ");
				System.out.print(count1);
			}
			for (int count2 = count - 1; count2 >= 1; count2--) {
				System.out.print(count2);
			}

			System.out.println();

		}
	}
}
