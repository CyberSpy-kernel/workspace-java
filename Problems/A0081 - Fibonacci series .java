import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int first, last, result, count;
    first = last = result = count = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Give fibonacci series till n th place: ");
    System.out.print("n = ");
    int n = sc.nextInt();

    while (count < n) {
      first = last ;
      last = result;
      result = first + last;
      System.out.println(result);
      if(result < 1) last ++;
      count ++;
    }
  }
}
