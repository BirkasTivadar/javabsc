package algorithmssum;

/*
Gyakorlati feladat - Kétjegyű páratlanok
        Írj egy getSum() metódust a TwoDigitOdds osztályba, mely visszaadja az összes olyan kétjegyű páratlan pozitív egész szám összegét, mely nem osztható 5-tel!
*/

import java.util.stream.IntStream;

public class TwoDigitOdds {
    public int getSum() {
        return IntStream.range(10, 100).filter(i -> i % 2 != 0 && i % 5 != 0).sum();
    }
}
