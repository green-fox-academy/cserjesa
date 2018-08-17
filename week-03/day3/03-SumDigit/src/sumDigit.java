//// Given a non-negative int n, return the sum of its digits recursively (no loops).
//// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
//// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class sumDigit {
    static int sum = 0;

    public static void main(String args[]) {
        int n = 9999;
        System.out.println(summer(n));
    }

    private static int summer(int n) {
        if (n < 1) return sum;
        sum = sum + (n % 10);
        n = n / 10;
        summer(n);
        return sum;
    }
}
