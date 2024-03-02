package MyOIB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
  String title;
  String author;
  boolean isAvailable;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isAvailable = true;
  }
}

class Member {
  String name;
  String email;

  public Member(String name, String email) {
    this.name = name;
    this.email = email;
  }
}

class Library {
  Map<Integer, Book> books;
  Map<Integer, Member> members;
  int bookIdCounter;
  int memberIdCounter;

  public Library() {
    this.books = new HashMap<>();
    this.members = new HashMap<>();
    this.bookIdCounter = 1;
    this.memberIdCounter = 1;
  }

  public void addBook(String title, String author) {
    Book book = new Book(title, author);
    books.put(bookIdCounter++, book);
    System.out.println("Book added successfully!");
  }

  public void addMember(String name, String email) {
    Member member = new Member(name, email);
    members.put(memberIdCounter++, member);
    System.out.println("Member added successfully!");
  }

  public void displayBooks() {
    System.out.println("\nBooks in the library:");
    for (Map.Entry<Integer, Book> entry : books.entrySet()) {
      Book book = entry.getValue();
      System.out.println("Book ID: " + entry.getKey() + ", Title: " + book.title + ", Author: " + book.author +
          ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
  }

  public void issueBook(int bookId, int memberId) {
    Book book = books.get(bookId);
    Member member = members.get(memberId);

    if (book != null && member != null && book.isAvailable) {
      book.isAvailable = false;
      System.out.println("Book issued successfully to " + member.name);
    } else {
      System.out.println("Invalid book or member ID, or the book is not available.");
    }
  }

  public void returnBook(int bookId) {
    Book book = books.get(bookId);

    if (book != null && !book.isAvailable) {
      book.isAvailable = true;
      System.out.println("Book returned successfully.");
    } else {
      System.out.println("Invalid book ID, or the book is already available.");
    }
  }
}

public class DigitalLibraryManagement {
  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\n1. Admin Module");
      System.out.println("2. User Module");
      System.out.println("3. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          adminModule(scanner, library);
          break;

        case 2:
          userModule(scanner, library);
          break;

        case 3:
          System.out.println("Exiting the library management system.");
          scanner.close();
          System.exit(0);

        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void adminModule(Scanner scanner, Library library) {
    System.out.println("\nAdmin Module:");
    System.out.println("1. Add Book");
    System.out.println("2. Add Member");
    System.out.println("3. Display Books");
    System.out.println("4. Exit");

    System.out.print("Enter your choice: ");
    int adminChoice = scanner.nextInt();

    switch (adminChoice) {
      case 1:
        addBook(scanner, library);
        break;

      case 2:
        System.out.print("Enter member name: ");
        String memberName = scanner.next();
        System.out.print("Enter member email: ");
        String memberEmail = scanner.next();
        library.addMember(memberName, memberEmail);
        break;

      case 3:
        library.displayBooks();
        break;

      case 4:
        System.out.println("Exiting Admin Module.");
        break;

      default:
        System.out.println("Invalid choice in Admin Module. Please try again.");
    }
  }

  private static void userModule(Scanner scanner, Library library) {
    System.out.println("\nUser Module:");
    System.out.println("1. Display Books");
    System.out.println("2. Issue Book");
    System.out.println("3. Return Book");
    System.out.println("4. Exit");

    System.out.print("Enter your choice: ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
      case 1:
        library.displayBooks();
        break;

      case 2:
        System.out.print("Enter book ID to issue: ");
        int issueBookId = scanner.nextInt();
        System.out.print("Enter member ID: ");
        int issueMemberId = scanner.nextInt();
        library.issueBook(issueBookId, issueMemberId);
        break;

      case 3:
        System.out.print("Enter book ID to return: ");
        int returnBookId = scanner.nextInt();
        library.returnBook(returnBookId);
        break;

      case 4:
        System.out.println("Exiting User Module.");
        break;

      default:
        System.out.println("Invalid choice in User Module. Please try again.");
    }
  }

  private static void addBook(Scanner scanner, Library library) {
    System.out.print("Enter book title: ");
    String title = scanner.next();
    System.out.print("Enter book author: ");
    String author = scanner.next();
    library.addBook(title, author);
  }
}
