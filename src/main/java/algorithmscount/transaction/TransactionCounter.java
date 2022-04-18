package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int i) {
        return (int) transactions.stream().filter(Transaction::isCredit).filter(transaction -> transaction.amount() < i).count();
    }
}
