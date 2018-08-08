import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        int more = 0;
        ArrayList<String> match = new ArrayList<String>();
        if (girls.size() >= boys.size()) {
            more = girls.size();
        } else {
            more = boys.size();
        }
        for (int i = 0; i < more - 1; i++) {
            match.add(girls.get(i));
            match.add(boys.get(i));
        }
        return match;
    }
}