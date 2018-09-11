
public class Uppercase {

    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String input = "I Wan To Find UpperCases In This Text";

        input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .forEach(System.out::print);
    }
}
