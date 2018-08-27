import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String a, String b) {
        char[] word1 = a.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = b.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(a.replaceAll("[\\s]", "").toCharArray());
        Arrays.sort(b.replaceAll("[\\s]", "").toCharArray());
        return Arrays.equals(word1, word2);
    }
}
