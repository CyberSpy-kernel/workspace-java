/* Class (static) variables
 * class variables are declared with the 'static' keyword and 
 * are shared among all instances of a class. They have class-level scope.
 */


public class P007 {
  // Class (static variable scope)
  private static int classVar = 30;

  public void exMethod() {
    System.out.println("Class Variable: "+classVar);
  }
  public static void main(String[] args) {
    P007 example1 = new P007();
    P007 example2 = new P007();

    example1.exMethod();  // Accessing class variable through instance 1
    example2.exMethod();  // Accessing class variable through instance 2

    // Accessing class varible directly
    System.out.println("Accessing classVar directly: "+P007.classVar);
  }
  
}

