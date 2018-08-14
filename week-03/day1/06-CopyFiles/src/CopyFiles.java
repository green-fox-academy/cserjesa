// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFiles {

    public static void main(String[] args) {
        String fromFile = "../02-PrintEachLine/my-file.txt";
        String toFile = "to-file.txt";
        System.out.println(multipleLines(fromFile, toFile));
    }

    private static boolean multipleLines(String from, String to) {

        try {
            Path fileFrom = Paths.get(from);
            Path fileTo = Paths.get(to);
            Files.copy(fileFrom, fileTo);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
            return false;
        }
        return true;
    }
}