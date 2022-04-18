package recursion;

/*
Gyakorlati feladat - Magánhangzók
        A Vowels osztályban írj egy getNumberOfVowels(String word) metódust, amely visszaadja, hány magánhangzó van a paraméterként átadott szóban! Írd meg a feladatot rekurzióval! (A megoldás menete: Meg kell vizsgálni, hogy a szó első betűje magánhangzó-e, és ez esetben 1-et visszaadni, ellenkező esetben 0-t. Majd meg kell vizsgálni ugyanezt arra a szóra, amelyet az eredeti szó első betűjének törlésével kapunk, tehát újra kell hívni a metódust az egy betűvel rövidebb szóval.
*/

public class Vowels {
    public int getNumberOfVowels(String word) {
        String vowels = "aáeéiíoóöőuúüű";
        if (word.length() == 0) return 0;

        return vowels.contains(String.valueOf(word.charAt(0))) ? 1 + getNumberOfVowels(word.substring(1)) : getNumberOfVowels(word.substring(1));

//        if (vowels.contains(String.valueOf(word.charAt(0)))) {
//            return 1 + getNumberOfVowels(word.substring(1));
//        } else {
//            return getNumberOfVowels(word.substring(1));
//        }

    }
}
