package patikaStore;

public class MobilePhone extends Product{
	private int ram;
	private int storage;
	private int bateryPower;
	private double screenSize;
	private String color;

	public MobilePhone(String deviceName, int id, String productName, double unitPrice, Brand brandName,
			int discountRate, int amountOfStock,int bateryPower, int ram, int storage, double screenSize, String color) {
		super(deviceName, id, productName, unitPrice, brandName, discountRate, amountOfStock);
		this.ram = ram;
		this.storage = storage;
		this.bateryPower=bateryPower;
		this.screenSize = screenSize;
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBateryPower() {
		return bateryPower;
	}
	public void setBateryPower(int bateryPower) {
		this.bateryPower = bateryPower;
	}
	
	
}
