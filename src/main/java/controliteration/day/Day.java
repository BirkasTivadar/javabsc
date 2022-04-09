package controliteration.day;

//Gyakorlati feladat - Napok és napszakok
//        A controliteration.day csomagba dolgozz!
//        Hozz létre egy DayPeriod nevű enumot a következő értékekkel: DAYTIME és NIGHTTIME!
//        Majd hozz létre egy Hour osztályt, melynek két attribútuma van: int hourNumber és DayPeriod period! Legyenek hozzájuk getterek és setterek, valamint egy olyan konstruktora legyen az osztálynak, mely csak a hourNumber attribútum értékét várja!
//        Legyen továbbá egy Day osztály, amelynek van egy List<Hour> hoursOfDay listája! Legyen a listához egy getter metódus, valamint egy addHour(Hour hour) metódus, amellyel új értékeket lehet a listához adni!
//        Végül pedig legyen a Day osztályban egy setDayPeriod() metódus, amely for-each ciklussal végigmegy a lista tartalmán, és beállítja az egyes Hour példányok period attribútumának az értékét! Ha a Hour hourNumber értéke 6 és 22 óra között van, akkor DayPeriod.DAYTIME legyen a beállított érték, egyéb esetekben pedig DayPeriod.NIGHTTIME!

import java.util.ArrayList;
import java.util.List;

public class Day {

    private final List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return new ArrayList<>(hoursOfDay);
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour hour : hoursOfDay) {
            if (hour.getHourNumber() > 6 && hour.getHourNumber() < 22) {
                hour.setPeriod(DayPeriod.DAYTIME);
            } else {
                hour.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
