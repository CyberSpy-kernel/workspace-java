

/*
 * Title: method overriding
 * ref: youtube-Telusko-V52
 */


class Calc {
  public int add(int n1, int n2) {
    return n1+n2;
  }
}
class AddCalc extends Calc {
  public int add(int n1, int n2) { // method overriding
    return n1+n2+1;
  }
}

public class AB014 {
  public static void main(String[] args) {
    AddCalc o = new AddCalc();
    int r1 = o.add(3, 4);
    System.out.println(r1);
  }
  
}
