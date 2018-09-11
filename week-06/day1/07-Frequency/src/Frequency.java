import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Frequency {

    //Write a Stream Expression to find the frequency of characters in a given string!

    public static void main(String[] args) {


        String s0 = "abcaba";
        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s0.toCharArray()) {
            freqs.merge(c,               // key = char
                   1,              // value to merge
                    Integer::sum);      // counting
        }
        System.out.println("Frequencies:\n" + freqs);


        String s1 = "abcabaasfkdsajfkdsajkfladsjfkdasjkfbajdsbjakfhjdjadkfuafsjas";
        Map<Character, Integer> frequencies;
        frequencies = s1
                .chars()
                .boxed()
                .collect(toMap(
                                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting
        System.out.println("Frequencies:\n" + frequencies);
    }
}
