package FileWritterEx;

import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileReader reader=new FileReader("C:\\Users\\USER\\Desktop\\nn.txt");
			int number;
			
			while((number=reader.read())!=-1) {
				
				System.out.print((char)number);
			}
			
			reader.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}



}
