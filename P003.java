/*
 * Title: Premetive Data types
 * 
 */

public class P003 {
  public static void main(String[] args) {
    // Integral Types
    byte myByte = 127;
    short myShort = 32000;
    int myInt = 123456;
    long myLong = 123456789L; // Note the 'L' suffix for long literals
    
    // Floating-point Types
    float myFloat = 3.14f; // Note the 'f' suffix for float literals
    double myDouble = 2.71828;
    
    // Character Type
    char myChar = 'A';
    
    // Boolean Type
    boolean myBoolean = true;

    // String
    String myString = "Hello, Java!";
    
    // Arrays
    int[] myIntArray = {1, 2, 3, 4, 5};
    String[] myStringArray = {"apple", "banana", "orange"};

    System.out.println("byte: "+myByte);
    System.out.println("short: "+myShort);
    System.out.println("int: "+myInt);    
    System.out.println("long: "+myLong);
    System.out.println("float: "+myFloat);
    System.out.println("double: "+myDouble); 
    System.out.println("char: "+myChar);
    System.out.println("boolean: "+myBoolean);
    System.out.println("String: "+myString);
    
    for (int i=0;i<myStringArray.length;i++) {
      System.out.println("myStringArray["+i+"]"+myStringArray[i]);
    }
    int i = 0;
    for (int num : myIntArray) {
      System.out.println("myIntArray["+ i++ +"]: "+num);
    }
  }
}
