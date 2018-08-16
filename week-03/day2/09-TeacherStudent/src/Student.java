public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learn(Teacher l) {
        System.out.println(this.name + " learns from " + l.name);
    }

    void question(Teacher k) {
        System.out.println(this.name + " questions " + k.name);
        k.answer(this);
    }
}
