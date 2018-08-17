// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
    public static void main(String args[]) {
        int counter = 88;
        couterMethod(counter);
    }

    private static void couterMethod(int n) {
        if (n <= 0) return;
        System.out.println(n);
        n--;
        couterMethod(n);
    }
}
