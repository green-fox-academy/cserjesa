import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");

        Task.readFile();
        menu();
    }

    public static void menu() {

        System.out.println();
        System.out.println("Please choose one of these options:");
        System.out.println(" -l   Lists all the tasks");
        System.out.println(" -a   Add a new task");
        System.out.println(" -r   Remove a task");
        System.out.println(" -c   Complete a task");
        System.out.println(" -q   Quit program");

        input();
    }

    private static void input() {
        Scanner s = new Scanner(System.in);
        String x = Character.toString(s.next().charAt(0)).toLowerCase();
        if (x.equals("l")) {
            Task.getAllTasks();
        } else if (x.equals("r")) {
            System.out.println("Which task you want to delete?");
            Task.removeTask(numberInput());
            Task.writeFile();
        } else if (x.equals("a")) {
            System.out.println("Type the name of the task, please:");
            new Task(stringInput());
            Task.writeFile();
        } else if (x.equals("c")) {
            System.out.println("Which task you want to mark as completed?");
            Task.completeTask(numberInput());
        } else if (x.equals("q")) {
            Task.writeFile();
            System.exit(0);
        }

        Main.menu();
    }

    private static String stringInput() {
        Scanner scanner = new Scanner(System.in);
        String keyboardInput = scanner.nextLine();
        while (keyboardInput.length() <= 3) {
            System.out.println("Task name is too short. Please type a correct name:");
            keyboardInput = scanner.nextLine();
        }
        return keyboardInput;
    }

    private static int numberInput() {
        int keyboardInput = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isNumeric = false;
        while (!isNumeric)
            try {
                keyboardInput = scanner.nextInt();
                scanner.nextLine();
                isNumeric = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number:");
                scanner.nextLine();
            }
        return keyboardInput;
    }
}
