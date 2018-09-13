import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private int id;
    private String name;
    private LocalDateTime completedAt;
    private LocalDateTime createdAt;
    private static ArrayList<Task> taskInstances = new ArrayList<>();

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        taskInstances.add(this);
    }

    public Task(String name) {
        this.id = findNextId(taskInstances);
        this.name = name;
        this.createdAt = LocalDateTime.now();
        taskInstances.add(this);
    }

    static void removeTask(int taskId) {
        for (int j = 0; j < taskInstances.size(); j++) {
            if (taskInstances.get(j).id == taskId) {
                try {
                    taskInstances.remove(taskId);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Unable to remove: id is not found");
                }
                j--;
                writeFile();
                return;
            }
        }
    }


    private static Duration completionTime(int taskId) {
        for (Task task : taskInstances) {
            if (task.getId() == taskId && task.completedAt != null) {
                return Duration.between(task.createdAt, task.completedAt);
            }
        }
        return null;
    }

    private static String durationFormatter(Duration duration) {
        if (duration != null) {
            long seconds = duration.getSeconds();
            return String.format(", completed in %d days, %2d hours, %2d minutes", seconds / 86400, seconds / 3600, (seconds % 3600) / 60);
        }
        return "";
    }

    static void completeTask(int taskId) {
        boolean taskFound = false;
        for (Task task : taskInstances) {
            if (task.getId() == taskId) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.completedAt = LocalDateTime.now();
                taskFound = true;
            }
        }
        if (!taskFound) {
            System.out.println("Unable to set complete: id is not found");
        }
        getAllTasks();
    }

    static void updateTask(int taskId, String name) {
        boolean taskFound = false;
        for (Task task : taskInstances) {
            if (task.getId() == taskId) {
                task.name = name;
                taskFound = true;
            }
        }
        if (!taskFound) System.out.println("Unable to set complete: id is not found");
    }

    static void getAllTasks() {
        String comp;
        if (taskInstances.size() == 0) {
            System.out.println("No todos for today! :)");
            return;
        }
        for (int i = 0; i < taskInstances.size(); i++) {
            if ((taskInstances.get(i).completedAt != null) && taskInstances.get(i).completedAt.isBefore(LocalDateTime.now())) {
                comp = "[x]";
            } else
                comp = "[ ]";
            System.out.println(taskInstances.get(i).id + " - " + comp + " " + taskInstances.get(i).name + durationFormatter(completionTime(taskInstances.get(i).id)));
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

    static int findNextId(List<Task> tasks) {
        int largestId = 0;
        for (Task task : tasks) {
            if (task.getId() > largestId) {
                largestId = task.getId();
            }
        }

        return largestId + 1;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}