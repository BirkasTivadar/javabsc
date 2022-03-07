package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Person> personsAppliedForExam = new ArrayList<>();

    public List<Person> getPersonsAppliedForExam() {
        return new ArrayList<>(personsAppliedForExam);
    }

    public void addPerson(Person person) {
        personsAppliedForExam.add(person);
    }
}
