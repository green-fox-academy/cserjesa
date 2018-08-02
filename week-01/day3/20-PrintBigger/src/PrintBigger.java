import java.util.Scanner;

public class PrintBigger {


// Write a program that asks for two numbers and prints the bigger one

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the 1st number");
        int u1 = scanner.nextInt();

        System.out.println("Give me the 2nd number");
        int u2 = scanner.nextInt();

        if(u1 < u2 ){
            System.out.println(u2 + " is bigger");
        }
        else if(u1 > u2 ){
            System.out.println(u1 + " is bigger");
        }
        else{
            System.out.println(u1 + " and " + u2 + " are equals.");
        }
    }
}

