
import java.io.*;
import java.util.*;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}
class Adder extends Arithmetic {
    Adder() {
        System.out.println("My superclass is: "+ getClass().getSuperclass().getName());
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder adder = new Adder();
        
        System.out.print(adder.add(20,22)+" "+adder.add(10,3)+" "+adder.add(5,15));
    }
}
