// SE101 - Lab 6A: Exercise 5 (Divisibility.java)
import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int count = 0;
        int num = 1;

        while (num <= n) {
            if ((num % 5 == 0) ^ (num % 7 == 0)) {
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }

        if (count % 10 != 0) {
            System.out.println();
        }
        System.out.println("End.");
        scanner.close();
    }
}
