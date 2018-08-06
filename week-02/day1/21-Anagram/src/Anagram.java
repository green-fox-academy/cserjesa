// Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("First word please.");
        Scanner scanner = new Scanner(System.in);
        String u1 = scanner.nextLine();
        System.out.println("Second word please.");
//            Scanner scanner = new Scanner(System.in);
        String u2 = scanner.nextLine();

        anagram(u1, u2);
    }

    public static String[] anagram(String a, String b) {
        int i = 0;
        Arrays.sort(args);
        int[] noDuplicates = IntStream.of(args).distinct().toArray();
        return noDuplicates;
    }
}
}
