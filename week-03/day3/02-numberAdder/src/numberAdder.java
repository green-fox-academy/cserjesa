// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class numberAdder {
    static int counter = 88;
    public static void main(String args[]) {

        int n =1;
        couterMethod(n);
    }

    private static void couterMethod(int n) {
        if (n >= counter) return;
        System.out.println(n);
        n++;
        couterMethod(n);
    }
}
