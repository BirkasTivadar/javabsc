package algorithmssum;

/*
Gyakorlati feladat - Kétjegyű páratlanok
        Írj egy getSum() metódust a TwoDigitOdds osztályba, mely visszaadja az összes olyan kétjegyű páratlan pozitív egész szám összegét, mely nem osztható 5-tel!
*/

public class TwoDigitOdds {
    public int getSum() {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
