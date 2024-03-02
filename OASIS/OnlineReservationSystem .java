package MyOIB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineReservationSystem {

    private Map<String, String> users; // Store username-password pairs
    private Map<String, String> reservations; // Store reservation data
    private Scanner scanner;

    public OnlineReservationSystem() {
        users = new HashMap<>();
        reservations = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            printMenu("WELCOME TO ONLINE RESERVATION SYSTEM", "Register", "Login", "Exit");

            int choice = getUserChoice(3);

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    exitSystem();
                    return;
                default:
                    printMessage("Invalid choice. Please try again.");
            }
        }
    }

    private void register() {
        printHeader("REGISTRATION PAGE");
        String username = getUserInput("Enter username: ");

        if (users.containsKey(username)) {
            printMessage("Username already exists. Try again.");
            return;
        }

        String password = getUserInput("Enter password: ");
        users.put(username, password);
        printMessage("Registration successful. You can now log in.");
    }

    private void login() {
        printHeader("LOGIN PAGE");
        String username = getUserInput("Enter username: ");
        String password = getUserInput("Enter password: ");

        if (users.containsKey(username) && users.get(username).equals(password)) {
            printMessage("Login successful.");
            reservationMenu(username);
        } else {
            printMessage("Invalid username or password.");
        }
    }

    private void reservationMenu(String username) {
        while (true) {
            printMenu("HOME PAGE", "Make a reservation", "Cancel a reservation", "Logout");

            int choice = getUserChoice(3);

            switch (choice) {
                case 1:
                    makeReservation(username);
                    break;
                case 2:
                    cancelReservation(username);
                    break;
                case 3:
                    printMessage("Logging out...");
                    return;
                default:
                    printMessage("Invalid choice. Try again.");
            }
        }
    }

    private void makeReservation(String username) {
        printHeader("MAKE A RESERVATION");
        if (reservations.containsKey(username)) {
            printMessage("You already have a reservation. Cancel it first to make a new one.");
            return;
        }

        String reservationDetails = getUserInput("Enter reservation details: ");
        reservations.put(username, reservationDetails);
        printMessage("Reservation created successfully.");
    }

    private void cancelReservation(String username) {
        if (reservations.containsKey(username)) {
            printHeader("CANCEL A RESERVATION");
            printMessage("Your current reservation: " + reservations.get(username));
            String confirmation = getUserInput("Do you want to cancel this reservation? (Y/N): ");

            if (confirmation.equalsIgnoreCase("Y")) {
                reservations.remove(username);
                printMessage("Reservation cancelled successfully.");
            } else {
                printMessage("Reservation not cancelled.");
            }
        } else {
            printMessage("You don't have any reservations.");
        }
    }

    private void exitSystem() {
        printMessage("Exiting...");
        printMessage("Thank You. Please Visit Again...");
        System.exit(0);
    }

    private void printMenu(String title, String... options) {
        System.out.println("------------------------------------------------");
        System.out.println("----- " + title + " -----");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ".>>> " + options[i] + " >>>");
        }

        System.out.println("------------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    private int getUserChoice(int maxOption) {
        int choice = -1;

        while (choice < 1 || choice > maxOption) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                printMessage("Invalid input. Please enter a number.");
            }

            if (choice < 1 || choice > maxOption) {
                printMessage("Invalid choice. Please enter a number between 1 and " + maxOption + ".");
            }
        }

        return choice;
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private void printHeader(String title) {
        System.out.println("------------------------------------------------");
        System.out.println("--------------- " + title + " --------------");
        System.out.println("------------------------------------------------");
    }

    private void printMessage(String message) {
        System.out.println("------------------------------------------------");
        System.out.println("\n" + message + "\n");
    }

    public static void main(String[] args) {
        OnlineReservationSystem system = new OnlineReservationSystem();
        system.run();
    }
}
