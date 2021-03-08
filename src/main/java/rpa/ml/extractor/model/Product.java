package rpa.ml.extractor.model;

public class Product {
	
	private int id;
	private String name;
	private String salesAmount;
	private String price;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String salesAmount, String price) {
		this.id = id;
		this.name = name;
		this.salesAmount = salesAmount;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
 
}