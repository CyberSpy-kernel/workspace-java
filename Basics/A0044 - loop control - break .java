/*
 * Title: Break statement
 */

public class A0044 {
  public static void main(String[] args) {
    for(int i=1;i<=10;i++) {
      System.out.println("Current value of i: "+i);

      // Break the loop if i is equal to 5
      if (i==3) {
        System.out.println("Breaking the loop because i is 3");
        break;
      }
    }

    // Example of using break in a switch statement
    int choice = 2;
    switch (choice) {
      case 1:
        System.out.println("You chose option 1");
        break;
      case 2:
        System.out.println("You chose option 2");
        break;
      case 3:
        System.out.println("You chose option 3");
        break;
      default:
        System.out.println("Invalid choise");
    }
  }
}
