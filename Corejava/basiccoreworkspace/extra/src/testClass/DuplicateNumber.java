package testClass;

public class DuplicateNumber {

	public static void main(String[] args) {

		for(int count=1;count<=100;count++)
		{
			int a=count%10;
			int b=count/10;
			if(a==b)
			{
				System.out.println(count);
			}
		}
	}

}
