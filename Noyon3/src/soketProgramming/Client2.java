package soketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            Socket socket = new Socket("localhost", 8001);

            // To read server-side input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            // To send messages to the server
            PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);

            // To read messages from the server
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String userMessage, serverMessage;

            System.out.println("Type your messages (type 'exit' to quit):");

            // Loop to send multiple messages
            while (true) {
                System.out.print("You: ");
                userMessage = userInputReader.readLine();

                if (userMessage.equalsIgnoreCase("exit")) {
                    break;
                    // Exit the loop when the user types 'exit'
                }

                // Send the user message to the server
                socketWriter.println(userMessage);

                // Read the server's response
                serverMessage = socketReader.readLine();
                System.out.println("Server: " + serverMessage);
            }

            // Close the socket and the streams
            socket.close();
            userInputReader.close();
            socketWriter.close();
            socketReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
