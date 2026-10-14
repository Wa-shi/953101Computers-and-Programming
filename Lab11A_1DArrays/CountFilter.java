import java.util.Scanner;

public class CountFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (3-10): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // (a) นับและแสดงเลขคู่
        System.out.print("Even numbers: ");
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                evenCount++;
            }
        }
        System.out.println("  (count = " + evenCount + ")");

        // คำนวณค่าเฉลี่ย
        double avg = (double) sum / arr.length;
        System.out.printf("Average = %.2f\n", avg);

        // (b) นับและแสดงตัวเลขที่มากกว่าค่าเฉลี่ย
        System.out.print("Above average: ");
        int aboveAvgCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
                aboveAvgCount++;
            }
        }
        System.out.println("  (count = " + aboveAvgCount + ")");

        sc.close();
    }
}