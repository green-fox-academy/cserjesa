// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class numberAdder {
    public static void main(String args[]) {
        int counter = 88;
        int n =1;
        couterMethod(n, counter);
    }

    private static void couterMethod(int n, int counter) {
        if (n >= counter) return;
        System.out.println(n);
        n++;
        couterMethod(n, counter);
    }
}
