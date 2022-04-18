package algorithmscount;

/*
Gyakorlati feladat - Kétjegyű számok számjegyei
        A Digits osztályba írj egy getCountOfNumbers() metódust, amely a következő matematikai feladat megoldását adja vissza: Hány olyan kétjegyű pozitív egész szám van, amelyben az egyik számjegy 5-tel nagyobb a másiknál?
*/

import java.util.stream.IntStream;

public class Digits {
    public int getCountOfNumbers() {
        return (int) IntStream.range(10, 100)
                .filter(i ->
                        Integer.parseInt(Integer.toString(i).substring(0, 1)) + 5 == Integer.parseInt(Integer.toString(i).substring(1))
                                || Integer.parseInt(Integer.toString(i).substring(0, 1)) - 5 == Integer.parseInt(Integer.toString(i).substring(1))
                ).count();
//        int count = 0;
//        for (int i = 1; i <= 9; i++)
//            for (int j = 0; j <= 9; j++)
//                if (Math.abs(i - j) == 5) {
//                    count++;
//                }
//        return count;
    }
}
