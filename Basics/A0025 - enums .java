/*
 * Enums were introduced in Java 5.0
 * Enms restrict a variable to have one of only a few predefined values.
 */



class FreshJuice {
  enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
  FreshJuiceSize size;
}

public class A0025 {
  public static void main(String[] args) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
    System.out.println("Size: " + juice.size);
  }
}
