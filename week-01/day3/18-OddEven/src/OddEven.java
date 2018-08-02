import java.util.Scanner;

public class OddEven {

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the number:");
        int u1 = scanner.nextInt();

        if((u1 % 2) != 0) {
            System.out.println(u1 + " is odd.");
        }
        else {
            System.out.println(u1 + " is even.");
        }
    }
}
