public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22
        // Print the result of 13 substracted from 22
        // Print the result of 22 multiplied by 13
        // Print the result of 22 divided by 13 (as a decimal fraction)
        // Print the integer part of 22 divided by 13
        // Print the reminder of 22 divided by 13

    int num1 = 22;
    int num2 = 13;

        System.out.println(num1 + " added to " + num2 + " is " + (num1 + num2));
        System.out.println(num2 + " substracted from " + num1 + " is " + (num1 - num2));
        System.out.println(num1 + " multiplied by " + num2 + " is " + (num1 * num2));
        System.out.println("22 divided by 13 is " + ((double)22 / (double)13));
        System.out.println(num1 + " divided by " + num2 + " is " + (num1 / num2));
        System.out.println("Reminder of " + num1 + " divided by " + num2 + " is " + (num1 % num2));



    }
}