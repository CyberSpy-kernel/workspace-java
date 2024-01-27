/*
 * Title: Array methods
 * 
 */

public class P022 {
  public static void main(String[] args) {
    Integer x = 5;

    // returns byte primitive data types
    System.out.println("Line 1: "+x.byteValue());

    // returns double primitive data type
    System.out.println("Line 2: "+x.doubleValue());

    // returns long primitive daty type 
    System.out.println("Line 3: "+x.longValue());

    // compareTo()
    System.out.println("Line 4: "+x.compareTo(3));  // if the integer is less than the argument then -1 is returned
    System.out.println("Line 4: "+x.compareTo(5));  // if the integer is equal to the argument then 0 is returned
    System.out.println("Line 4: "+x.compareTo(8));  // if the integer is greater than the argument then 1 is returned

    // equals() method
    Integer y = 10;
    Integer z = 5;
    Short a = 5;

    System.out.println("Line 5: "+x.equals(y));
    System.out.println("Line 5: "+x.equals(z));
    System.out.println("Line 5: "+x.equals(a));

    // valueOf() method
    Integer d = Integer.valueOf(9);
    Double c = Double.valueOf(5);
    Float e = Float.valueOf("80");

    Integer b = Integer.valueOf("444", 16);

    System.out.println("Line 6: "+d);
    System.out.println("Line 6: "+c);
    System.out.println("Line 6: "+e);
    System.out.println("Line 6: "+b);
  }
  
}
