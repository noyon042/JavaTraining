package JavaIOPakage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product obj=new Product();
		obj.setName("Basundhara");
		obj.setCategory("Level A");
		obj.setBrand("Brand Good");
		obj.setQty(23);
		obj.setPrice(2323.32);
		obj.display();
		
		try {
			
			FileOutputStream file=new FileOutputStream("pro.txt");
			ObjectOutputStream obs=new ObjectOutputStream(file);
			obs.writeObject(obj);
			obs.close();
			file.close();
			System.out.println("Serialization successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
