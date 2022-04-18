package recursion;

/*
Gyakorlati feladat - Tömb elemeinek összege
        A Numbers osztályban legyen egy getSum(int[] numbers) metódus, mely összeadja a paraméterül kapott, egész számokat tartalmazó tömb elemeit! Írd meg a feladatot rekurzióval! (A megoldás menete: Egy 10 elemű tömb összegét számoljuk úgy ki, hogy az első elemet hozzáadjuk a 9 elemű résztömb elemeinek összegéhez. A metódus önmagát hívja újra, ekkor már a 9 elemű tömbbel, ekkor már az első elemet a 8 elemű résztömb elemeinek összegéhez kell hozzáadni és így tovább. Amint a tömb 1 eleművé “fogy”, az elemeinek az összege egyértelműen adódik.)
*/

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers) {
        if (numbers.length == 0) return 0;
        if ((numbers.length == 1)) return numbers[0];
        else {
            return numbers[0] + getSum(Arrays.copyOfRange(numbers, 1, numbers.length));
        }
    }
}
