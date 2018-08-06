// Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("First word please:");
        Scanner scanner = new Scanner(System.in);
        String u1 = scanner.nextLine();
        System.out.println("Second word please:");
        String u2 = scanner.nextLine();

        anagram(u1, u2);
    }

    public static String anagram(String a, String b) {
        //String first[] = a.split("(?!^)");
        //String second[] = b.split("(?!^)");
        //Arrays.sort(first);
        //Arrays.sort(second);
// Sorter method instead

        if (Arrays.equals(sorter(a), sorter(b))) {
            System.out.println("Anagrams");
            boolean r = true;
        } else {
            System.out.println("Not anagrams");
            boolean r = false;
        }
        return "r";
    }

    public static String[] sorter(String d) {
        String raw[] = d.split("(?!^)");
        Arrays.sort(raw);
        return raw;
    }
}
