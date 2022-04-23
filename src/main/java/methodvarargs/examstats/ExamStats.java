package methodvarargs.examstats;

/*
Gyakorlati feladat - Vizsga statisztika
        Készíts egy examstats.ExamStats osztályt, amely képes változó számú vizsgaeredmény (pontokban megadva) esetén “statisztikát” készíteni. Ehhez az objektum adott vizsga esetén megkapja a maximális pontszámot konstruktorban, majd az egyik metódusában a küszöbérték (százalék) valamint a vizsgaeredmények (pontok) felsorolásával ki tudja számolni az adott küszöbérték feletti eredmények számát. Egy másik metódusban az alsó küszöbérték (százalékban) megadása és a vizsgaeredmény-felsorolás megadásával meg tudja mondani, bukott-e valaki a vizsgán.

        Publikus metódusok:

public ExamStats(int maxPoints)
public int getNumberOfTopGrades(int limitInPercent, int... results)
public boolean hasAnyFailed(int limitInPercent, int... results)
        Ha a felsorolást nem adja meg a felhasználó (kihagyja a paramétert), a metódusnál nem mutat hibát az IDE. Varargs esetén ugyanis ilyenkor automatikusan üres tömb lesz a paraméter. Ebben az esetben viszont IllegalArgumentException-t várunk, a megfelelő tájékoztató szöveggel.
*/

import java.util.Arrays;

public class ExamStats {
    private final int maxPoints;
    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }
    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0)
            throw new IllegalArgumentException("Number of results must not be empty!");
        int minPoint = (int) (limitInPercent / 100.0 * maxPoints);
        return (int) Arrays.stream(results).filter(r -> r > minPoint).count();
//        int count = 0;
//        for (int result : results) {
//            if (result > minPoint) count++;
//        }
//        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        return getNumberOfTopGrades(limitInPercent, results) != results.length;
    }
}
