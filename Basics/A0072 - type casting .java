// widening casting (automatically
// byte > short > char > int > long > float > double
// narrowing casting (manually)
// double > float > long > int > char > short > byte

public class A0072 {
    public static void main(String[] args) {
        int i = 8;
        double d = i;   // automatic casting
        
        System.out.println(i);
        System.out.println(d);

        i = (int) d;    // manual casting
        System.out.println(d);
        System.out.println(i);
    }
}
