// SE101 - Lab 10A: Exercise 5 (Distance.java)
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point 1 (x y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter point 2 (x y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double dist = distance(x1, y1, x2, y2);
        System.out.printf("Distance = %.2f%n", dist);

        scanner.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
