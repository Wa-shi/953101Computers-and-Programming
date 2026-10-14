import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (3-10): ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        
        // พิมพ์ค่าก่อนกลับด้าน
        System.out.print("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // อัลกอริทึม In-place Reversal (สลับซ้าย-ขวา)
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        // พิมพ์ค่าหลังกลับด้าน
        System.out.print("After:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}