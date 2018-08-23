import java.util.Arrays;

public class Anagram2 {

    public static void main(String[] args) {

        //String u1 = "ab";
        //String u2 = "ba";
        //anagram(u1, u2);
    }

    public static boolean anagram(String a, String b) {

        if (Arrays.equals(sorter(a), sorter(b))) {
            System.out.println("Anagrams");
            return true;
        }
        System.out.println("Not anagrams");
        return false;
    }

    public static String[] sorter(String d) {
        String raw[] = d.toLowerCase().split("(?!^)");
        Arrays.sort(raw);
        return raw;
    }
}