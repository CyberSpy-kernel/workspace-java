import java.util.Scanner;

public class A0067 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] a = new int[r][c];

    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[i].length;j++){
        a[i][j] = sc.nextInt();
      }
    }

    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[i].length;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println(" ");
    }
    sc.close();
  }
}
