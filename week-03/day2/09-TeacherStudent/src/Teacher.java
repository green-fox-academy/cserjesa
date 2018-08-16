public class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student i) {
        System.out.println(this.name + " teaches " + i.name);
        i.learn(this);
    }

    void answer(Student j) {
        System.out.println(this.name + " answers to " + j.name);
    }
}
