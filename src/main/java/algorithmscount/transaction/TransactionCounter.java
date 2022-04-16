package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int i) {
        return (int) transactions.stream().filter(transaction -> transaction.isCredit()).filter(transaction -> transaction.amount() < i).count();
    }
}
