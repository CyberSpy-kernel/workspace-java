import java.util.Scanner;

public class AB002 {
  public static void main(String[] args) {
    // Create a Scanner object to get input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a number
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    // Check the conditions using if-else if-else statement
    if(number > 0) {
      System.out.println("The number is positive.");
    } else if(number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }

    // Close the scanner to avoid resource leak
    scanner.close();
  }
}
