package patikaStore;

public class Product {
	private int id;
	private String productName;
	private double unitPrice;
	private int discountRate;
	private int amountOfStock;
	private Brand brandName;
	private String deviceName;
	
	public Product(String deviceName,int id,String productName, double unitPrice, Brand brandName, int discountRate, int amountOfStock) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
		this.amountOfStock = amountOfStock;
		this.productName = productName;
		this.brandName = brandName;
		this.deviceName=deviceName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public int getAmountOfStock() {
		return amountOfStock;
	}
	public void setAmountOfStock(int amountOfStock) {
		this.amountOfStock = amountOfStock;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Brand getBrandName() {
		return brandName;
	}
	public void setBrandName(Brand brandName) {
		this.brandName = brandName;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
	
}

