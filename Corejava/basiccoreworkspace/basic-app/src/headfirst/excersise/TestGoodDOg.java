package headfirst.excersise;

public class TestGoodDOg {

	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(5);
		one.bark();

		GoodDog t = new GoodDog();
		t.setSize(50);
		t.bark();

	}
}

class GoodDog {

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	void bark() {
		if (size > 60) {
			System.out.println("Woof!woof");
		} else if (size > 14) {
			System.out.println("Ruff!ruff");

		} else {
			System.out.println("Yip!yip");
		}
	}
}
