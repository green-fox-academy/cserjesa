public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    void introduce() {
        super.introduce();
        System.out.println(" who represents " + company + " and hired " + hiredStudents + " students so far. ");
    }

    void hire() {
        hiredStudents++;
    }


    void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers. ");
    }
}
