public class Mentor extends Person {
    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this.level = "intermediate";
    }

    void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers. ");
    }

    void introduce() {
        super.introduce();
        System.out.println(this.level + " mentor. ");
    }
}
