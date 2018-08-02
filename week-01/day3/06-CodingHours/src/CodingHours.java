public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyWork = 6;
        int weeks = 17;
        int workDays = 5;

        System.out.println("Attendees spend " + dailyWork * weeks * workDays + " hours with coding in a semester.");
        System.out.println("This is about " + Math.round((float)(dailyWork * workDays)/52 * 100) + "% percent of work hours.");
    }
}