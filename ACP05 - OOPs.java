
/*
 * Title: OOPs
 */

class Pen {
  String color;
  String type;  // ballpoint; gel

  public void write() {
    System.out.println("Writing somthing");
  }
  public void printColor() {
    System.out.println(this.color);
  }
}
class Student {
  String name;
  int age;
  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }
  Student(String name, int age) { // constructor
    this.name = name;
    this.age = age;
    System.out.println("Constructor called!");
  }
}
public class ACP05 {
  public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "gel";

    pen1.write();
    pen1.printColor();

    Pen pen2 = new Pen();
    pen2.color = "Black";
    pen2.type = "ballpoint";

    pen2.printColor();

    Student s1 = new Student("Artist", 23);

    s1.printInfo();
  }
}
