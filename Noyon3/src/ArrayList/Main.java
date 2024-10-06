package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> products=new ArrayList<>();
		products.add(new Product("Apple","Fruits", 5, 200, 5*200));
		products.add(new Product("Orange","Fruits", 3, 300, 3*300));
		products.add(new Product("Lemon","Fruits", 4, 250, 4*400));
		
		products.get(1).setname("pepe");
		products.get(2).setprice(400);

		
	for (Product product : products) {
		System.out.println("Name:"+product.getname()+" Brand:"+product.getbrand()+" Qty:"+product.getqty()+" Price:"+product.getprice()+" Amount:"+product.getamount());

	}

	
	}
}
