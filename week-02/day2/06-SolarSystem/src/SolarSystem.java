import java.util.*;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

        System.out.println("This is not the expected but the correct output since \n" +
                "Saturn is not the last, but the 6th planet.");
    }

    public static ArrayList<String> putSaturn(ArrayList<String> i) {
        i.add(i.indexOf("Jupiter") + 1, "Saturn");
        return i;
    }
}