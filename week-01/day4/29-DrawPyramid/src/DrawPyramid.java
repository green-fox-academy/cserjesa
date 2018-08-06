// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("I'll draw you a pyramid! What size you want? Type a number please.");
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        for (int i = 1; i <= u1; i++) {
            for (int space = u1 - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (i * 2) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}