import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the 1st number");
        int u1 = scanner.nextInt();

        System.out.println("Give me the 2nd number");
        int u2 = scanner.nextInt();

        System.out.println("Give me the 3rd number");
        int u3 = scanner.nextInt();

        System.out.println("Give me the 4th number");
        int u4 = scanner.nextInt();

        System.out.println("Give me the 5th number");
        int u5 = scanner.nextInt();

        int summary = u1 + u2 + u3 + u4 + u5;
        System.out.println("Sum: " + summary + "  Average: " + ((float)summary / 5));
    }
}