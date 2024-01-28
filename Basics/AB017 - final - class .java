/*
 * date: 17 jan 24
 * title: final class
 * description: final class cannot be extended. and it cannot be an abstract class
 */

final class Vehical {
  // body of class
  void start() {
    System.out.println("The engine is started");
  }
}
public class AB017 {
  public static void main(String[] args) {
    Vehical car = new Vehical();
    car.start();
  }
}
