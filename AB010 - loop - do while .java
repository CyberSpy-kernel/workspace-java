/*
 * Title: do wile loop
 */

import java.util.Scanner;

public class AB010 {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Initialize a variable to store user input
    int userInput;

    // Example of a do-while loop
    do {
      // Ask the user to enter a number 
      System.out.println("Enter a number (0 to exit): ");

      // read the user input
      userInput = sc.nextInt();

      // print the entered number 
      System.out.println("You entered: "+userInput);
    } while (userInput != 0); // Continue looping as long as the user input is not 0

    // Close the scanner
    sc.close();

    System.out.println("Loop exited because 0 was entered.");
  }
  
}
