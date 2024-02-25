package Basics;

// difference between '==' and '.equals()' 

public class A0083 {
  public static void main(String[] args) {
    String s1 = new String("hello");
    String s2 = new String("hello");

    if(s1 == s2) {
      System.out.println("The string are equal");
    } else {
      System.out.println("The string are not equal");
    }
    System.out.println("---------");
    if(s1.equals(s2)) {
      System.out.println("The string are equal");
    } else {
      System.out.println("The string are not equal");
    }
    System.out.println("---------");
    System.out.println(s1);
    System.out.println(s2);
  }
}
