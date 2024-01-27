
/*
 * Interface 
 * interface is a way to achieve abstraction, allowing you to define a contract for classes that implement the interface
 */
// Define an interface named Animal
interface Animal {
    // Abstract method (method without a body)
    void makeSound();

    // Another abstract method
    void sleep();
}

// Implementing the Animal interface in a class
class Dog implements Animal {
    // Implementing the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Implementing the sleep method
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

// Another class implementing the Animal interface
class Cat implements Animal {
    // Implementing the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    // Implementing the sleep method
    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}

// Main class to demonstrate the usage of the interface
public class A0019 {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();

        // Create an instance of Cat
        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();
    }
}
