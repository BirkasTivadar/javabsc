package algorithmscount.transaction;

/*
Gyakorlati feladat - Kis összegű tranzakciók
        Hozz létre egy Transaction osztályt, a szükséges attribútumokkal:

        accountNumber, számlaszám
        transactionType (CREDIT vagy DEBIT, egy külön TransactionType enum)
        amount, a tranzakció összege
        Feladat egy metódus megírása a TransactionCounter osztályban, ami megszámlálja, hány olyan tranzakció van, amely credit és a paraméterként kapott összeghatárnál kisebb értékű. A metódus nevét megtudhatod a tesztesetből.
*/

public record Transaction(String accountNumber, TransactionType transactionType, int amount) {

    public boolean isCredit() {
        return transactionType == TransactionType.CREDIT;
    }

    public boolean isDebit() {
        return transactionType == TransactionType.DEBIT;
    }
}
