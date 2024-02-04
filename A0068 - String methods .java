// String methods

public class A0068 {
  public static void main(String[] args) {
    String s = "Hello world";

    char a = s.charAt(9);
    System.out.println("charAt(9): "+a);

    int r = s.codePointAt(2);
    System.out.println("s.codePointAt(2): "+r);

    r = s.codePointBefore(3);
    System.out.println("s.codePointBefor(3): "+r);

    String s1 = "Hello";
    r = s.compareTo(s1);
    System.out.println("s.compareTo(s1): "+r);

    r = s.compareToIgnoreCase(s1);
    System.out.println("s.compareToIgnoreCase(s1): "+r);

    String s2 = s.concat(s1);
    System.out.println("s.concat(s1): "+s2);

    boolean b = s.contains("e");
    System.out.println("s.contains('e'): "+b);

    s = "Hello";
    b = s.contentEquals("Hello");
    System.out.println("s.contentEquals(\"Hello\"): "+b);

    char[] myStr1 = {'H','e','l','l','o'};
    String myStr2 = "";
    myStr2 = myStr2.copyValueOf(myStr1, 0, 3);
    System.out.println("myStr2: "+myStr2);
  }  
}

/*
 * charAt()
 * codePointAt()
 * codePointBefore()
 * codePointCount()
 * compareTo()
 * compareToIgnoreCase()
 * concat()
 * contains()
 * contentEquals()
 * copyValueOf()
 */
