package FilePathCreate;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilePath {

	public static void main(String[] args) {
		
		try {
			
			File file=new File ("C:\\Noyon\\New.txt");
			Scanner sc=new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
	
		}
	}
}
