package builderPattern;

public class Laptop {

	private String brand;
	private int price;
	private String hddSize;
	private String screenSize;
	private String ram;
	private String graphicCard;

	public Laptop(String brand, int price, String hddSize, String screenSize,
			String ram, String graphicCard) {
		this.brand = brand;
		this.price = price;
		this.hddSize = hddSize;
		this.screenSize = screenSize;
		this.ram = ram;
		this.graphicCard = graphicCard;
	}

	@Override
	public String toString() {
		return "Laptop : " + "\n brand = " + this.brand + "\n price = "
				+ this.price + "\n hard Disk = " + this.hddSize
				+ "\n Screen Size = " + this.screenSize + "\n ram = "
				+ this.ram + "\n graphic Card = " + this.graphicCard;
	}

}
