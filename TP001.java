/*
 * Title: Singleton
 * Example 1 of singleton
 */
// File Name: TP001.java
public class TP001 {

  private static TP001 singleton = new TP001( );  // Replace TP001 with Singleton

  /* A private Constructor prevents any other
    * class from instantiating.
    */
  private TP001(){ }
  
  /* Static 'instance' method */
  public static TP001 getInstance( ) {
    return singleton;
  }

  /* Other methods protected by singleton-ness */
  protected static void demoMethod( ) {
    System.out.println("demoMethod for singleton");
  }
}
  
