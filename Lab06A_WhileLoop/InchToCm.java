// SE101 - Lab 6A: Exercise 4 (InchToCm.java)
public class InchToCm {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%n", "Inches", "Centimeters");
        int inches = 1;
        while (inches <= 199) {
            double cm = inches * 2.54;
            System.out.printf("%-10d%-15.2f%n", inches, cm);
            inches += 2;
        }
    }
}
