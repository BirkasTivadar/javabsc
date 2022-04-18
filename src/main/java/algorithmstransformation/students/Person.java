package algorithmstransformation.students;

/*
Gyakorlati feladat - Diákok
        Legyen egy Person osztály név, életkor és cím attribútumokkal, konstruktorral és getterekkel! Továbbá legyen egy hasonló student.Student osztály, de itt csak név és cím attribútumok legyenek! Majd legyen egy PrimarySchool osztály, amelynek van egy listája, amelyben az iskola összes diákját, tanárját és technikai dolgozóit tartja nyilván! A lista konstruktor paraméteren keresztül kapjon értéket, és legyen hozzá getter és addPerson(Person) metódus! Ebben az osztályban írj meg egy List<Student> getStudents() metódust, amely az iskola listájából kiválogatja és egy másik listában visszaadja az iskola tanulóit!
*/

public record Person(String name, int age, String address) {
}
