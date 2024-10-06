package soketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		Socket socket=new Socket("localhost",8001);
		
		OutputStream output=socket.getOutputStream();
		PrintWriter writer=new PrintWriter(output, true);
		
		InputStream input=socket.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(input));
		
		//Send a message to the Server
		writer.println("Hi Server");
		
		//read response from the server
		String response=reader.readLine();
         System.out.println("Received from server");
         
         //close connection
         socket.close();
	}
	    catch(IOException e) {
	    	e.printStackTrace();
				
		
		
		
	}
	}
}
