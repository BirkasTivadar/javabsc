package arraylist;

import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - Keresztrejtvény
//Egy keresztrejtvény fejtése közben fontos szerepet kap a beírandó szavak hossza. A Crossword osztály main() metódusában hozd létre a következő szóhalmazból a rejtény beírandó szavait tartalmazó listát, majd válogasd ki belőlük a hatbetűseket és írd ki a konzolra őket! (A kettős betűk - cs, ly, sz, stb. - két betűnek számítanak, hiszen egy rejtvény négyzeteibe egyenként lehet beírni a betűket.)
//KULCS, KÁLYHA, LÓ, AJTÓ, CSERESZNYEFA, TEJ, FELHŐ, CIPŐ, MOSODA, KÁVÉTEJSZÍN, CITERA, BABA

public class Crossword {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        words.stream().filter(w -> w.length() == 6).forEach(System.out::println);
//        for (String word : words) {
//            if (word.length() == 6) {
//                System.out.println(word);
//            }
//        }
    }
}
