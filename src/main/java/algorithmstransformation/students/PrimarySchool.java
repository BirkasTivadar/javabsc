package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public record PrimarySchool(List<Person> persons) {

    public PrimarySchool(List<Person> persons) {
        this.persons = new ArrayList<>(persons);
    }

    @Override
    public List<Person> persons() {
        return new ArrayList<>(persons);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Student> getStudents() {
        return persons.stream()
                .filter(p -> p.age() <= 18)
                .map(p -> new Student(p.name(), p.address()))
                .toList();
//        List<Student> students = new ArrayList<>();
//        for (Person person : persons) {
//            if (person.getAge() <= 18) students.add(new Student(person.getName(), person.getAddress()));
//        }
//        return students;
    }
}
