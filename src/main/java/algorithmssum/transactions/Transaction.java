package algorithmssum.transactions;

/*
Gyakorlati feladat - Összes jóváírás
        Hozz létre egy Transaction osztályt a szükséges attribútumokkal:

        accountNumber, számlaszám
        transactionOperation (TransactionOperation enum, CREDIT vagy DEBIT)
        amount, a tranzakció összege
        Hozz létre egy TransactionSumCalculator osztályt, amelyben van egy int sumAmountOfCreditEntries(List<Transaction> transactions) metódus, amely összegzi a credit tranzakciók összegét.
*/

public record Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {

    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }
}
