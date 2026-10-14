import java.util.Scanner;
public class TextBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = input.nextLine();
        System.out.print("Enter box width: ");
        int width = input.nextInt();

        printTextBox(message, width);
    }

    public static void printLine(int width, char ch) {
        for (int i = 0; i < width; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void printCentered(String message, int width) {
        int padding = (width - message.length() - 2) / 2;
        System.out.print("*");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(message);

        // เผื่อกรณีที่ความกว้างและข้อความหารกันแล้วเหลือเศษ
        // ต้องเติมช่องว่างด้านหลังให้พอดี
        int rightPadding = width - message.length() - 2 - padding;
        for (int i = 0; i < rightPadding; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void printTextBox(String message, int width) {
        printLine(width, '*');
        printCentered(message, width);
        printLine(width, '*');
    }
}