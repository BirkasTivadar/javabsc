package introexceptionmoreexceptions;

import java.util.Arrays;

/*
Gyakorlati feladat - Három tömb
        Másold be a ThreeArrays osztály main() metódusába a következőket:

        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 2, 1, 42};
        int[] third = new int[first.length];

        for (int i = 0; i < first.length; i++) {
        third[i] = first[i] / second[i];
        System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));

        Hol keletkezik a kivétel és miért?
*/

public class ThreeArrays {

    public static void main(String[] args) {

        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0, 42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 2, 1, 42};
        int[] third = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            third[i] = first[i] / second[i];  // amikor az i=10 akkor keletkezik ArrayIndexOutOfBoundsException, mert a sceond-nak nincs 10. indexű (11.) eleme
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));

    }
}
