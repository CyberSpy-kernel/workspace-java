/*
 * Hierarchical inheritance
 * hierarchical inheritance occurs when a class inherits from more than one class. 
 * It forms a herarchy where multiple classes are derived from a single base class.
 */


// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Derived class 3 (inherits from Animal)
class Horse extends Animal {
    void neigh() {
        System.out.println("Horse is neighing");
    }
}

public class GPT017 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Horse myHorse = new Horse();

        // Using methods from the base class
        myDog.eat();  // Output: Animal is eating
        myCat.eat();  // Output: Animal is eating
        myHorse.eat(); // Output: Animal is eating

        // Using methods specific to each derived class
        myDog.bark();  // Output: Dog is barking
        myCat.meow();  // Output: Cat is meowing
        myHorse.neigh(); // Output: Horse is neighing
    }
}

