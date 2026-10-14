import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        int[][] matrix = readMatrix(sc, rows, cols);
        System.out.println("Matrix:");
        printMatrix(matrix);
        sc.close();
    }

    public static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                System.out.print("Enter element [" + r + "][" + c + "]: ");
                m[r][c] = sc.nextInt();
            }
        return m;
    }

    public static void printMatrix(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++)
                System.out.printf("%-5d", m[r][c]);
            System.out.println();
        }
    }
}