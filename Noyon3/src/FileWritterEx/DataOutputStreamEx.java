package FileWritterEx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		DataOutputStream obj=  new DataOutputStream(new FileOutputStream("C:\\Users\\USER\\Desktop\\noyon1.txt"));
		
		obj.writeInt(10);
		obj.writeDouble(10.10);
		obj.writeChar('A');
		obj.writeFloat(12.3f);
		
		obj.close();
		System.out.println("successfully store the data");
		
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			
		
		DataInputStream obj1= new DataInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\noyon1.txt"));
		

		System.out.println(obj1.readInt());
		System.out.println(obj1.readDouble());
		System.out.println(obj1.readChar());
		System.out.println(obj1.readFloat());
		obj1.close();
		
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
