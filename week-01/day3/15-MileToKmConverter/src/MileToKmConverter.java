import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Hey I can convert kilometers to miles" + "\n" + "What do you want me to convert?");
        Scanner scanner = new Scanner(System.in);
        double userInput1 = scanner.nextInt();

        System.out.println(userInput1 + " km equals " + (0.621371192 * userInput1) + " miles.");
    }
}