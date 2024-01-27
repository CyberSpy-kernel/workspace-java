/*
 * Title: Class/static variables
 * Date: 12 Jan 2024
 */

import java.io.*;

public class TP011 {
  // salary variable is a privaete static varible 
  private static double salary;

  // DEPARTMENT is a constant 

  public static final String DEPARTMENT = "Development ";
  public static void main(String[] args) {
    salary = 1000;
    System.out.println(DEPARTMENT + "average salary: " + salary);

  }
}