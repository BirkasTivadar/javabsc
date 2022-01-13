package aslist;

import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - Lakatlan sziget
//        Ha csak 3 dolgot vihetnél magaddal egy lakatlan szigetre, melyik lenne az a három? Jól gondold meg a választ, majd az Island nevű osztály main() metódusában létrehozott List<String> importantThings listában tárold is el őket! A lista ne legyen bővíthető, hiszen csak három dolgot vihetsz magaddal. Ezután először írd ki ezeket a dolgokat a konzolra, majd implementáld azt, hogy mégis meggondoltad magad és egy dolgot lecserélsz a három közül! Végül írd is ki a konzolra a végleges döntésed eredményét!

public class Island {

    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Puska", "Könyv", "Gyufa");

        System.out.println(importantThings);

        importantThings.set(1, "Fejsze");
        System.out.println(importantThings);
    }
}
