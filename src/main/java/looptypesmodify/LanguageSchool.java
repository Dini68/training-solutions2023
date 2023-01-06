package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Hunor");
        Student student2 = new Student("Zoltán");
        Student student3 = new Student("Balázs");
        Student student4 = new Student("Gergely");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        student2.setActive(false);
        student4.setActive(false);

        System.out.println(students.size());
        System.out.println(students);

        List<Student> removeStudents = new ArrayList<>();
        for (Student st: students) {
            if (!st.isActive()) {
                removeStudents.add(st);
            }
        }
        students.removeAll(removeStudents);

        System.out.println(students.size());
        System.out.println(students);
    }
}
