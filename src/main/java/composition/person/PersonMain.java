package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Address address = new Address("9024", "Hungary", "Győr", "Cuha 41.");

        Person person = new Person("Boroja", "ae345654", address);
        System.out.println(person.personToString());

        person.moveTo(new Address("11456", "Espana", "Málaga", "calle Bolívia 44"));
        System.out.println(person.personToString());

    }
}
