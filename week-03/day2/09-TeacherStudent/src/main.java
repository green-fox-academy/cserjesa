/*
Create Student and Teacher classes
Student
    learn()
    question(teacher) -> calls the teachers answer method
Teacher
    teach(student) -> calls the students learn method
    answer()
 */

public class main {
    public static void main(String args[]) {
        Student student1 = new Student("Tercsi");
        Student student2 = new Student("Fercsi");
        Student student3 = new Student("Kata");
        Student student4 = new Student("Klára");
        Teacher teacher1 = new Teacher("Magdi néni");
        Teacher teacher2 = new Teacher("Margit néni");
        Teacher teacher3 = new Teacher("Manci néni");
        Teacher teacher4 = new Teacher("Manyi néni");

        student1.question(teacher1);
        teacher4.teach(student3);
        teacher2.answer(student2);
        student4.question(teacher2);
        student2.learn(teacher3);
    }
}
