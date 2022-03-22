package junit5assert;

//Gyakorlati feladat - Páros számok
//        A Numbers osztályban készíts egy int[] getEvenNumbers(int[] numbers) metódust, amely paraméterként egy egész számokat tartalmazó tömböt kap! A metódus ezt a tömböt úgy adja vissza, hogy a páratlan számok helyére 0-t tegyen!
//        Majd a NumbersTest osztályban hozd létre a testGetEvenNumbers() metódust, amelyben példányosítasz egy Numbers példányt, egy egész számokat tartalmazó tömböt, valamint az elvárt értékeket tartalmazó tömböt! Hívd meg a getEvenNumbers() metódust, és hasonlítsd össze az általa visszaadott tömböt az elvárttal!
//        Tehát például ha a következő tömböt kapja a metódus: {2, 8, 5, 6, 2, 3, 9}, akkor ezt kell visszaadnia: {2, 8, 0, 6, 2, 0, 0}.

public class Numbers {

    public int[] getEvenNumbers(int[] numbers) {
        int arrLength = numbers.length;
        int[] result = new int[arrLength];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[i] = numbers[i];
            }
        }

        return result;
    }
}
