import java.net.*;
import java.io.*;

class Server {
	public static void main(String args[]) {
		
		int port = Integer.parseInt(args[0]);

		ServerSocket serverSocket = new ServerSocket(port);
		Socket client = serverSocket.accept();
	}
}