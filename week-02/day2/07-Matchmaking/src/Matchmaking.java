import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> lanyok, ArrayList<String> fiuk) {
        int tobben = 0;
        ArrayList<String> parok = new ArrayList<String>();
        if (lanyok.size() >= fiuk.size()) {
            tobben = lanyok.size();
        } else {
            tobben = fiuk.size();
        }
        for (int i = 0; i < tobben - 1; i++) {
            parok.add(lanyok.get(i));
            parok.add(fiuk.get(i));
        }
        return parok;
    }
}