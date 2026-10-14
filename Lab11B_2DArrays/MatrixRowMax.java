// SE101 - Lab 11B: Exercise 4 (MatrixRowMax.java)
import java.util.Scanner;

public class MatrixRowMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter cols: ");
        int cols = scanner.nextInt();

        int[][] matrix = readMatrix(rows, cols);

        System.out.println("\nMatrix:");
        printMatrix(matrix);

        System.out.println();
        findRowMax(matrix);

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

    public static void findRowMax(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            int maxInRow = m[row][0];
            for (int col = 1; col < m[row].length; col++) {
                if (m[row][col] > maxInRow) {
                    maxInRow = m[row][col];
                }
            }
            System.out.println("Max in row " + row + " = " + maxInRow);
        }
    }
}
