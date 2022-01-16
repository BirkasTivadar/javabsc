package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Joe"),
                new Student("John"),
                new Student("Jack"),
                new Student("Jane"),
                new Student("José")
        ));

        Student javier = new Student("Javier");
        Student maria = new Student("Maria");
        Student yoslenia = new Student("Yoslénia");

        students.add(javier);
        students.add(maria);
        students.add(yoslenia);

        for (Student student : students) {
            if (student.getName().startsWith("J")) {
                student.setActive(false);
            }
        }

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (!student.isActive()) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);

        System.out.println(students.size());
    }
}
