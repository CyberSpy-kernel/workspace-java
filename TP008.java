/*
 * Title: Creating Object
 */
public class TP008 {

  int age;

  public TP008(String name) {
    // This constructor has one parameter, name.
    System.out.println("Passed Name is: "+ name);
  }

  public void setAge(int a) {
    age = a;
  }

  public int getAge() {
    System.out.println("Puppy's age is: " +age);
    return age;
  }

  public static void main(String [] args) {
    // following statement would create an object myPuppy

    TP008 myPuppy = new TP008("tommy");   // object creation

    myPuppy.setAge(2);  // call class method to set puppy's age

    myPuppy.getAge();

    System.out.println("Variable value: "+ myPuppy.age);

  }
}
