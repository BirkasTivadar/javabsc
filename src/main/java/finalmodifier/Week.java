package finalmodifier;

import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - A hét napjai
//        Definiálj egy finalmodifier.Week osztályt, mely List<String> típusú változóban tartalmazza a hét napjait! Használd az Arrays.asList() metódust!
//        Cseréld le a listában a keddet szerdára!

public class Week {

    public static void main(String[] args) {
        List<String> days = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
        System.out.println(days);

        days.set(1, "Szerda");
        System.out.println(days);
    }


}
