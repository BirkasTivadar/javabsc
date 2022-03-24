package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void addStudetn(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        return student.getNeptunCode().equals(anotherStudent.getNeptunCode())
                && student.getEducationalID().equals(anotherStudent.getEducationalID());
    }

}
