// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class factorial {

    static int sum = 1;

    public static void main(String args[]) {
        int base = 7;
        System.out.println(base + "! = " + summer(base));
    }

    private static int summer(int base) {
        if (base <= 1) return sum;
        sum = sum * base;
        base--;
        summer(base);
        return sum;
    }
}
