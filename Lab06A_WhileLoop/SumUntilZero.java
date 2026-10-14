// SE101 - Lab 6A: Exercise 3 (SumUntilZero.java)
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        System.out.println("You entered " + count + " numbers.");
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
