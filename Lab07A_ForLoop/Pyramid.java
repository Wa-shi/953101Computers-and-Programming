public class Pyramid {
    public static void main(String[] args) {
        int totalRows = 7;

        for (int row = 1; row <= totalRows; row++) {
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print("  ");
            }

            for (int col = 0; col < row; col++) {
                int value = (int) Math.pow(2, col);
                System.out.printf("%4d", value);
            }

            System.out.println();
        }
    }
}