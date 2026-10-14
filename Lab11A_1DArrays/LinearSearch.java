import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (3-10): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        int foundAt = -1; // -1 หมายถึงยังไม่พบ

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundAt = i;
                break; // หยุดลูปทันทีที่เจอ
            }
        }

        if (foundAt != -1) {
            System.out.println("Found " + target + " at index " + foundAt);
        } else {
            System.out.println(target + " not found in the array.");
        }

        sc.close();
    }
}