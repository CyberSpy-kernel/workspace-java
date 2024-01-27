public class AB007 {
  public static void main(String[] args) {
    int number = 11;

    // using ternary operator to determine if the number is even or odd
    String result = (number % 2 == 0) ? "Even": "Odd";

    System.out.println("The number is: "+ result);
  }
  
}
