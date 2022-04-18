package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
       return transactions.stream().filter(Transaction::isCredit).mapToInt(Transaction::amount).sum();
    }
}
