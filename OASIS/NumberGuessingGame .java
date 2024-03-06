package MyOIB;

import java.util.*;

public class NumberGuessingGame {
    private final ArrayList<Integer> scoreBoard = new ArrayList<>();

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.runGame();
    }

    public void runGame() {
        Scanner input = new Scanner(System.in);

        while (true) {
            printMenu();
            int menuOption = getUserInput(input, "Choose an option: ");

            switch (menuOption) {
                case 1:
                    int numberRange = getUserInput(input, "\nEnter the range of numbers: ");
                    int randomNumber = generateRandomNumber(numberRange);
                    playGame(randomNumber, input);
                    break;
                case 2:
                    displayScoreBoard();
                    break;
                case 3:
                    System.out.println("\nThanks for playing the game!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.\n");
            }
        }
    }

    private void printMenu() {
        System.out.println("--------------------");
        System.out.println("Welcome to the number game");
        System.out.println("1) Play the Game");
        System.out.println("2) Score Board");
        System.out.println("3) Exit the game");
        System.out.println("--------------------");
    }

    private int getUserInput(Scanner scanner, String message) {
        int userInput;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            userInput = scanner.nextInt();
        } while (userInput <= 0);

        return userInput;
    }

    private int generateRandomNumber(int numberRange) {
        Random random = new Random();
        return random.nextInt(numberRange) + 1;
    }

    private void playGame(int randomNumber, Scanner input) {
        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess number: ");
            userGuess = getUserInput(input, "");
            attempts++;
            // System.out.println(randomNumber);
            // System.out.println(userGuess);
            if (userGuess > randomNumber) {
                System.out.println("Your Guess is Higher");
            } else if (userGuess < randomNumber) {
                System.out.println("Lower");
            }
        } while (randomNumber != userGuess);

        System.out.println("\nYou guessed the number in " + attempts + (attempts == 1 ? " try!" : " tries!"));
        scoreBoard.add(attempts);
    }

    private void displayScoreBoard() {
        System.out.println("--------------------");
        System.out.println("Score Board");
        System.out.println("--------------------");

        if (scoreBoard.isEmpty()) {
            System.out.println("No games played yet.");
        } else {
            Collections.sort(scoreBoard);
            System.out.println("Your fastest game today: " + scoreBoard.get(0) + " tries");
        }

        System.out.println();
    }
}
