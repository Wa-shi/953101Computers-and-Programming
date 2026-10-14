public class TraceArray {
    public static void main(String[] args) {
        int[] nums = {5, 12, 3, 8, 7};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
            System.out.println("i=" + i + "  nums[i]=" + nums[i] + "  total=" + total);
        }
        System.out.println("Final total = " + total);
    }
}
