
/*
 * Title: Java Enums
 */

class FreshJuice {
  enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
  FreshJuiceSize size;
}

public class A0026 {

  public static void main(String[] args) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    
    String a = "Hello";

    System.out.println(a.getClass().getName());
    System.out.println(juice.getClass().getName());
    System.out.println(juice.size.getClass().getName());

    System.out.println("Size: "+juice.size);
  }
}
