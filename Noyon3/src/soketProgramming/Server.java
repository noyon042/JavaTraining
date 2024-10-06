package soketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//create serverSocket port
			
			ServerSocket serverSocket=new ServerSocket(8001);
			System.out.println("Server is listening on port 8001...");
			
			//client connected
			Socket socket= serverSocket.accept();
		 System.out.println("Client Connected");
		 
		 //Received message from client
		 InputStream input=socket.getInputStream();
		 BufferedReader reader=new BufferedReader(new InputStreamReader(input));
		 
		 //sent message client
		 OutputStream output=socket.getOutputStream();
		 PrintWriter writer=new PrintWriter(output,true);
		 
		 //read message from the client
		 String message=reader.readLine();
		 System.out.println("Received from client:"+message);
		 
		 //send response back to the client
		 writer.println("Hello from Server!");
			
		 //close connection
		 socket.close();
		 serverSocket.close();
		 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
