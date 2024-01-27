/*
 * date: 16 Jan 2024
 * title: final keyword 
 * description: this will declare the variable as 'final' or 'constant', which means unchangable and read-only
 */

public class P017 {
  public static void main(String[] args) {
    final int myNum = 123;
    // myNum = 12; // this line will generate an error: cannot assign a value to final variable
    System.out.println(myNum);
  }
}
