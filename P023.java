
import java.util.*;


public class P023 { // TestJavaCollection1
  
  public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<String>();  // Creating arrayList

    list.add("Artist"); // Adding object in arraylist
    list.add("Ghost");
    list.add("Specter");

    // Traversing list through iterator
    Iterator itr = list.iterator();

    while(itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
