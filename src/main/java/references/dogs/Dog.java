package references.dogs;

//Gyakorlati feladat - Kutyák
//        Készíts egy dogs.Dog osztályt, amelynek három attribútuma van: String name, int age, String colour Legyen mindegyik attribútumhoz getter és setter, valamint legyen az osztálynak egy konstruktora, mely mindhárom attribútum értékét várja! Írd felül a toString() metódusát is, szabadon dönthetsz, hogy az IDE által generált értéket adja vissza, vagy egy általad megadott értéket, a fontos az, hogy mindhárom attribútum értéke benne legyen a visszaadott szövegben.
//        Készíts ezután egy Kennel osztályt, melynek main() metódusában írd meg a következőket, és közben próbáld meg követni, mi is történik a háttérben, a memóriában:
//        Hozz létre egy üres List<Dog> dogs listát, amelyben az osztály a hozzá tartozó kutyákat fogja nyilvántartani!
//        Példányosíts három különböző Dog-ot, és mindhármat add hozzá a listához!
//        Írd ki a konzolra a lista tartalmát!
//        Majd definiálj egy új (negyedik) Dog típusú változót, amelynek add értékül a lista 1-es indexű elemét! A most definiált változónév használatával változtasd meg a kutya színét!
//        Újra írd ki a konzolra a lista tartalmát!
//        Definiálj egy újabb (ötödik) Dog típusú változót, melynek adj értékül egy újonnan példányosított objektumot! Írd is ki a konzolra ennek a példánynak az adatait!
//        Az előző lépésben definiált változónak add értékül a kutyalista 1-es indexű elemét! Írd ki a konzolra a változó értékét!
//        A listához add hozzá az előző változó által hivatkozott példányt! Írd ki a konzolra a lista tartalmát!
//        Definiálj megint egy (hatodik) Dog típusú változót, majd add neki értékül a korábbi, negyedik Dog típusú változó értékét! A most definiált változó nevének használatával változtasd meg a kutya színét!
//        Újra írd ki a konzolra a lista tartalmát!
//        Definiálj egy második List<Dog> típusú listát, melynek add értékül az első listát!
//        Definiálj megint egy (hetedik) Dog típusú változót, majd ennek is add értékül a korábbi, negyedik Dog típusú változó értékét! A most definiált változó nevének használatával újra változtasd meg a kutya színét!
//        Újra írd ki a konzolra a lista tartalmát, immár a második List<Dog> típusú változó nevének használatával!
//        Az eredetileg létrehozott, másodikként definiált Dog típusú változó nevének használatával változtasd meg a kutya színét! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!
//        Az eredetileg létrehozott, másodikként definiált Dog típusú változó értékét változtasd meg null-ra! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!
//        Definiálj egy újabb (nyolcadik) Dog típusú változót, majd add neki értékül az első kutyalista 1-es indexű elemét! Majd állítsd át az értékét null-ra! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!
//        Definiálj egy utolsó (kilencedik) Dog típusú változót, majd add neki értékül az első lista 1-es indexű elemét! A most definiált változó nevének használatával változtasd meg a kutya színét! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!
//        Tudtad követni, mi történik a memóriában?

public class Dog {

    private String name;
    private int age;
    private String colour;

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
