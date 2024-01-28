/*
 * multilevel inheritance
 */

 
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class 1
class Mammal extends Animal {
    void move() {
        System.out.println("This mammal can move.");
    }
}

// Derived class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class A0016 {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();

        // Accessing methods from the base class
        myDog.eat();

        // Accessing methods from the first derived class
        myDog.move();

        // Accessing methods from the second derived class
        myDog.bark();
    }
}

