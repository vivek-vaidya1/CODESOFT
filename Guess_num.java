package guess_num;
import java.util.*;
public class Guess_num {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int minRange = 1;
            int maxRange = 50;
            int maxAttempts = 5;
            int score = 0;

            boolean playAgain = true;
            while (playAgain) {
                int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("Hey!! welcome in number guessing game");
                System.out.println("I selected num between this range" + minRange + " and " + maxRange + ". Try to guess it!");

                int attempts = 0;
                while (attempts < maxAttempts) {
                    System.out.print("Insert your guessing no: ");
                    int userGuess = sc.nextInt();
                    attempts++;

                    if (userGuess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > targetNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                        score += maxAttempts - attempts + 1;
                        break;
                    }
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
                }

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainResponse = sc.next().toLowerCase();
                playAgain = playAgainResponse.equals("yes");
            }

            System.out.println("Thanks for playing! Your total score is: " + score);
        }

    }
}
