/*
 * Title: classic singleton
 * Example 2 of singleton
 */
public class A0027 {
  private static A0027 instance = null;
  private A0027() {
    // EXists only to defeat instantiation
  }
  public static A0027 getInstance() {
    if(instance == null) {
      instance = new A0027();
    }
    return instance;
  }
}
