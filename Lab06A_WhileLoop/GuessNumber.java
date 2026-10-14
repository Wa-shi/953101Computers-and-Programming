// SE101 - Lab 6A: Exercise 6 (GuessNumber.java)
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1; // 1..100
        int guess = 0;
        int attempts = 0;

        while (guess != secret) {
            System.out.print("Guess a number (1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You got it in " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}
