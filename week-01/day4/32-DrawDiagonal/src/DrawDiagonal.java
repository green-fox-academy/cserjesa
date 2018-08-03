// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("I'll draw you a square! What size you want? Type a number please.");
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        for (int i = 1; i <= u1; i++) {
            if (i == 1 || i == u1) {
                for (int star = 1; star <= u1; star++) {
                    System.out.print("%");
                }
            } else {
                for (int star = 1; star <= u1; star++) {
                    if (star == 1 || star == i || star == u1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
