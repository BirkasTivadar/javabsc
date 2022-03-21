package mathproblems;

//Gyakorlati feladatok
//        A mathproblems.Division osztályba dolgozz!

import org.jetbrains.annotations.NotNull;

public class Division {

//    Gyakorlati feladat - Egy szám osztói
//    Írj egy void getDivisors(int number) metódust, amely paraméterként kap egy számot, és kiírja annak a számnak az összes osztóját a következőhöz hasonlóan:
//            12 osztója: 1
//            12 osztója: 2
//            12 osztója: 3
//            12 osztója: 4
//            12 osztója: 6
//            12 osztója: 12
//    Az osztály main() metódusában teszteld a metódus működését!

    public void getDivisor(int number) {

        String preString = number + " osztója: ";

        System.out.println(preString + 1);

        int maxDivisor = number / 2;

        for (int i = 2; i <= maxDivisor; i++) {
            if (number % i == 0) {
                System.out.println(preString + i);
            }
        }

        System.out.println(preString + number);
    }


//    Gyakorlati feladat - Számok indexe
//    Hozz létre egy void getRightNumbers(int[] numbers) metódust, mely paraméterül egy egész számokat tartalmazó tömböt kap! A metódusban menj végig a tömb elemein, és a konzolra írd ki belőle azt a számot, amely osztható a tömbbeli indexével! Vigyázz a 0-ás indexszel!
//    Tehát ha például a következő tömb: {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10}, akkor ez kerüljön a konzolra: 5 -36 45 78 14 -8 10
//    Az osztály main() metódusában teszteld a metódus működését!

    public void getRightNumbers(int @NotNull [] numbers) {
        if (numbers.length > 1) {
            System.out.print(numbers[1] + " ");
            for (int i = 2; i < numbers.length; i++) {
                int actualNumber = numbers[i];
                if ((actualNumber % i) == 0) {
                    System.out.print(actualNumber + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisor(12);

        int[] testArray = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(testArray);
    }
}
