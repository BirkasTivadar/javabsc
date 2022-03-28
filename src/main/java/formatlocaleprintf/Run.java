package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Gyakorlati feladat - Futás!
//        Készíts egy Run osztályt, amely egy személy e héten lefutott kilométereit tartalmazza. Ehhez van egy List<Double> típusú attribútuma, melynek elemei az egyes futások közben megtett kilométerek. Az appot használó ember nevét a konstruktorban kell beállítani (az osztálynak természetesen legyen ennek az eltárolására szolgáló attribútuma is). A konstruktorban jöjjön létre a lista is, figyelj arra, hogy módosítható listát hozz létre! Legyen az osztálynak egy addRun(double km) metódusa, mely a listához adja a legújabb futáskor megtett kilométerek számát! Ezenkívül legyen az osztálynak egy printFormattedRunText() metódusa, amely a napi edzés után a következőhöz hasonló szöveget ad vissza:
//        Kedves Kiss Béla! A mai dátum: 2021-09-13. Ezen a héten ez a(z) 4. futásod. Most 12,8 km-t futottál. Csak így tovább!
//        A metódus a dátumot a mai dátumra állítja be, a többi adatot pedig az app használójának neve és a kilométereket tároló lista aktuális állása alapján helyettesíti be. Használd a String.format() metódust!

public class Run {

    private final String name;
    private final List<Double> distances;

    public Run(String name) {
        this.name = name;
        this.distances = new ArrayList<>();
    }

    public void addRun(double km) {
        distances.add(km);
    }

    public String printFormattedRunText() {
        String dateString = LocalDate.now().toString();
        int numberOfDay = LocalDate.now().getDayOfWeek().getValue();
        return String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.2f km-t futottál. Csak így tovább!",
                name, dateString, numberOfDay, distances.get(numberOfDay - 1));
    }

    public static void main(String[] args) {
        Run run = new Run("Tivadar");
        run.addRun(15.6);
        run.addRun(5.8);
        run.addRun(10.22);
        run.addRun(13.1);
        run.addRun(7.63);
        run.addRun(3.4);
        run.addRun(11.2);

        System.out.println(run.printFormattedRunText());
    }
}
