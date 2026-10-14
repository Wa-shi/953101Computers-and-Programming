public class BreakContinue {
    public static void main(String[] args) {
        System.out.print("Snippet A: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Snippet B: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}