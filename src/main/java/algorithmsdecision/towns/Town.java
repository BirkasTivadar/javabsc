package algorithmsdecision.towns;

/*
Gyakorlati feladat - Kis lélekszámú települések
        Hozz létre egy towns.Town osztályt és benne egy containsFewerHabitants(List<Integer>, int) metódust, amely kap egy egész számokat tartalmazó listát, amelyben települések lakossága van felsorolva. A metódusnak el kell döntenie, hogy található-e a listában a paraméterként megadott számnál kisebb lélekszámú település.
*/

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> habitants, int max) {
        return habitants.stream().anyMatch(h -> h < max);
//        for (int h : habitants) {
//            if (h < max) return true;
//
//        }
//        return false;
    }
}
