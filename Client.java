import java.io.*;
import java.util.Scanner;



class Client{
  public static void main(String args[]){
    System.out.println("// // //  ///////  //       ///////  //    //  ///////");
    System.out.println("// // //  //       //       //   //  ///  ///  //     ");
    System.out.println("// // //  ///////  //       //   //  // // //  ///////");
    System.out.println("// // //  //       //       //   //  //    //  //     ");
    System.out.println("////////  ///////  ///////  ///////  //    //  ///////");
    //input name for chat
    System.out.print("Please enter your name:: ");
    Scanner k = new Scanner(System.in);
    String name = k.nextLine() + ": ";
    String input;
    //create send and reviece object
    Send send = new Send();
    Recieve recieve = new Recieve();
    //output and input loop
    while(true){
    System.out.print("::");
    input = k.nextLine();
    if(input.length()>0){
        System.out.println(input);
    }
  }
  }
}
