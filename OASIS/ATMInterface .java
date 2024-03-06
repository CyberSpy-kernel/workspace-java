package MyOIB;

import java.util.Scanner;

class Account {
  private int pin;
  private int balance;
  private int depositAmount;
  private int withdrawAmount;

  public Account(int pin, int initialBalance) {
    this.pin = pin;
    this.balance = initialBalance;
  }

  public boolean validatePin(int enteredPin) {
    return this.pin == enteredPin;
  }

  public void deposit(int amount) {
    depositAmount += amount;
    balance += amount;
  }

  public boolean withdraw(int amount) {
    if (amount > balance) {
      return false; // Insufficient balance
    }
    withdrawAmount += amount;
    balance -= amount;
    return true;
  }

  public int getBalance() {
    return balance;
  }

  public int getDepositAmount() {
    return depositAmount;
  }

  public int getWithdrawAmount() {
    return withdrawAmount;
  }
}
public class ATMInterface {
  public static void main(String[] args) {
    System.out.println("ATM Management System\n------------------------------");
    Scanner inputScanner = new Scanner(System.in);

    Account userAccount = new Account(1122, 0);

    while (true) {
      System.out.print("Enter your PIN number: ");
      int enteredPIN = inputScanner.nextInt();

      if (userAccount.validatePin(enteredPIN)) {
        performTransactions(userAccount, inputScanner);
      } else {
        System.out.println("\n--------------------\nIncorrect PIN number\nPlease enter a valid PIN number\n--------------------\n");
      }

      System.out.println("\n--------------------\nDo you want to perform another transaction? Press 1 to continue, otherwise press any other number to exit");
      int continueChoice = inputScanner.nextInt();

      if (continueChoice != 1) {
        System.out.println("\n--------------------\nThank You !!!\n--------------------\n");
        break;
      }
    }

    System.out.println("------------------------------");
    inputScanner.close();
  }

  private static void performTransactions(Account account, Scanner scanner) {
    System.out.print("\nEnter your name: ");
    String customerName = scanner.next();
    System.out.println("\nWelcome " + customerName);

    while (true) {
      System.out.print("1: Check your balance\n2: Deposit Amount\n3: Withdraw Amount\n4: Get Receipt\n5: Exit\nEnter your choice of action: ");
      int userChoice = scanner.nextInt();

      switch (userChoice) {
        case 1:
          System.out.println("\nYour current balance: " + account.getBalance() + "\n--------------------\n");
          break;
        case 2:
          System.out.print("\nEnter the deposit amount: ");
          int depositAmount = scanner.nextInt();
          account.deposit(depositAmount);
          System.out.println("\nStatus: Success\nSuccessfully deposited the amount to your account.\nAvailable Balance: " + account.getBalance() + "\n--------------------\n");
          break;
        case 3:
          System.out.print("\nEnter withdraw amount: ");
          int withdrawAmount = scanner.nextInt();
          if (account.withdraw(withdrawAmount)) {
            System.out.println("\nStatus: Success\nSuccessfully withdrawn the amount from your account.\nAvailable Balance: " + account.getBalance() + "\n--------------------\n");
          } else {
            System.out.println("\nInsufficient Account Balance\nAvailable balance is " + account.getBalance() + " only\n--------------------\n");
          }
          break;
        case 
          System.out.println("\nWelcome to our ATM\nAvailable Balance: " + account.getBalance() + "\nTotal Amount Deposited: " + account.getDepositAmount() + "\nTotal Withdraw Amount: " + account.getWithdrawAmount() + "\nThank You !!!\n--------------------\n");
          break;
        case 5:
          System.out.println("\n--------------------\nThank You !!!\n--------------------\n");
          return;
        default:
          System.out.println("\n--------------------\nInvalid Choice\n--------------------\n");
      }
    }
  }
}
