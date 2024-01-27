/*
 * Synchronized modifier
 * the synchronized modifier is used to control access to a method or block of code by multiple threads. it ensures that only one thread can access the synchronized method or block at a time.
 */
public class A0013 {
  private int counter = 0;
  public synchronized void increament() {
    counter++;
  }
}
