import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileManipulation {

    static void readFile() {
        List<String> linesOfInputFile = null;
        try {
            linesOfInputFile = Files.readAllLines(Paths.get("input.txt"));
        } catch (IOException e) {
            System.out.println("Unable to read file: input.txt!");
            return;
        }

        linesOfInputFile.stream()
                .map(a -> new Task(a)).collect(toList());
    }

    static void writeFile() {
        List<String> taskNames = new ArrayList<>();
        Task.taskList.stream()
                .map(a ->taskNames.add(a.name));

        try {
            Files.write(Paths.get("input.txt"), taskNames);
        } catch (
                IOException e) {
            System.out.println("Unable to write file: input.txt!");
        }
    }
}
