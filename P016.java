/*
 * Encapsulation
 * ref: YouTube-learn coding
 */
class A {
  private int value; // data hiding
  public void setValue(int x) { // data  abstraction
    value = x;  // value = 100
  }
  public int getValue() {
    return value;
  }
}
public class P016 {
  public static void main(String[] args) {
    A var = new A();
    var.setValue(5);
    System.out.println(var.getValue());
  }
}