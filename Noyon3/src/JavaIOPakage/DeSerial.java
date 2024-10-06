package JavaIOPakage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileInputStream file=new FileInputStream("emp.txt");
			ObjectInputStream ois=new ObjectInputStream(file);
			Employee emp=(Employee)ois.readObject();
			emp.display();
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
