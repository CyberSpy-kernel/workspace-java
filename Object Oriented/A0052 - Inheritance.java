
/*
 * Title: Inheritance
 */

// superclass (Parent class)
class Animal {
 void eat() {
   System.out.println("Animal is eating");
 }
}
// subclass (child class) inheriting from animal
class Dog extends Animal { 
 void bark() {
   System.out.println("Dog is barking");
 }
}

public class A0052 {
  public static void main(String[] args) {
    // Creating an instance of the subclass
    Dog myDog = new Dog();
  
    // Accessing methods from the superclass
    myDog.eat();  // Output: Animal is eating
  
    // Accessing methods from the subclass
    myDog.bark(); // Output: Dog is barking
  }
}
