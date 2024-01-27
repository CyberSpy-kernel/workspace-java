/*
 * Title: Instance variables
 * Date: 12 Jan 2024
 */

 import java.io.*;

 public class TP010 {
  // this instance varible is visible for any child class
  public String name;

  // salary variable is visible in Employee class only.
  private double salary;

  // The name variable is assigned in the constructor.
  public TP010 (String empName) {
    name = empName;
  }

  // The salary variable is assigned a value.
  public void setSalary(double empSal){
    salary = empSal;
  }

  // This method prints the employee details
  public void printEmp() {
    System.out.println("name: "+name);
    System.out.println("Salary: "+ salary);
  }

  public static void main(String args[]) {
    TP010 empOne = new TP010("Artist");
    empOne.setSalary(1000);
    empOne.printEmp();
  }
 }