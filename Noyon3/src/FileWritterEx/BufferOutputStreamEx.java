package FileWritterEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		   BufferedOutputStream	obj=new BufferedOutputStream(new FileOutputStream("C:\\Users\\USER\\Desktop\\noyon1.txt"));
			obj.write("ADDIE soft Ltd".getBytes());
			obj.flush();
			System.out.println("successfully wrote to the file");
			
		   
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
       try {
			
			BufferedInputStream reader=new BufferedInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\noyon1.txt"));
			int number;
			
			while((number=reader.read())!=-1) {
				
				System.out.print((char)number);
			}
			
			reader.close();
			
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
		
	}

}
