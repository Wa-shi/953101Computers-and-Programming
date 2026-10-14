import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (3-10): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // รับค่าและคำนวณ sum ไปพร้อมกัน
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = sc.nextInt();
            sum += arr[i]; // สะสมค่า sum ทันทีที่รับค่าเข้ามา
        }

        // หาค่า Minimum และ Maximum
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double average = (double) sum / arr.length;

        // แสดงผลลัพธ์
        System.out.println("Sum     = " + sum);
        System.out.printf("Average = %.2f\n", average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        sc.close();
    }
}