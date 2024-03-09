package Basics;

// difference between '==' and '.equals()' 
package Advanced;

public class A0082 {
  public static void main(String[] args) {
    String string1 = new String("hello");
    String string2 = new String("hello");

    System.out.println("Test 1: ");
    if (string1 == string2) {
      System.out.println("The strings are equal");
    } else {
      System.out.println("The strings are not equal");
    }
    
    System.out.println("Test 2: ");
    if (string1.equals(string2)) {
      System.out.println("The strings are equal");
    } else {
      System.out.println("The strings are not equal");
    }
    

    string1 = "hello";
    string2 = "hello";
    
    System.out.println("Test 3: ");
    if (string1 == string2) {
      System.out.println("The strings are equal");
    } else {
      System.out.println("The strings are not equal");
    }
    
    System.out.println("Test 4: ");
    if (string1.equals(string2)) {
      System.out.println("The strings are equal");
    } else {
      System.out.println("The strings are not equal");
    }
    
    System.out.println(string1);
    System.out.println(string2);
  }
}

