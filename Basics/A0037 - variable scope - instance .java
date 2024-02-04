
/* Instance variables
 * Instance variables are declared within a class but outside of any method, constuctor, or block. 
 * They belong to the instance of the class and can be acessed within any method or block of that instance.
 */

public class A0037 {
    // Instance variable scope
    private int instanceVar = 20;

    public void exampleMethod() {
        System.out.println("Instance variable: " + instanceVar);
    }

    public static void main(String[] args) {
        P006 example = new P006();
        example.exampleMethod();
        
        // Accessing instance variable directly
        System.out.println("Accessing instanceVar directly: " + example.instanceVar);
    }
}

