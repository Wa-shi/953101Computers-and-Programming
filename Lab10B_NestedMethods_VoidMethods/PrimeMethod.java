import java.util.Scanner;

public class PrimeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max: ");
        int max = input.nextInt();
        findPrimes(max);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        // เช็คการหารลงตัวแค่ถึงรากที่สองของ n ก็พอ (เพื่อความรวดเร็ว)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void findPrimes(int max) {
        int count = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                // พิมพ์ขึ้นบรรทัดใหม่เมื่อครบ 10 ตัว
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        // ถ้าตัวสุดท้ายไม่ได้จบที่ตัวที่ 10 พอดี ให้ขึ้นบรรทัดใหม่ก่อนสรุปผล
        if (count % 10 != 0 && count > 0) {
            System.out.println();
        }
        System.out.println("Total primes found: " + count);
    }
}