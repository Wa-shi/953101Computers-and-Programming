import java.util.Scanner;

public class GCDModular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter n2: ");
        int n2 = input.nextInt();

        int result1 = gcd(n1, n2);
        System.out.println("GCD(" + n1 + ", " + n2 + ") = " + result1);

        int newN1 = n1 * 2;
        int newN2 = n2 * 3;
        int result2 = gcd(newN1, newN2);
        System.out.println("GCD(" + newN1 + ", " + newN2 + ") = " + result2);
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int min = Math.min(n1, n2);
        for (int k = 2; k <= min; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }
}