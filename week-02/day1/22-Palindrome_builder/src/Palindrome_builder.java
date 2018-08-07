// Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_builder {
    public static void main(String[] args) {
        System.out.println("Give me a word please:");
        Scanner scanner = new Scanner(System.in);
        String u1 = scanner.nextLine();
        String raw[] = u1.split("(?!^)");
        System.out.print(u1);
        for (int i = raw.length - 1; i >= 0; i--) {
            System.out.print(raw[i]);
        }
    }
}
