package FileWritterEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter obj=new FileWriter("C:\\Users\\USER\\Desktop\\nn.txt");
			
			obj.write("Hello,world\n");
			obj.write("This is a test file\n");
			obj.write("Bangladesh is a wonderful country");
			
			obj.close();
			
			System.out.println("successfully wrote to the file");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("File Not Found");
		}
	}

}
