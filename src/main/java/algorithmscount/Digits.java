package algorithmscount;

/*
Gyakorlati feladat - Kétjegyű számok számjegyei
        A Digits osztályba írj egy getCountOfNumbers() metódust, amely a következő matematikai feladat megoldását adja vissza: Hány olyan kétjegyű pozitív egész szám van, amelyben az egyik számjegy 5-tel nagyobb a másiknál?
*/

public class Digits {
    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 1; i <= 9; i++)
            for (int j = 0; j <= 9; j++)
                if (Math.abs(i - j) == 5) {
                    count++;
                }
        return count;
    }
}
