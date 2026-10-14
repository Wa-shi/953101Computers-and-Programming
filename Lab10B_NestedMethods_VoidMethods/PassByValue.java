public class PassByValue {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before: num = " + num);
        increment(num);
        System.out.println("After:  num = " + num);
    }

    public static void increment(int n) {
        n = n + 1;
        System.out.println("Inside: n = " + n);
    }
}
