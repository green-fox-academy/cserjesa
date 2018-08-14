// Create a function
// 1. that takes a number
// 2. divides ten with it,
// 3. and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class divideByZero {
    public static void main(String[] args) {

        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        division(divisor);
    }

    private static void division(int divisor) {
        try {
            System.out.println("10 / " + divisor + " = " + 10 / divisor + " (int)");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
            System.exit(1);
        }
    }
}