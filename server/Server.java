import java.net.*;
import java.io.*;
import java.util.Scanner;	

class Server {
	public static void main(String args[]) throws IOException {
		
		if (args.length != 1) {
            System.err.println("Usage: java Server <port number>");
            System.exit(1);
        }

		//get user port
		int port = Integer.parseInt(args[0]);

		try (
		//Build server side socket
		ServerSocket serverSocket = new ServerSocket(port);
		Socket client = serverSocket.accept();

		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        ) {
		//create input and output variables
		String input, output;

		//creates new scanner object
		Scanner content = new Scanner(in);
		input = content.nextLine();

		//manages output
		while (input != null) {
           output = input;
           out.println(output);
		}
		} catch (IOException e) {
			System.out.println("Exception caught when trying to listen on port " + port + " or listening for a connection");
            System.out.println(e.getMessage());
		}
	}
}