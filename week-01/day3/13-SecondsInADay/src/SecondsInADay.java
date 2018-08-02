import java.text.SimpleDateFormat;
import java.util.Calendar;
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        System.out.println(86400 - (currentHours * 3600) - (currentMinutes * 60) - currentSeconds + " remaining today");

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("It is " + sdf.format(cal.getTime()) + " btw.");
    }
}