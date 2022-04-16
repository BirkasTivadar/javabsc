package algorithmssum.transactions;

/*
Gyakorlati feladat - Összes jóváírás
        Hozz létre egy Transaction osztályt a szükséges attribútumokkal:

        accountNumber, számlaszám
        transactionOperation (TransactionOperation enum, CREDIT vagy DEBIT)
        amount, a tranzakció összege
        Hozz létre egy TransactionSumCalculator osztályt, amelyben van egy int sumAmountOfCreditEntries(List<Transaction> transactions) metódus, amely összegzi a credit tranzakciók összegét.
*/

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }
}
