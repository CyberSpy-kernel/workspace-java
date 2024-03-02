

package MyOIB;

import java.util.*;

class User {
    private String userID;
    private int password;

    public User(String userID, int password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public int getPassword() {
        return password;
    }
}

class Question {
    private String prompt;
    private String[] options;
    private char correctAnswer;

    public Question(String prompt, String[] options, char correctAnswer) {
        this.prompt = prompt;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getPrompt() {
        return prompt;
    }

    public String[] getOptions() {
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }
}

class OnlineExamSystem {
    private HashMap<String, User> users = new HashMap<>();
    private User currentUser;
    private Scanner scanner = new Scanner(System.in);

    public OnlineExamSystem() {
        initializeUsers();
    }

    void initializeUsers() {
        users.put("Soumya", new User("Artist", 12345));
    }

    void run() {
        login();
    }

    void login() {
        System.out.println("---------------- WELCOME TO ONLINE EXAM SYSTEM ----------------");
        System.out.print("Enter User-Id: ");
        String userID = scanner.next();
        System.out.print("Enter Password: ");
        int password = scanner.nextInt();

        if (users.containsKey(userID) && users.get(userID).getPassword() == password) {
            currentUser = users.get(userID);
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            homepage();
        } else {
            System.out.println("\n" + "Invalid login credentials.!!! Please try again...");
            login();
        }
    }
    private void updatePassword() {
      System.out.println("\n------------------ UPDATE PASSWORD ------------------");
      System.out.print("Enter Username: ");
      String username = scanner.next();
      System.out.print("Enter Old Password: ");
      int oldPassword = scanner.nextInt();
  
      if (users.containsKey(username)) {
          User user = users.get(username);
          if (oldPassword == user.getPassword()) {
              System.out.println("Old Password Verified...");
  
              while (true) {
                  System.out.print("\nEnter New Password: ");
                  int newPassword = scanner.nextInt();
                  System.out.print("ReEnter/Verify New Password: ");
                  int confirmNewPassword = scanner.nextInt();
  
                  if (confirmNewPassword == newPassword) {
                      System.out.println("Password matched...");
                      users.replace(username, new User(username, newPassword));
                      System.out.println("\nPassword Update Successfully...!");
                      break;
                  } else {
                      System.out.println("\nPassword didn't match.!!! Please try again...");
                      System.out.println("-----------------------------------------------------");
                  }
              }
          } else {
              System.out.println("\nWrong Password.!!! Try again later...");
              updatePassword();
          }
      } else {
          System.out.println("\nUser does not exist...");
          System.out.println("Profile Update Failed.!");
      }
  }
  
  public void solve(){
    long start = System.currentTimeMillis();
    long terminate = start + 60 * 1000;
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int c = 0, w = 0;
    char ans;
    System.out.println("\n\n----------------- STARTING THE TEST -----------------");
    System.out.println("You have 1 Minute to answer each question. Select the options wisely... ");
    System.out.println("Each question gives +5 marks for a correct answer and -1 mark for a wrong answer.");
    System.out.println("All the very best.!!");
    
    while(System.currentTimeMillis() < terminate)
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("(Coding)-Q1. System.out.println(?; ===> Here System & out is...?");
        System.out.println("\n" + "Options ---> ");
        System.out.println("a. System & out both are classes\nb. System is class and out is object reference of OutputPrintStream\nc. System is class and out is object reference of PrintStream\nd. System is class and out is object reference of FilePrintStream");
        System.out.print("\n" + "Answer: ");
        ans = sc.next().charAt(0);
        if(ans == 'c')
        {
            c += 1;
        }
        else
            w += 1;
        
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("(Coding)-Q2. Which of the following interface must contain a unique element?");
        System.out.println("\n" + "Options ---> ");
        System.out.println("a. Set\nb. Collection\nc. List\nd. Array");
        System.out.print("\n" + "Answer: ");
        ans = sc.next().charAt(0);
        if(ans == 'a')
        {
            c += 1;
        }
        else
            w += 1;
        
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("(Coding)-Q3. After performing these set of operations, what does the final list look contain?\n\nInsertFront(10);\nInsertFront(20);\nInsertRear(30);\nDeleteFront();\nInsertRear(40);\nInsertRear(10);\nDeleteRear();\nInsertRear(15);\ndisplay();");
        System.out.println("\n" + "Options ---> ");
        System.out.println("a. 20 30 40 10\nb. 10 30 10 15\nc. 10 30 40 15\nd. 20 30 40 15");
        System.out.print("\n" + "Answer: ");
        ans = sc.next().charAt(0);
        if(ans == 'c'){
            c += 1;
        }
        else
            w += 1;
        
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("(Coding)-Q4. Find the output of the following program...\n\npublic class Solution{\n    public static void main(String[] args){\n        byte x = 127;\n        x++;\n        x++;\n        System.out.print(x);\n    }\n}");
        System.out.println("\n" + "Options ---> ");
        System.out.println("a. 127\nb. -127\nc. 129\nd. 2");
        System.out.print("\n" + "Answer: ");
        ans = sc.next().charAt(0);
        if(ans == 'b')
        {
            c += 1;
        }
        else
            w += 1;
        
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("(Aptitude)-Q5. What is the least number to be subtracted from 945 to make it a perfect square?");
        System.out.println("\n" + "Options ---> ");
        System.out.println("a. 45\nb. 16\nc. 30\nd. 24");
        System.out.print("\n" + "Answer: ");
        ans = sc.next().charAt(0);
        if(ans == 'a') 
        {
            c += 1;
        }
        else
            w += 1;
        break;
    }
    
    System.out.println("\n" + "Test Completed.!");
    score = ((c * 5) - w);
    System.out.println("Number of correct answers: " + c);
    System.out.println("Congratulations!! Your scored " + score + " points...");
}

  
    void homepage() {
      System.out.println("-----------------------------------------------------");
      System.out.println("Online Examination System ---> Welcome " + currentUser.getUserID() + "!");
      System.out.println("-----------------------------------------------------");
      System.out.println("Select 1 to Update password...");
      System.out.println("Select 2 to Start the test...");
      System.out.println("Select 3 to Logout...");
      System.out.println("-----------------------------------------------------");
      System.out.print("Select Option: ");
      int selectedOption = scanner.nextInt();
  
      switch (selectedOption) {
          case 1:
              updatePassword();
              homepage();
              break;
          case 2:
              solve();
              homepage();
              break;
          case 3:
              System.out.println("\n" + "Logout Successfully...!");
              System.out.println("Thank You for Attending the Test...");
              System.out.println("-----------------------------------------------------");
              System.exit(0);
              break;
          default:
              System.out.println("\n" + "Invalid Option Choice.! Try again...");
              homepage();
              break;
      }
  }
    public static void main(String[] args) {
        OnlineExamSystem examSystem = new OnlineExamSystem();
        examSystem.run();
    }
}
