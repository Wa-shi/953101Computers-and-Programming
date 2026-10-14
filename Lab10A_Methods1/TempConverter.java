// SE101 - Lab 10A: Exercise 4 (TempConverter.java)
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.print("Convert (C/F): ");
            String choice = scanner.next().trim().toUpperCase();

            System.out.print("Enter temperature: ");
            double temp = scanner.nextDouble();

            if (choice.equals("C")) {
                double fahrenheit = celsiusToFahrenheit(temp);
                System.out.printf("%.1f °C = %.2f °F%n", temp, fahrenheit);
            } else if (choice.equals("F")) {
                double celsius = fahrenheitToCelsius(temp);
                System.out.printf("%.1f °F = %.2f °C%n", temp, celsius);
            } else {
                System.out.println("Invalid choice! Choose C or F.");
            }

            System.out.print("Another conversion? (yes/no): ");
            continueChoice = scanner.next().trim().toLowerCase();

        } while (continueChoice.equals("yes") || continueChoice.equals("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }

    public static double celsiusToFahrenheit(double c) {
        return (9.0 / 5) * c + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (5.0 / 9) * (f - 32);
    }
}
