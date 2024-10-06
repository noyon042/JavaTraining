package JavaIOPakage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductDesSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileInputStream file=new FileInputStream("pro.txt");
			ObjectInputStream ois=new ObjectInputStream(file);
			Product prdt=(Product)ois.readObject();
			prdt.display();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
