/*
Majd készíts egy ComplexBillWriter osztályt, mely implementálja a BillWriter interfészt, és úgy valósítja meg annak a metódusát, hogy az a paraméterül kapott lista alapján a következő formában adja vissza a számla tételeit:
        kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft
        tej; darabszám: 2, egységár: 300, összesen: 600 Ft
        tejföl; darabszám: 2, egységár: 180, összesen: 360 Ft
        fogkefe; darabszám: 5, egységár: 200, összesen: 1000 Ft
*/

package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        String result = "";
        for (String str : billItems) {
            String[] strArr = str.split(";");
            String productName = strArr[0];
            int price = Integer.parseInt(strArr[1]);
            int amount = Integer.parseInt(strArr[2]);
            result += String.format("%s; darabszám: %d, egységár: %d, összesen: %d Ft\n", productName, amount, price, price * amount);
        }
        return result;
    }
}

