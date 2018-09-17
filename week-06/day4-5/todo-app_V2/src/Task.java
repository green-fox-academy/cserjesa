import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task {
    private int id;
    String name;
    private LocalDateTime completedAt;
    private LocalDateTime createdAt;
    static ArrayList<Task> taskList = new ArrayList<>();

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        taskList.add(this);
    }

    public Task(String name) {
        this.id = findNextId(taskList);
        this.name = name;
        this.createdAt = LocalDateTime.now();
        taskList.add(this);
    }

    static void removeTask(int taskId) {
        for (int j = 0; j < taskList.size(); j++) {
            if (taskList.get(j).id == taskId) {
                try {
                    taskList.remove(taskId);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Unable to remove: id is not found");
                    return;
                }
                j--;
                FileManipulation.writeFile();
                return;
            }
        }
    }

    private static Duration completionTime(int taskId) {
        return taskList.stream()
                .filter(a -> a.id == taskId)
                .filter(b -> b.completedAt != null)
                .map(c -> Duration.between(c.createdAt, c.completedAt))
                .findFirst()
                .orElse(null);
    }

    private static String durationFormatter(Duration duration) {
        if (duration != null) {
            long seconds = duration.getSeconds();
            return String.format(", completed in %d days, %2d hours, %2d minutes", seconds / 86400, (seconds % 86400) / 3600, (seconds % 3600) / 60);
        }
        return "";
    }

    static void completeTask(int taskId) {
        Optional<Task> toComplete = taskList.stream()
                .filter(a -> a.id == taskId)
                .findFirst();
        if (toComplete.isPresent()) {
            toComplete.get().completedAt = LocalDateTime.now();
        } else {
            System.out.println("Unable to set complete: id is not found");
        }

        getAllTasks();
    }

    static void updateTask(int taskId, String name) {
        Optional<Task> toComplete = taskList.stream()
                .filter(a -> a.id == taskId)
                .findFirst();
        if (toComplete.isPresent()) {
            toComplete.get().name = name;
        } else {
            System.out.println("Unable to set update: id is not found");
        }
    }

    static void getAllTasks() {
        String comp;
        if (taskList.size() == 0) {
            System.out.println("No todos for today! :)");
            return;
        }
        for (int i = 0; i < taskList.size(); i++) {
            if ((taskList.get(i).completedAt != null) && taskList.get(i).completedAt.isBefore(LocalDateTime.now())) {
                comp = "[x]";
            } else
                comp = "[ ]";
            System.out.println(taskList.get(i).id + " - " + comp + " " + taskList.get(i).name
                    + durationFormatter(completionTime(taskList.get(i).id)));
        }
    }

    static Integer findNextId(List<Task> tasks) {
        return tasks.stream()
                .map(a -> a.id)
                .max(Comparator.naturalOrder())
                .orElse(0) + 1;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}