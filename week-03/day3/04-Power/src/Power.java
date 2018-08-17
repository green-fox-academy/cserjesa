// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {

    static int sum = 1;

    public static void main(String args[]) {
        int base = 2;
        int n = 16;
        System.out.println(summer(base, n));
    }

    private static int summer(int base, int n) {
        if (n <= 0) return sum;
        sum = sum * base;
        n--;
        summer(base, n);
        return sum;
    }
}
