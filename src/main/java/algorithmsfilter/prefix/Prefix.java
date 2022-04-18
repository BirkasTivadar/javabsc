package algorithmsfilter.prefix;

/*
Gyakorlati feladat - Előtag
        Írj egy prefix.Prefix osztályt, melyben a getWordsStartWith(List<String> words, String prefix) metódus feladata a kapott listából a megadott előtaggal kezdődőeket kiválogatni és egy listában visszaadni.
*/

import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String ki) {
        return words.stream().filter(w -> w.startsWith(ki)).toList();
//        List<String> result = new ArrayList<>();
//        for (String word : words) {
//            if (word.startsWith(ki)) result.add(word);
//        }
//        return result;
    }
}
