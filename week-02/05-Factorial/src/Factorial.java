//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        System.out.println("I can multiply numbers from 1 to any.\nGive me a number");
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        System.out.println(sum(u1));
    }

    public static int sum(int a) {
        int c = 1;
        for (int i = 1; a >= i; i++) {
            c = c * i;
        }
        return c;
    }
}
