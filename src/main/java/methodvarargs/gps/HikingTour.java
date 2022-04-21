package methodvarargs.gps;

/*
Majd hozd létre a HikingTour osztályt, amelyben található egy, a tereppontokat tartalmazó lista! Legyen ebben az osztályban egy logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) nevű metódus, amely paraméterként megkapja azt az időpontot, amikor a mobilappból beküldésre kerültek az adatok, valamint a rögzítendő tereppontok adatait. A metódus minden egyes tereppontot úgy rögzítsen a központi listában, hogy előtte beállítja annál a timeOfLogging attribútum értékét a most megkapott időpontra!

        Ha a beküldési időpont adat (timeOfLogging) valamilyen hiba folytán üresen érkezne, a metódus dobjon IllegalArgumentException kivételt a megfelelő tájékoztató szöveggel!
*/

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HikingTour {

    private final List<FieldPoint> fieldPoints = new ArrayList<>();

    public List<FieldPoint> getFieldPoints() {
        return new ArrayList<>(fieldPoints);
    }

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) throw new IllegalArgumentException("Time of logging must not be null!");
        Arrays.stream(fieldPointsToLog)
                .peek(f -> f.setTimeOfLogging(timeOfLogging))
                .forEach(fieldPoints::add);
//        for (FieldPoint fieldPoint : fieldPointsToLog) {
//            fieldPoint.setTimeOfLogging(timeOfLogging);
//            fieldPoints.add(fieldPoint);
//        }
    }
}
