package arrayofarrays;

import java.time.Month;

//A DailyValues osztály int[][] getValues() metódusában hozz létre egy 12 elemű tömböt, és mindegyik elem egy olyan hosszú tömböt tartalmazzon, amennyi nap van az adott hónapban (nem vagyunk szökőévben)! Ezt a tömböt nem kell értékekkel feltölteni, csak létrehozni és a konzolra kiírni.

public class DailyValues {

    public int[][] getValues() {
        int[][] result = new int[12][];
        for (int i = 0; i < 12; i++) {
            result[i] = new int[Month.of(i + 1).minLength()];
        }
        return result;
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        arrayOfArrays.printArrayOfArrays(dailyValues.getValues());
    }
}
