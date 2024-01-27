/*
 * Title: classic singleton
 * Example 2 of singleton
 */
public class TP007 {
  private static TP007 instance = null;
  private TP007() {
    // EXists only to defeat instantiation
  }
  public static TP007 getInstance() {
    if(instance == null) {
      instance = new TP007();
    }
    return instance;
  }
}
