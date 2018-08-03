// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("I'll draw you a triangle! What size you want? Type a number please.");
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        for (int i = 1; i <= u1; i++) {
            for (int star =1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

