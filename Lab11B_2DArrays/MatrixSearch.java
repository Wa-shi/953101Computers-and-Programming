// SE101 - Lab 11B: Exercise 5 (MatrixSearch.java)
import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter cols: ");
        int cols = scanner.nextInt();

        int[][] matrix = readMatrix(rows, cols);

        System.out.println("\nMatrix:");
        printMatrix(matrix);

        System.out.print("\nEnter target: ");
        int target = scanner.nextInt();

        System.out.println("\n--- Search with Early Exit ---");
        search(matrix, target);

        System.out.println("\n--- Extension: Search All Occurrences ---");
        searchAll(matrix, target);

        scanner.close();
    }

    public static int[][] readMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] m = new int[rows][cols];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                System.out.print("Enter element [" + row + "][" + col + "]: ");
                m[row][col] = scanner.nextInt();
            }
        }
        return m;
    }

    public static void printMatrix(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                System.out.printf("%-5d", m[row][col]);
            }
            System.out.println();
        }
    }

    // Standard search with early exit
    public static void search(int[][] m, int target) {
        boolean found = false;
        for (int row = 0; row < m.length && !found; row++) {
            for (int col = 0; col < m[row].length && !found; col++) {
                if (m[row][col] == target) {
                    System.out.println("Found " + target + " at [" + row + "][" + col + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println(target + " not found.");
        }
    }

    // Extension: find and print ALL occurrences
    public static void searchAll(int[][] m, int target) {
        int occurrences = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (m[row][col] == target) {
                    System.out.println("Found " + target + " at [" + row + "][" + col + "]");
                    occurrences++;
                }
            }
        }
        if (occurrences == 0) {
            System.out.println(target + " not found.");
        } else {
            System.out.println("Total occurrences found: " + occurrences);
        }
    }
}
