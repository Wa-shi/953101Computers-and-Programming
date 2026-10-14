public class SumNumber {
    public static void main(String[] args) {
        int sum = 0, evenSum = 0, oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println("Sum 1-100 = " + sum);
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers  = " + oddSum);
    }
}