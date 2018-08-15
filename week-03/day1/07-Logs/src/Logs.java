// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logs {
    public static void main(String[] args) {
        String filename = "../02-PrintEachLine/my-file.txt";
        System.out.println(numberOfLines(filename));
    }

    private static int numberOfLines(String filename) {
        int lines = -1;
        try {
            Path filePath = Paths.get(filename);
            lines = Files.readAllLines(filePath).size();
        } catch (Exception e) {
            return 0;
        }
        return lines;
    }
}
