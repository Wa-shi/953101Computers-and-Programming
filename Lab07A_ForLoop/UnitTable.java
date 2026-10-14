public class UnitTable {
    public static void main(String[] args) {
        System.out.println("Kilograms    Pounds");
        for (int kg = 1, lb = 20; kg <= 19; kg += 2, lb += 5) {
            System.out.printf("%-12d%.2f%n", kg, (double) lb);
        }
    }
}