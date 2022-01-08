package array;

public class ArrayHandler {

    //    Hozz létre egy array.ArrayHandler osztályt, és implementálj benne egy void addIndexToNumber(int[] source) metódust, mely egy egész számokat tartalmazó tömb minden eleméhez hozzáadja a tömbbeli indexét!
    public void addIndexToNumber(int[] source) {
        int sourceLength = source.length;
        for (int i = 0; i < sourceLength; i++) {
            source[i] += i;
        }
    }

    //    Írj egy void concatenateIndexToWord(String[] source) metódust is, mely egy szavakat tartalmazó tömb minden eleme elé hozzárakja a tömbbeli indexét!
    public void concatenateIndexToWord(String[] source) {
        int sourceLength = source.length;
        for (int i = 0; i < sourceLength; i++) {
            source[i] = i + source[i];
        }
    }

    //    Az osztály main() metódusában definiálj egy egész számokat és egy szavakat tartalmazó tömböt, amelyeken tesztelni tudod az előzőleg megírt metódusokat! Írd ki az elemeiket kétféleképpen: először elemenként külön sorba, majd végül egy sorba az elemeket, egymástól vesszővel és szóközzel elválasztva!
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5};
        String[] words = {"nulla", "egy", "kettő", "három", "négy"};

        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(numbers);
        arrayHandler.concatenateIndexToWord(words);

        for (int number : numbers) {
            System.out.println(number);
        }

        for (String word : words) {
            System.out.println(word);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (String word : words) {
            System.out.print(word + " ");
        }

    }

}
