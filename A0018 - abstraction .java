/*
 * Abstraction
 * abstraction is key concept of OOPs that allows you to 
 * hide the complex implementation details of an object and expose only the essential
 * features. this is typically achieved through abstract classes and interfaces.
 */

// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double area();

    // Concrete method
    void displayArea() {
        System.out.println("Area: " + area());
    }
}

// Concrete subclass 1
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Main class
public class GPT018 {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Using abstract class reference to achieve abstraction
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        // Calling abstract method without knowing the specific implementation
        shape1.displayArea(); // Output: Area: 78.53981633974483
        shape2.displayArea(); // Output: Area: 24.0
    }
}
