public class CountDown {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 2) {
            System.out.println(i + (i % 2 == 0 ? " Even" : " Odd"));
            i--;
        }
    }
}