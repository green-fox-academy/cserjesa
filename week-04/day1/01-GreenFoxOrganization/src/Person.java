public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    void introduce() {
        System.out.print("Hi, I'm " + name + ", " + age + " year old " + gender + " ");
    }

    void getGoal() {
        System.out.println();
        System.out.println("My goal is: Live for the moment! ");
    }
}
