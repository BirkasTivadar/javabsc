package junit5;

public class Gentleman {

    public String sayHello(String name) {
        if (name == null) {
            return "Hello Anonymus";
        }

        return "Hello " + name;

//        Gyakorlati feladat - Hibás teszt
//        Rontsd el először a programot, hogy hibás üzenetet adjon vissza! Hogy jelzi a JUnit ezt? Rontsd el a tesztesetet, hogy hibás legyen, amire ellenőriz! Hogyan jelzi ezt a JUnit a futtatáskor?
//        return "Hell " + name;
    }
}
