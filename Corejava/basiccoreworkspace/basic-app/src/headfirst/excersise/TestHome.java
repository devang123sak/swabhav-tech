package headfirst.excersise;

public class TestHome {

	private int a = 20;
	private String name;

	public TestHome(int a, String name) {
		this.a = a;
		this.name = name;

	}

	public TestHome() {
	}

	public static void main(String[] args) {
		TestHome t = new TestHome();
		System.out.println(t.a);
		TestHome t1 = new TestHome(1, "dev");
		System.out.println(t1.name + "=" + t1.a);

	}

}
