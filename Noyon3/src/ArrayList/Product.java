package ArrayList;



public class Product {

	private String name;
	private String  brand;
	private int qty;
	private int price;
	private double amount;
	
	public Product(String name,String brand,int qty,int price,double amount) {
		this.name=name;
		this.brand=brand;
		this.qty=qty;
		this.price=price;
		this.amount=amount;
	}
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name=name;
	}
	
	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand=brand;
	}
	
	public int getqty() {
		return qty;
	}

	public void setqty(int qty) {
		this.qty=qty;
	}
	
	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price=price;
	}
	
	public Double getamount() {
		return amount;
	}

	public void setamount(Double amount) {
		this.amount=amount;
	}
	
	
	public void display() {
		
		System.out.println("Name:"+name+" Brand:"+brand+" Price:"+price+" Qty:"+qty+" Amount:"+amount);
	}
}
