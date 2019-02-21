package builderPattern.test;

import builderPattern.Laptop;

public class LaptopTest {

	public static void main(String[] args) {

		Laptop laptop = new Laptop("hp", 40000, "1 tb", "15.6", "8gb", "2gb");
		System.out.println(laptop);
		
		Laptop laptop1 = new Laptop("hp", 40000, "1 tb", null, "8gb", "2gb");
		System.out.println(laptop1);
	}

}
