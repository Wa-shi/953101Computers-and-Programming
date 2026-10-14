import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table size: ");
        int size = sc.nextInt();
        printMultiTable(size);
        sc.close();
    }

    public static void printDivider(int cols) {
        System.out.print("+----");
        for (int i = 0; i < cols; i++)
            System.out.print("+----");
        System.out.println("+");
    }

    public static void printRow(int row, int cols) {
        System.out.printf("%4d |", row);
        for (int j = 1; j <= cols; j++)
            System.out.printf("%5d", row * j);
        System.out.println();
    }

    public static void printMultiTable(int size) {
        System.out.printf("%5s|", " ");
        for (int j = 1; j <= size; j++)
            System.out.printf("%5d", j);
        System.out.println();
        printDivider(size);
        for (int i = 1; i <= size; i++) {
            printRow(i, size);
            printDivider(size);
        }
    }
}