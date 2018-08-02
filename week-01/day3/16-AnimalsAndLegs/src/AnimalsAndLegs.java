import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("Hello farmer!\nHow man chickens have you got? (I mean animals.)");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println("How many pigs?");
        int userInput2 = scanner.nextInt();

        System.out.println("Dear Farmer \nYour animals have " +
            ((2 * userInput1) + (4 * userInput2)) +
            " legs. (If they are intact.)\nKeep in mind!");
    }
}