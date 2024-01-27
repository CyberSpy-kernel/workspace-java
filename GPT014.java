/*
 * Transient Modifier
 * the transient modifier is used with instance variables to indicate that they should not be serialized when an object of the class is serialized.
 */
import java.io.Serializable;

public class GPT014 implements Serializable {
  transient int transientVariable = 10;
}
