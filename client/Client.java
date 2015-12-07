import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client{
  public static void main(String args[]) throws IOException {
    

    if (args.length != 2) {
        System.err.println("Usage: java Client <host name> <port number>");
            System.exit(1);
        }

    //gets host name and port
    String host = args[0];
    int port = Integer.parseInt(args[1]);
    
    
    try (
    //creates socket 
    Socket messageSocket = new Socket(host, port);
    
    //Creates PrintWriter, BufferedReader objects, and Scanner Objects
    PrintWriter output = new PrintWriter(messageSocket.getOutputStream(), true);
    BufferedReader input = new BufferedReader(new InputStreamReader(messageSocket.getInputStream()));
    ) {
    Scanner contentFromServer = new Scanner(input);
    Scanner contentFromUser = new Scanner(System.in);

    //create input and output variable
    String serverMessage;
    String clientMessage;

    //accepts user input & displays other messages
    while (true) {

        serverMessage = contentFromServer.nextLine();        
        
        if ( !(serverMessage.equals(null))) {
            System.out.println(serverMessage);
        }
           
        clientMessage = contentFromUser.nextLine();
        
        if ( !(clientMessage.equals(null))) {
            System.out.println(clientMessage);
        }      
    }
    } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + host);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                host);
            System.exit(1);
        }        
    }
}