import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    List<Student> students;
    List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    void addStudent(Student st) {
        this.students.add(st);
    }

    void addMentor(Mentor mt) {
        this.mentors.add(mt);
    }

    void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
