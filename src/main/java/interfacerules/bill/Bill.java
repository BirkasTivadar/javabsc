/*
Kétféle módon kiírt számlák
    Hozz létre egy billitems.txt nevű fájlt a teszt ágon, a következő tartalommal:
        kenyér;400;1
        tej;300;2
        tejföl;180;2
        fogkefe;200;5
    Készíts egy bill.Bill osztályt, melynek List<String> readBillItemsFromFile(Path path) metódusa beolvassa a fájl tartalmát! Ezután készíts egy BillWriter nevű interfészt, amelynek legyen egy String writeBill(List<String> billItems) absztrakt metódusa!
    Készíts egy SimpleBillWriter osztályt, mely implementálja a BillWriter interfészt, és úgy valósítja meg annak a metódusát, hogy az a paraméterül kapott lista alapján a következő formában adja vissza a számla tételeit:
        kenyér, 1 * 400 = 400 Ft
        tej, 2 * 300 = 600 Ft
        tejföl, 2 * 180 = 360 Ft
        fogkefe, 5 * 200 = 1000 Ft
    Majd készíts egy ComplexBillWriter osztályt, mely implementálja a BillWriter interfészt, és úgy valósítja meg annak a metódusát, hogy az a paraméterül kapott lista alapján a következő formában adja vissza a számla tételeit:
        kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft
        tej; darabszám: 2, egységár: 300, összesen: 600 Ft
        tejföl; darabszám: 2, egységár: 180, összesen: 360 Ft
        fogkefe; darabszám: 5, egységár: 200, összesen: 1000 Ft
*/

package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path){
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
