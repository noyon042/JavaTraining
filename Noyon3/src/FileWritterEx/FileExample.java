package FileWritterEx;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\USER\\Desktop\\abx.txt");
		
		if (file.exists()) {
			System.out.println("File Name="+file.getName());
			System.out.println("File Location="+file.getAbsolutePath());
			System.out.println("File Delete="+file.delete());
		}
		else {
			System.out.println("File not Exist");
		}
		
		//this if else condition for create a new file
		
//		if (file.createNewFile()) {
//			
//			System.out.println("Create a new file successfully");
//		}
//		else {
//			System.out.println("File Already Exits");
//		}
	}

}
