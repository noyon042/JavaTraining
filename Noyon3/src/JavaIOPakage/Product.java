package JavaIOPakage;

import java.io.Serializable;

public class Product implements Serializable{

	private String name;
	private String category;
	private String brand;
	private int qty;
	private Double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("name:"+this.name+"\n"+"category:"+this.category+"\n"+"brand:"+this.brand+"\n"+"qty:"+this.qty+"\n"+"price:"+this.price);
	}
	
}
