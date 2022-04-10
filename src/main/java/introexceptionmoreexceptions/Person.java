package introexceptionmoreexceptions;

/*
Gyakorlati feladat - Egy névtelen ember
        Hozd létre a Person osztályt, amelynek legyen két attribútuma: String name és int age! Készíts az osztályba konstruktort és getter metódusokat mindkét attribútumhoz! Írd felül az osztály toString() metódusát is!
        Ezek után példányosíts az osztály main() metódusában egy objektumot a következő módon:
        Person person = new Person(null, 32);
        Írd ki a konzolra a person változó értékét! Írd ki a konzolra az objektum name attribútumának értékét! Írd ki a konzolra az objektum name attribútumának értékét csupa nagybetűvel!
        Melyik utasításnál keletkezik a kivétel és miért?
*/

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {

        Person person = new Person(null, 32);

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase());
//        a nagybetűssé alalkításnál keletkezik kivétel, mert a name-nek nincs értéke (null)
    }
}
