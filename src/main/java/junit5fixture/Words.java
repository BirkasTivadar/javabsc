package junit5fixture;

import java.util.ArrayList;
import java.util.List;

//Gyakorlati feladat - Szavak listája
//        A Words osztályban legyen egy List<String> words attribútum, melyet példányosíts is le üres listaként! Készíts hozzá getter metódust és egy addWord(String word) metódust, amellyel új szavakat lehet a listához adni! Legyen ezenkívül még két metódus az osztályban:
//        void removeWordsWithoutLetter(String letter): Ez a metódus törölje ki az eredeti listából azokat a szavakat, amelyekben nem található meg a paraméterként átadott betű!
//        void removeWordsWithOtherLength(int length): Ez a metódus törölje ki az eredeti listából azokat a szavakat, amelyek nem a paraméterként megadott hosszúságúak!
//        Ezután hozd létre a WordsTest osztályt! Ebben legyen egy Words words attribútum, amelyet egy @BeforeEach annotációval ellátott metóduson belül példányosíts! Ugyanitt töltsd föl a listát tetszőleges szavakkal! Figyelj arra, hogy legyen a tesztelés céljából megadott szavak között néhány ugyanolyan hosszúságú és néhány ugyanolyan betűt tartalmazó is, mint amit majd a metódusoknak paraméterként át akarsz adni. Készíts két tesztmetódust:
//        void testRemoveWordsWithoutLetter(): ebben a tesztmetódusban példányosíts egy olyan listát, amelyben csak azok a szavak szerepelnek, amelyek a removeWordsWithoutLetter() metódus lefutása után benne kell, hogy maradjanak az eredeti listában! Majd hívd meg a removeWordsWithoutLetter() metódust egy megfelelő paraméterrel, végül hasonlítsd össze az elvárt értékeket tartalmazó listát a words attribútum listájával!
//        void testRemoveWordsWithOtherLength(): ebben a tesztmetódusban is először példányosíts egy olyan listát, amelyben csak azok a szavak szerepelnek, amelyek a removeWordsWithOtherLength() metódus lefutása után benne kell, hogy maradjanak az eredeti listában! Majd hívd meg a removeWordsWithOtherLength() metódust egy megfelelő paraméterrel, végül itt is hasonlítsd össze az elvárt értékeket tartalmazó listát a words attribútum listájával!

public class Words {

    private final List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return new ArrayList<>(words);
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void removeWordsWithoutLetter(String letter) {
        List<String> removeWords = new ArrayList<>();
        for (String word : words) {
            if (word.contains(letter)) {
                removeWords.add(word);
            }
        }
        words.removeAll(removeWords);
    }

    public void removeWordsWithOtherLength(int length) {
        List<String> removeWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() != length) {
                removeWords.add(word);
            }
        }
        words.removeAll(removeWords);
    }
}
