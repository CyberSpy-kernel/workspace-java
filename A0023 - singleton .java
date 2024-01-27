/*
 * Title: Singleton
 * Example 1 of singleton
 */
// File Name: A0023.java
public class A0023 {

  private static A0023 singleton = new A0023( );  // Replace TP001 with Singleton

  /* A private Constructor prevents any other
    * class from instantiating.
    */
  private A0023(){ }
  
  /* Static 'instance' method */
  public static A0023 getInstance( ) {
    return singleton;
  }

  /* Other methods protected by singleton-ness */
  protected static void demoMethod( ) {
    System.out.println("demoMethod for singleton");
  }
}
  
