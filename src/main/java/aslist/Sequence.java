package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - Számsorozat
//        Készíts egy Sequence nevű osztályt, amelynek main() metódusában példányosíts le egy List<Integer> elements listát oly módon, hogy már eleve legyen benne két tetszőleges szám, de legyen lehetőség arra, hogy továbbiakat is hozzáadhass! Ciklusban adj néhány új elemet a listához úgy, hogy minden következő elem a sorban előtte lévő két szám szorzata legyen!
//        Ha például a példányosított lista kezdeti elemei a következők: [1, 2], akkor öt új elem hozzáadása után a listának a következőket kell tartalmaznia: [1, 2, 2, 4, 8, 32, 256].
//        Végül írd ki a konzolra a lista tartalmát és a méretét is!

public class Sequence {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));

        for (int i = 0; i < 5; i++) {
            int number = elements.get(i) * elements.get(i + 1);
            elements.add(number);
        }

        System.out.println(elements);
        System.out.println(elements.size());
    }
}
