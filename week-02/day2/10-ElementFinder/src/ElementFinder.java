import java.util.*;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7"
        // if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }

    public static ArrayList<Integer> containsSeven(ArrayList<Integer> k) {
//        if (k.contains(7)) {
//            System.out.println("Hoorray");
//        } else {
//            System.out.println("Noooooo");
//        }

//Another solution

        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) == 7) {
                System.out.println("Hoorray");
                return k;
            }
        }
        System.out.println("Noooooo");
        return k;
    }
}