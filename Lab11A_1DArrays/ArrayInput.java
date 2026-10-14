import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (3-10): ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // สร้างอาร์เรย์ขนาด n
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array contents:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        sc.close();
    }
}