public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

        double width = 10;
        double length = 20;
        double height = 30;

        System.out.println("Surface Area: " + Math.round(2 * ((length * height) + (length * width) + (width * height))));
        System.out.println("Volume: " + Math.round(width * length * height));
    }
}
