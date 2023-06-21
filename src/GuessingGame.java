import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;

        int chances = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("-------------Welcome to the number guessing game!------------");
        System.out.println("Guess a number between 1 and 100\n" + "You have only 5 chances");

        while (chances > 0) {
            System.out.println("\nEnter your guess: ");
            int guess = input.nextInt();

            if (guess == answer) {
                System.out.println("Congratulations, you guessed the correct number!");
                break;
            }
            else if (guess < answer) {
                System.out.println("Your guess is too low.");
                System.out.println("You have " + (chances - 1) + " chances left.");
            } else {
                System.out.println("Your guess is too high.");
                System.out.println("You have " + (chances - 1) + " chances left.");
            }
                 chances--;
        }

            if (chances == 0) {
                System.out.println("\nYou ran out of trials.");
                System.out.println("The answer was: " + answer);
            }
        }
   }

