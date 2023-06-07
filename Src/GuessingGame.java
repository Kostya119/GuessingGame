import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        int attempts = 3;

        System.out.println("Guess the number from 0 to 10 (you have 3 attempts)");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt #" + i + ": ");
            int guess = (int) (Math.random() * 11);

            if (guess == randomNumber) {
                System.out.println("You guessed");
                break;
            } else {
                System.out.println("You didn't guess");
            }
        }

        System.out.println("The number given was: " + randomNumber);
    }
}