import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Student john = new Student("John", 20, "male", "BME");
        people.add(john);

        Student student = new Student();
        people.add(student);
        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }
        try {
            Student student1 = john.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}