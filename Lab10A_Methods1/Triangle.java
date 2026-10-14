import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println(classifyTriangle(a, b, c));
        sc.close();
    }

    public static String classifyTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return "These sides cannot form a valid triangle.";
        if (a == b && b == c)
            return "The sides form an Equilateral triangle.";
        if (a == b || b == c || a == c)
            return "The sides form an Isosceles triangle.";
        return "The sides form a Scalene triangle.";
    }
}