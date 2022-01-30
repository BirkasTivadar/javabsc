package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person firstPerson;

        Person secondPerson;

        firstPerson = new Person("Bá", 18);

        secondPerson = firstPerson;

        secondPerson.setName("Lili");

        System.out.println(firstPerson.getName());
        System.out.println(secondPerson.getName());

        firstPerson = new Person("Marci", 23);

        System.out.println(firstPerson);
        System.out.println(secondPerson);
    }
}
