// widening casting (automatically
// byte > short > char > int > long > float > double
// narrowing casting (manually)
// double > float > long > int > char > short > byte

public class A0072 {
    public static void main(String[] args) {
        int i = 8;
        long l = i;   // automatic casting / implicit casting from int to long
        
        System.out.println("Line 1: "+i);
        System.out.println("Line 2: "+l);

        double d = 10.5;
        i = (int) d;    // manual casting / explicit casting from double to int
        System.out.println("Line 3: "+d);
        System.out.println("Line 4: "+i);

        char c = (char) i; // explicit casting from int to char
        System.out.println("Line 5: "+c);

        String s = "123";
        int ia = Integer.parseInt(s);
        System.out.println("Line 6: "+ia);
    }
}
