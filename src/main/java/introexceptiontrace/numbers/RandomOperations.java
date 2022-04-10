package introexceptiontrace.numbers;
/*

Gyakorlati feladat - Generált tömb
        Hozd létre a következő osztályt, amelyben a getNumbers() metódus a segítségedre lesz abban, hogy generáljon neked egy 10 alatti, de random elemszámú tömböt, melyben egész számok lesznek találhatóak:

import java.util.Random;

public class RandomOperations {

    private Random random = new Random();

    public int[] getNumbers() {
        int lengthOfArray = random.nextInt(10) + 1;
        int[] numbers = new int[lengthOfArray];
        for (int i = 0; i <= lengthOfArray; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
    Ezután hozd létre a Change osztályt, amelyben legyen egy int[] changeNumbers() metódus! Ez a metódus először példányosít egy RandomOperations példányt, majd annak a getNumbers() metódusától elkért egész számok tömbjében minden elemet kicserél az utána következőre, tehát ha például egy ilyen tömböt kap: [74, 98, 76, 92, 33], akkor egy ilyet kell visszaadnia: [98, 76, 92, 33, 33] (az utolsó elemet értelemszerűen már nem tudja semmire kicserélni, ezért az érintetlenül marad). Így nézzen ki a metódus:

public int[] changeNumbers() {
        int[] numbers = new RandomOperations().getNumbers();
        for (int i = 0; i < numbers.length - 1; i++) {
        numbers[i] = numbers[i + 1];
        }
        return numbers;
        }
        Végül a NumbersMain osztály main() metódusában példányosíts egy Change példányt, hívd meg a changeNumbers() metódust, és írd ki a konzolra az általa visszaadott tömböt!

        Hol keletkezik a kivétel és miért? Kövesd vissza a hívási láncot!
*/

import java.util.Random;

public class RandomOperations {

    private Random random = new Random();

    public int[] getNumbers() {
        int lengthOfArray = random.nextInt(10) + 1;
        int[] numbers = new int[lengthOfArray];
        for (int i = 0; i <= lengthOfArray; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
