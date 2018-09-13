import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private boolean complete;
    private static ArrayList<Task> taskInstances = new ArrayList<>();

    public Task(String name) {
        this.name = name;
        this.complete = false;
        taskInstances.add(this);
    }

    static void removeTask(int i) {
        if (i <= 0 || i > taskInstances.size()) {
            System.out.println("Unable to remove: index is out of bound");
            return;
        } else {
            taskInstances.remove(i - 1);
            writeFile();
        }
    }

    static void completeTask(int i) {
        if (i <= 0 || i > taskInstances.size()) {
            System.out.println("Unable to set complete: index is out of bound");
            return;
        } else {
            taskInstances.get(i - 1).complete = true;
        }
    }

    static void getAllTasks() {
        String comp;
        if (taskInstances.size() == 0) {
            System.out.println("No todos for today! :)");
            return;
        }
        for (int i = 0; i < taskInstances.size(); i++) {
            if (taskInstances.get(i).complete) {
                comp = "[x]";
            } else
                comp = "[ ]";
            System.out.println(i + 1 + " - " + comp + " " + taskInstances.get(i).name);
        }
    }

    static void readFile() {
        List<String> linesOfInputFile = null;
        try {
            linesOfInputFile = Files.readAllLines(Paths.get("input.txt"));
        } catch (IOException e) {
            System.out.println("Unable to read file: input.txt!");
            return;
        }
        for (String line : linesOfInputFile) {
            new Task(line);
        }
    }

    static void writeFile() {
        List<String> taskNames = new ArrayList<>();
        for (Task line : taskInstances) {
            taskNames.add(line.name);
        }
        try {
            Files.write(Paths.get("input.txt"), taskNames);
        } catch (
                IOException e) {
            System.out.println("Unable to write file: input.txt!");
        }
    }
}