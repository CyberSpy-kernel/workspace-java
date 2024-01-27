
/*
 * Title: Continue statement
 */
public class P013 {
  public static void main(String[] args) {
    for(int i=1;i<=5;i++) {
      if(i%2!=0){
        System.out.println("Skipping iteration for odd number: "+i);
        continue; // Skip to the next iteration
      }
      // This code will be skipped for odd numbers due to the continue statement
      System.out.println("Proccessing even number: "+i);
    }
  }
  
}
