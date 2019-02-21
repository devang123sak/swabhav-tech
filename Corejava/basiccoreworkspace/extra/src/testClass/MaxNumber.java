package testClass;

public class MaxNumber {

	public static void main(String[] args) {

		int a[] = { 1, 8, 6, 9, 2, 7 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {			//1<8
					int temp = a[i];		//int temp=1
					a[i] = a[j];			//a[i]=8
					a[j] = temp;			//a[j]=1

				}
			}
		}

		for (int d : a) {
			System.out.println(d);
		}
	}
}
