package introexceptionmoreexceptions;

/*
Gyakorlati feladat - Újabb három tömb
        A Three osztály main() metódusába másold be a következőket:

        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 0, 1, 42, 456};
        int[] third = new int[second.length];

        for (int i = 0; i < second.length; i++) {
        third[i] = first[i] / second[i];

        System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
        Hol keletkezik a kivétel és miért?
*/

import java.util.Arrays;

public class Three {

    public static void main(String[] args) {
        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0, 42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 0, 1, 42, 456};
        int[] third = new int[second.length];

        for (int i = 0; i < second.length; i++) {
            third[i] = first[i] / second[i];  // a second 7. eleme 0 ezért itt ArithmeticException keletkezik
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
    }

}
