// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        System.out.println("Give me two numbers please.\nThe first:");

        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        System.out.println("The second:");
        int u2 = scanner.nextInt();

        while (u1 >= u2) {
            System.out.println("The second number should be bigger\n" +
                    "Give me the second number again please:");
            u2 = scanner.nextInt();
        }
        for (int i = u1; i <= u2; i++) {
            System.out.println(i);
        }
    }

}
