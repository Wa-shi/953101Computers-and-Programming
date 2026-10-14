public class TraceMatrix {
    public static void main(String[] args) {
        int[][] m = { { 2, 4, 6 },
                { 1, 3, 5 },
                { 7, 0, 9 } };
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }
}
