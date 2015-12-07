import java.net.*;
import java.io.*;
import java.util.Scanner;	

class Server {
	public static void main(String args[]) {
		
		//get user port
		int port = Integer.parseInt(args[0]);

		//Build server side socket
		ServerSocket serverSocket = new ServerSocket(port);
		Socket client = serverSocket.accept();

		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		//create input and output variables
		String input, output;

		//creates new scanner object
		Scanner content = new Scanner(in);

		while ((inputLine = in.readLine()) != null) {
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
	}
}