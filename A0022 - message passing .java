/*
 * Title: Message passing
 * 
 */

class Example {
  void showMessage(String message) {
    System.out.println("Received Message: "+ message);
  }
}
public class A0022 {
  public static void main(String[] args) {
    Example obj = new Example();
    obj.showMessage("Hello, Java!");
  }
}
