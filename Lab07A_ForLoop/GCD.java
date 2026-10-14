import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter n2: ");
        int n2 = input.nextInt();

        int gcd = 1;

        for (int k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        System.out.println("GCD(" + n1 + ", " + n2 + ") = " + gcd);
    }
}