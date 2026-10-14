// SE101 - Lab 6A: Exercise 7 (Calculator.java)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("=== Simple Calculator ===");

        while (choice != 5) {
            System.out.println("1. Add   2. Subtract   3. Multiply   4. Divide   5. Exit");
            System.out.print("Choose operation: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    double add1 = scanner.nextDouble();
                    double add2 = scanner.nextDouble();
                    System.out.println(add1 + " + " + add2 + " = " + (add1 + add2));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    double sub1 = scanner.nextDouble();
                    double sub2 = scanner.nextDouble();
                    System.out.println(sub1 + " - " + sub2 + " = " + (sub1 - sub2));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    double mul1 = scanner.nextDouble();
                    double mul2 = scanner.nextDouble();
                    System.out.println(mul1 + " * " + mul2 + " = " + (mul1 * mul2));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    double div1 = scanner.nextDouble();
                    double div2 = scanner.nextDouble();
                    if (div2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        System.out.println(div1 + " / " + div2 + " = " + (div1 / div2));
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose 1-5.");
                    break;
            }
        }
        scanner.close();
    }
}
