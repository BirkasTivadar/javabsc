/*
A CommonAncestor osztály main() metódusában írd meg a következőket:
Hozz létre egy új üres listát, amely Object típusú elemeket képes tárolni!
Példányosíts egy Fruit típusú objektumot és tedd bele a listába!
Példányosíts egy Apple típusú objektumot és tedd bele a listába!
Példányosíts egy Starking típusú objektumot és tedd bele a listába!
Példányosíts egy Vegetable típusú objektumot és tedd bele a listába!
Tedd bele a listába azt, hogy "alma"!
Tedd bele a listába azt, hogy 12!
Tedd bele a listába azt, hogy 'x'
Példányosíts egy LocalDate típusú objektumot és tedd bele a listába!
Hozz létre egy új, egész számokat tartalmazó tömböt, és tedd bele a listába!
Készíts egy új, String típusú elemeket tartalmazó listát, és azt is tedd bele a listába!
Végül írd ki a lista tartalmát a konzolra! A megjelenő eredményből láthatod, hogy az előzőek közül mely osztályokban ven felülírva az Object osztályból örökölt toString() metódus, és melyekben nem.
*/


        package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        objects.add(new Fruit());
        objects.add(new Apple());
        objects.add(new Starking());
        objects.add(new Vegetable());
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        objects.add(LocalDate.of(2022,7,17));
        objects.add(new int[3]);
        objects.add(new ArrayList<>(Arrays.asList("hello", "cső", "szevasz")));

        System.out.println(objects);

    }
}
