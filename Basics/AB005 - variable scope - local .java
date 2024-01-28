

/* Local variable scope
 * Local variables are declared withing a method, constructor, 
 * or block and are only accessible within that specific scope.
 */


public class AB005 {
    public void exampleMethod() {
        // Local variable scope
        int localVar = 10;
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        P005 example = new P005();
        example.exampleMethod();
        
        // Cannot access 'localVar' here; it's out of scope
        // System.out.println("Trying to access localVar: " + localVar); // This would result in a compilation error
    }
}

