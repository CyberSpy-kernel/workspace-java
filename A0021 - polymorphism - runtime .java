/*
 * polymorphism
 * runtime 
 */

public class A0021 {
  class Animal {
    void sound() {
      System.out.println("Animal makes a sound");
    }
  }
  
  class Dog extends Animal {
    void sound() {
      System.out.println("Dog barks");
    }
  }  
}
