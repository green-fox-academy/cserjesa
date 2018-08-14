// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {

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
