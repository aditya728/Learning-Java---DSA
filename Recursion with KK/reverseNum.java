public class reverseNum {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123,0));
    }

    static int  reverseNumber(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        int rem = n % 10;
        reverse = (reverse * 10) + rem;
        return reverseNumber(n / 10, reverse);
    }
}
