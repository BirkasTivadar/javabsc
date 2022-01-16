package looptypesmodify;

//Gyakorlati feladat - Minden harmadik
//        Az EveryThird osztály int[] changeToZero(int[] numbers) metódusa a parméterül kapott tömbben változtassa meg az utolsó számot 0-ra, majd onnantól visszafelé számolva minden harmadik számmal is tegye ugyanezt! Teszteld az osztály main() metódusában!
//        Tehát ha például a tömb úgy néz ki, hogy: {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9}, akkor az eredményként kapott tömb pedig a következő legyen: {2, 0, 3, 5, 0, 2, 6, 0, 3, 5, 0, 3, 2, 0}

import java.util.Arrays;

public class EveryThird {

    public int[] changeToZero(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i -= 3) {
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};

        EveryThird everyThird = new EveryThird();

        everyThird.changeToZero(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
