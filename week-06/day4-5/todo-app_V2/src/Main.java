public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            menu();
            return;
        }

        Task.readFile();

        if (args[0].equals("-l")) {
            Task.getAllTasks();
            return;
        }

        if (args[0].equals("-a")) {
            if (args.length < 2) {
                System.out.println("Unable to add: no task provided");
                return;
            }
            if (args[1].length() < 3) {
                System.out.println("Task name is too short. Please type a correct name:");
                return;
            }
            new Task(args[1]);
            Task.writeFile();
            return;
        }

        if (args[0].equals("-c")) {
            if (args.length < 2) {
                System.out.println("Unable to check: no index provided");
                return;
            }
            Task.completeTask(Integer.parseInt(args[1]));
            return;
        }

        if (args[0].equals("-r")) {
            if (args.length < 2) {
                System.out.println("Unable to remove: no index provided");
                return;
            }
            Task.removeTask(Integer.parseInt(args[1]));
            return;
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println("Please choose one of these options:");
        System.out.println(" -l   Lists all the tasks");
        System.out.println(" -a   Add a new task");
        System.out.println(" -r   Remove a task");
        System.out.println(" -c   Complete a task");
        System.out.println(" -q   Quit program");
    }
}
