import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExrpession {

    public static void main(String[] args) {

        // Write a Stream Expression to get the even numbers from the following array:
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        numbers.stream()
 //               .map(a -> Math.abs(a))
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
