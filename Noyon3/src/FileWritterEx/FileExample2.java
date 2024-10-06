package FileWritterEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample2 {

	public static void main(String[] args) throws IOException {

		//new file create
		File file=new File("C:\\Users\\USER\\Desktop\\noyon1.txt");
		if (file.createNewFile()) {
			
			System.out.println("Create a new file successfully");
		}
		else {
			System.out.println("File Already Exits");
		}
		
		
		//file writer:write something in a new file
		//work on FileOutputStream
		try {
			FileOutputStream obj=new FileOutputStream("C:\\Users\\USER\\Desktop\\noyon1.txt");
			
			obj.write("Hello,Freshers\n".getBytes());
			obj.write("Welcome to ADDIE\n".getBytes());
			obj.write("This Company is Best Oportunity For You\n".getBytes());
			obj.write("25000\n".getBytes());
			obj.write("12".getBytes());
			obj.close();
			
			System.out.println("successfully wrote to the file");
			
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
		
		
		//file reader:read the word of that file
		//work on FileInputStream
         try {
			
			FileInputStream reader=new FileInputStream("C:\\Users\\USER\\Desktop\\noyon1.txt");
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
