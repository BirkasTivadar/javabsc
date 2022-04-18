package algorithmstransformation.letters;

/*
Gyakorlati feladat - Első két betű
        Írj egy letters.TwoLetters osztályt, amelyben a getFirstTwoLetters(List<String) metódus feladata visszaadni egy olyan listát, amelyben az eredeti lista által tartalmazott szavak első két betűjéből álló Stringek szerepelnek (ugyanolyan sorrendben, ahogyan az eredeti szavak az eredeti listában)!
*/

import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> words) {
        return words.stream().map(w -> w.substring(0, 2)).toList();
//        List<String> result = new ArrayList<>();
//        for (String word : words) {
//            result.add(word.substring(0, 2));
//        }
//        return result;
    }
}
