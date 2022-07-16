/*
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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BusTimeTable {

    List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = new ArrayList<>(timeTable);
    }

    public BusTimeTable(int firstHour, int lastHour, int minutes) {
        for (int i = firstHour; i <= lastHour; i++) {
            timeTable.add(new SimpleTime(i, minutes));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return new ArrayList<>(timeTable);
    }

    public SimpleTime getNextBus(SimpleTime actual) {
      Optional<SimpleTime> result = timeTable.stream().filter(st -> st.getDifference(actual) > 0).findFirst();
      if(result.isPresent()) return result.get();
      else throw new IllegalStateException("No more buses today!");
    }
}
