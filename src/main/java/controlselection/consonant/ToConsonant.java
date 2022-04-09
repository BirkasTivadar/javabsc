package controlselection.consonant;

import java.util.List;

//Gyakorlati feladat - Magánhangzó
//        Írj egy metódust, mely kap egy karakter paramétert! Amennyiben magánhangzót kap, a következő mássalhangzót adja vissza! Ha mássalhangzót kap, akkor a mássalhangzót adja vissza! Elég, ha az angol ábécé karaktereivel működik.
//        A controlselection.consonant.ToConsonant osztályba dolgozz!

public class ToConsonant {

    public char convertToConsonant(char c) {
        List<Character> consonants = List.of('a', 'e', 'i', 'o', 'u');
        return consonants.contains(c) ? (char) (c + 1) : c;
    }

//    training360 megoldás, jobb mert nem kell List-et használni:
//public class ToConsonant {
//
//    public static final String VOWELS = "aeiou";
//
//    public char convertToConsonant(char c) {
//        if (VOWELS.indexOf(c) >= 0) {
//            return (char) (c + 1);
//        }
//        else {
//            return c;
//        }
//    }
}
