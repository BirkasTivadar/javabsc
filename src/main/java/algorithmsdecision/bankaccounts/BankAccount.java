package algorithmsdecision.bankaccounts;

/*
Gyakorlati feladat - Nagy összegű bankszámlák
        Hozz létre egy bankaccounts.BankAccount osztályt a szükséges attribútumokkal:

        nameOfOwner, a számla tulajdonosának neve
        accountNumber, a számlaszám
        balance, egyenleg
        Legyen az osztálynak withdraw és deposit metódusa paraméterként kapott összeg levételére ill. betételére a számlára.

        Feladat egy containsBalanceGreaterThan(List<BankAccount> accounts, int min) metódus megírása a BankAccountDecisionMaker osztályban, ami eldönti, van-e olyan számla, amelynek az aktuális egyenlege meghaladja a paraméterként kapott alsó határt.
*/

public class BankAccount {
    private final String nameOfOwner;
    private final String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }
}
