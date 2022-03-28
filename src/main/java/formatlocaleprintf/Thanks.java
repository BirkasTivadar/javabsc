package formatlocaleprintf;

import java.util.List;

//Gyakorlati feladatok
//        A formatlocaleprintf csomagba dolgozz!
//        Gyakorlati feladat - Konzolra írt formázott szöveg
//        A Thanks osztály main() metódusában hozz létre egy String listát, amelyben megadod néhány személy nevét! Majd implementáld, hogy egy ciklusban végigmenve a listán a program a konzolra írja minden személy nevével a következő mondatot:
//        “Kedves XY! Örülünk, hogy termékünket választotta!”
//        Használd a System.out.printf() metódust!

public class Thanks {

    public static void main(String[] args) {
        List<String> names = List.of("Jenő", "Mary", "Arabella", "Jóska");
        for (String name : names) {
            System.out.printf("Kedves %s! Örülünk, hogy a termékünket választotta!%n", name);
        }
    }
}
