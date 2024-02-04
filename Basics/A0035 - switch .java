/*
 * Title: Switch statement
 */


public class A0035 {
  public static void main(String[] args) {
    int dayOfWeek = 3;

    String dayName;
    
    // Switch statement to determine the day name
    switch (dayOfWeek) {
      case 1:
        dayName = "Sunday";
        break;
      case 2:
        dayName = "Monday";
        break;
      case 3:
        dayName = "Tuesday";
        break;
      case 4:
        dayName = "Wednesday";
        break;
      case 5:
        dayName = "Thursday";
        break;
      case 6:
        dayName = "Friday";
        break;
      case 7:
        dayName = "Saturday";
        break;
      default:
        dayName = "Invalid day";
    }

    // print the result
    System.out.println("The day is: "+dayName);
  }
  
}
