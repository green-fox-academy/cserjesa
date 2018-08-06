//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

public class Print_params {

    public static void main(String[] args) {
        printParams("zsír", "király", "karaj", "f@sza");
    }

    public static void printParams(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
