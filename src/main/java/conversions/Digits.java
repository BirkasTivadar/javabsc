package conversions;

//Gyakorlati feladat - Számjegyek kiválogatása
//        A Digits osztálynak legyen egy List<Integer> típusú attribútuma, amelyet példányosíts! Legyen hozzá getter metódus, valamint készíts egy addDigitsToList(String text) metódust, amely a paraméterül kapott, bármilyen karaktereket tartalmazó szövegből kiválogatja a számjegyeket és a listához adja! Az osztály main() metódusában teszteld a metódus működését!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
    private List<Integer> digits;

    public Digits(List<Integer> digits) {
        this.digits = new ArrayList<>(digits);
    }

    public List<Integer> getDigits() {
        return new ArrayList<>(digits);
    }

    public void addDigitsToList(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c - 48);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Digits digits = new Digits(numbers);
        System.out.println(digits.getDigits());

        digits.addDigitsToList("hell5 76 ok3zsok9");
        System.out.println(digits.getDigits());

    }
}
