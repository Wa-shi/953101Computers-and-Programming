public class Perfectnumber {
    public static void main(String[] args) {
        // วนลูปเพื่อหา Perfect Number ที่มีค่าน้อยกว่า 10000
        for (int i = 1; i < 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        // ลูปหาตัวหารทั้งหมด (ยกเว้นตัวมันเอง)
        for (int k = 1; k < number; k++) {
            // ถ้าหารลงตัว ให้นำไปบวกใน sum
            if (number % k == 0) {
                sum += k;
            }
        }
        // ถ้าผลรวมเท่ากับตัวมันเองพอดี จะถือว่าเป็น Perfect Number (return true)
        return sum == number;
    }
}