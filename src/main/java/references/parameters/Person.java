package references.parameters;

//Gyakorlati feladatok
//        Gyakorlati feladat - Referenciák
//        Készíts egy Person osztályt a references.parameters csomagba, melyben eltárolod a nevét (name) és az életkorát (age)! A konstruktor mindkét attribútumot megkapja, és mindenhez generálj gettert és settert!
//        Deklarálj a ReferencesMain osztály main() metódusában két Person típusú változót! Példányosíts egy új Person objektumot, és add értékül az első változónak! A második változónak add értékül az elsőt! Módosítsd a második változón át az objektum name attribútumát! Írd ki mindkét változó tartalmát a képernyőre! Mit tapasztalsz? Vajon mi történt?
//        Deklarálj két egész típusú változót! Az elsőnek add értékül a 24-et! A második változónak add értékül az elsőt, majd növeld meg a második változó értékét 1-gyel! Írd ki mindkét változót a képernyőre! Mit tapasztalsz? Miért?
//        Készíts egy új Person objektumot és add értékül az egyik Person típusú változónak! Írd ki mindkét változó tartalmát a képernyőre! Mit tapasztalsz? Miért?
//        Próbáld követni, hogy mi történik a memóriában! Segítségedre lesz a debugger.

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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
