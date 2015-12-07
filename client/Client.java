import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client{
  public static void main(String args[]) {

    //prints a welcome message
    System.out.println("// // //  ///////  //       ///////  //    //  ///////");
    System.out.println("// // //  //       //       //   //  ///  ///  //     ");
    System.out.println("// // //  ///////  //       //   //  // // //  ///////");
    System.out.println("// // //  //       //       //   //  //    //  //     ");
    System.out.println("////////  ///////  ///////  ///////  //    //  ///////");
    
    //gets host name and port
    String host = args[0];
    int port = Integer.parseInt(args[1]);
    
    //creates socket 
    Socket messageSocket = new Socket(host, port);
    
    //Creates PrintWriter, BufferedReader objects, and Scanner Objects
    PrintWriter output = new PrintWriter(messageSocket.getOutputStream(), true);
    BufferedReader input = new BufferedReader(new InputStreamReader(messageSocket.getInputStream()));
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
  }
}