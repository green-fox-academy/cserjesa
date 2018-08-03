// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        System.out.println("Guess the number! 1-10");

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        int u1 = 0;

        while (randomNum != u1) {
            u1 = scanner.nextInt();
            if (u1 > randomNum) {
                System.out.println("The stored number is lower");
            } else if (u1 < randomNum) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("You won!");
            }
        }
    }
}
