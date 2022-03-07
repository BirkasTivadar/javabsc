package primitivetypes.exam;

import java.time.LocalDate;

//Gyakorlati feladat - Vizsgára jelentkezés
//        A primitivetypes.exam csomagba dolgozz!
//        Egy egyszerű alkalmazást kell létrehoznod, amelyben egy tanfolyam elvégzése esetén a záróvizsgára lehet jelentkezni.
//        Hozz létre egy Person osztályt, melynek négy attribútuma van, egy személy neve (String típusú), születési ideje (LocalDate típusú), irányítószáma (int típusú) és egy double típusú szám, mely a tanfolyamon szerzett osztályzatainak átlaga. Legyen az összes attribútum értékét váró konstruktor és legyenek mindegyik attribútumhoz getter metódusok!Írd felül az osztály toString() metódusát is egy általad választott formában!
//        Majd legyen egy Exam osztály, melynek legyen egy List<Person> típusú attribútuma, amelyben a már vizsgára jelentkezett személyek adatai vannak eltárolva! Legyen hozzá getter metódus és egy addPerson(Person person) metódus, amellyel a listához tudod adni az újonnan jelentkezőket!
//        Az ExamRegistration osztály main() metódusában implementáld a jelentkezés menetét! Kérd be egymás után a jelentkező adatait, de úgy, hogy az összes adatot szövegként olvasod be, és utána egy-egy újabb metódushívással készítesz megfelelő számokat a szövegként beérkezett adatokból! A folyamat végén vedd is fel a jelentkezőt az Exam osztály listájába!

public class Person {

    private String name;
    private LocalDate birthDate;
    private int zipCode;
    private double averageOfMarks;

    public Person(String name, LocalDate birthDate, int zipCode, double averageOfMarks) {
        this.name = name;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.averageOfMarks = averageOfMarks;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverageOfMarks() {
        return averageOfMarks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", zipCode=" + zipCode +
                ", averageOfMarks=" + averageOfMarks +
                '}';
    }
}
