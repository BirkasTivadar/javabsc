package methodstructure.pendrives;

/*
 A Pendrives részletei: A metódusokat úgy implementáld, hogy nem hívod a Pendrive getPrice() metódusát.

         Legyen Pendrive getBest(List<Pendrive>) metódusa, amely a legjobb ár/kapacitás értékű pendrive-t adja vissza, azaz amelyiknél ez a legkisebb.
        Legyen Pendrive getCheapest(List<Pendrive>) metódusa, amely a legolcsóbbat adja vissza.
        Legyen void risePriceWhereCapacity(List<Pendrive>, int percent, int capacity) metódusa, amely adott százalékkal megemeli azon pendrive-ok árát, amelynek a kapacitása a megadott értékkel megegyezik.
*/

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendrives) {
        return pendrives.stream().min(Pendrive::comparePricePerCapacity).get();
//        Pendrive result = pendrives.get(0);
//        for (Pendrive pendrive : pendrives) {
//            if (result.comparePricePerCapacity(pendrive) > 0) result = pendrive;
//        }
//        return result;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive result = pendrives.get(0);
        for (Pendrive pendrive : pendrives) {
            if (pendrive.isCheaperThan(result)) result = pendrive;
        }
        return result;
    }
}
