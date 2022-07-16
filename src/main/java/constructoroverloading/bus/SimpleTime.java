/*
Időpontok
        A bus csomagba dolgozz!
        A SimpleTime osztály objektuma egy időpontot reprezentál egy napon belül, és többféleképpen hozható létre. Az objektum el tudja dönteni, hogy a paraméterként kapott azonos típusú objektumtól percekben kifejezve mennyire különbözik.
        Konstruktorok:
public SimpleTime(int hours, int minutes)
public SimpleTime(int hours)
public SimpleTime(SimpleTime time)
        Publikus metódusok:
public int getDifference(SimpleTime time)
public String toString()
        A BusTimeTable osztály egy buszmenetrendet reprezentál, ahol az indulási időket SimpleTime objektumok listája tárolja. Ezt többféleképpen létre lehet hozni, lásd a konstruktorokat (óránként indul, generáláskor az első indulás óráját, az utolsó indulás óráját, és az ismétlődő perceket kell megadni). A listából ki lehet keresni a következő indulás idejét.
        Konstruktorok:
public BusTimeTable(List<SimpleTime> timeTable)
public BusTimeTable(int firstHour, int lastHour, int everyMinute)
        Publikus metódusok:
public List<SimpleTime> getTimeTable()
public SimpleTime getNextBus(SimpleTime actual)
        Ha az adott napon több busz már nem indul, a metódus dobjon IllegalStateException-t a megfelelő információs szöveggel.
*/

package constructoroverloading.bus;

public class SimpleTime {

    private final int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this(time.getHours(), time.getMinutes());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private int getTimeInMinutes() {
        return hours * 60 + minutes;
    }

    public int getDifference(SimpleTime anotherTime) {
        return this.getTimeInMinutes() - anotherTime.getTimeInMinutes();
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
