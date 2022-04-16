package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int i) {
        return (int) bankAccounts.stream().filter(bankAccount -> bankAccount.balance() > i).count();
    }
}
