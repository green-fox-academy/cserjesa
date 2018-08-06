//  Create the usual class wrapper
//  and main method on your own.
// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Summing {

    public static void main(String[] args) {
        System.out.println("I can sum numbers from zero to any.\nGive me a number");
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        System.out.println(sum(u1));
    }

    public static int sum(int a) {
        int c = 0;
        for (int i = 1; a >= i; i++) {
            c = c + i;
        }
        return c;
    }
}
