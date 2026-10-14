// SE101 - Lab 10A: Exercise 1 & 2 (TestMax.java)
public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int x = 9;
        int y = 7;

        // Exercise 1: Max between two numbers
        int k = max(i, j);
        System.out.println("Max = " + k);

        // Exercise 2: Max among four numbers using nested max() calls
        int max4 = max(max(i, j), max(x, y));
        System.out.println("The maximum between " + i + ", " + j + ", " + x + " and " + y + " is " + max4);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
