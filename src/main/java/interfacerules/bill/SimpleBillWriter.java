/*
Készíts egy SimpleBillWriter osztályt, mely implementálja a BillWriter interfészt, és úgy valósítja meg annak a metódusát, hogy az a paraméterül kapott lista alapján a következő formában adja vissza a számla tételeit:
        kenyér, 1 * 400 = 400 Ft
        tej, 2 * 300 = 600 Ft
        tejföl, 2 * 180 = 360 Ft
        fogkefe, 5 * 200 = 1000 Ft
*/

package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder result = new StringBuilder();
        for (String str : billItems) {
            String[] strArr = str.split(";");
            String productName = strArr[0];
            int price = Integer.parseInt(strArr[1]);
            int amount = Integer.parseInt(strArr[2]);
            result.append(String.format("%s, %d * %d = %d Ft\n", productName, amount, price, price * amount));
        }
        return result.toString();
    }


}
