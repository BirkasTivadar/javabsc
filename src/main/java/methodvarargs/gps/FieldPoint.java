package methodvarargs.gps;

/*
Gyakorlati feladat - A terep pontjai
        Egy tájékozódási túraverseny előkészítése zajlik. A szervezők naphosszat járják az erdőt és a megfelelő tereppontokat egy mobiltelefonos alkalmazásban rögzítik. Viszont mivel a terepen sok helyen nincs térerő, ezért az alkalmazás úgy működik, hogy ideiglenesen eltárolja a rögzített tereppontokat, és amikor térerőt talál, akkor az addig összegyűlt adatokat az aktuális időponttal együtt egyben beküldi a szerverre, ahol rögzítésre kerülnek a verseny központi adatbázisába.

        Hozd létre a gps.FieldPoint osztályt, amely egy tereppontot modellez, négy attribútuma van: LocalDateTime timeOfSetting, LocalDateTime timeOfLogging, double latitude (földrajzi szélesség) és double longitude (földrajzi hosszúság)! A FieldPoint objektum a létrehozáskor csak a timeOfSetting és a koordináták értékeit kapja meg, a timeOfLogging időpont később lesz beállítva. Majd hozd létre a HikingTour osztályt, amelyben található egy, a tereppontokat tartalmazó lista! Legyen ebben az osztályban egy logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) nevű metódus, amely paraméterként megkapja azt az időpontot, amikor a mobilappból beküldésre kerültek az adatok, valamint a rögzítendő tereppontok adatait. A metódus minden egyes tereppontot úgy rögzítsen a központi listában, hogy előtte beállítja annál a timeOfLogging attribútum értékét a most megkapott időpontra!

        Ha a beküldési időpont adat (timeOfLogging) valamilyen hiba folytán üresen érkezne, a metódus dobjon IllegalArgumentException kivételt a megfelelő tájékoztató szöveggel!
*/

import java.time.LocalDateTime;

public class FieldPoint {

    private final LocalDateTime timeOfSetting;
    private LocalDateTime timeOfLogging;
    private final double latitude;
    private final double longitude;

    public FieldPoint(LocalDateTime timeOfSetting, double latitude, double longitude) {
        this.timeOfSetting = timeOfSetting;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setTimeOfLogging(LocalDateTime timeOfLogging) {
        this.timeOfLogging = timeOfLogging;
    }

    public LocalDateTime getTimeOfSetting() {
        return timeOfSetting;
    }

    public LocalDateTime getTimeOfLogging() {
        return timeOfLogging;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
