
/*
 * Title: Regular Expression
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A0028 {  // A0028 
  public static void main(String[] args) {
    Pattern p = Pattern.compile(".am");
    Matcher m = p.matcher(".am");
    Boolean b = m.matches();
    // the pattern ".am" matches the string ".am", the output will be: true
    System.out.println("Line 01: " + b);


    Boolean c = Pattern.matches(".m", "am");
    System.out.println("Line 02: " + c);
    // The dot (.) matches any single character. In this case, the string "am" matches the pattern ".m", so c will be set to true.

    System.out.println("Line 03: " + Pattern.matches("[amn]", "amn"));  
    /*
    The regular expression "[amn]" means it will match any single character that is either 'a', 'm', or 'n'. In this case, the string "acd" does not match because none of its characters ('a', 'c', 'd') are 'a', 'm', or 'n'. the result printed to the console will be: false
    */


    System.out.println("Line 04: " + Pattern.matches("[^amn]", "c"));
    // this pattern matches any single character that is not 'a', 'm', or 'n'. In this case, the string "c" does not contain 'a', 'm', or 'n', so it matches the pattern.


    System.out.println("Line 05: " + Pattern.matches("[a-zA-S]", "T"));

    
    System.out.println("Line 06: " + Pattern.matches("[MS][a-z]{5}","Monica"));
    System.out.println("Line 07: " + Pattern.matches("[xyz]?", "x"));
    System.out.println("Line 08: " + Pattern.matches("[xyz]+", "x"));
    System.out.println("Line 09: " + Pattern.matches("[xyz]*", "xyyza"));
    System.out.println("Line 10: " + Pattern.matches("\\d", "1"));
    System.out.println("Line 11: " + Pattern.matches("\\D", "1"));

  }
}
