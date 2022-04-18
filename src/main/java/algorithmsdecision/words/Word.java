package algorithmsdecision.words;

/*
Gyakorlati feladat - “Nagy” szavak
        Hozz létre egy words.Word osztályt és benne egy containsLongerWord(List<String>, String) metódust, amely kap egy szavakat tartalmazó listát és egy újabb szót. A metódusnak el kell döntenie, hogy található-e a listában a paraméterként megadottnál hosszabb szó.
*/

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String barack) {
        int length = barack.length();
        return words.stream().anyMatch(w -> w.length() > length);
//        for (String s : words) {
//            if (s.length() > length) return true;
//        }
//        return false;
    }
}

