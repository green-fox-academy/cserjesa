public class Student extends Person implements Cloneable{
    private String previousOrganization; // the name of the student’s previous company / school
    private int skippedDays; // the number of days skipped from the course

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    void getGoal() {
        System.out.println();
        System.out.println("My goal is: Be a junior software developer. ");
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    void introduce() {
        super.introduce();
        System.out.print("from " + previousOrganization + " who skipped " + skippedDays +
                " days from the course already. ");
    }

    void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
