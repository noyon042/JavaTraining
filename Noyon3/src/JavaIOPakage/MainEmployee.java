package JavaIOPakage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Employee("Md.Noyon Mahmud", " 0177734734", " noyon@gmail.com", " Software Developer");
//		Employee obj1=new Employee();
		
		try {
			
			FileOutputStream file=new FileOutputStream("emp.txt");
			ObjectOutputStream obs=new ObjectOutputStream(file);
			obs.writeObject(obj);
			obs.close();
			file.close();
			System.out.println("Serialization successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
