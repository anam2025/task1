import java.util.Scanner;
import java.util.Random;

public class numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int lowerBound = 1;
            int upperBound = 100;
            int maxAttempts = 5;
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.printf("\nI have picked a number between %d and %d. You have %d attempts to guess it.\n", lowerBound, upperBound, maxAttempts);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.printf("Sorry, you've used all your attempts. The correct number was %d.\n", randomNumber);
            }

            System.out.printf("Your current score is: %d\n", score);

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nThanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
