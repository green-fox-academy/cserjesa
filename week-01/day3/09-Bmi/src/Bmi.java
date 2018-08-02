public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        System.out.println("Your BMI is ~: " + Math.round((massInKg / Math.pow(heightInM, 2))));
        System.out.println("You are \"Overweight\". Don't worry BMI is obsolete anyway. Be happy! :)");
    }
}