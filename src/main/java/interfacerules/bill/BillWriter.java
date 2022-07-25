/*
Ezután készíts egy BillWriter nevű interfészt, amelynek legyen egy String writeBill(List<String> billItems) absztrakt metódusa!
*/

package interfacerules.bill;

import java.util.List;

public interface BillWriter {

    String writeBill(List<String> billItems);
}
