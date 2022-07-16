/*
Hitelkártya használat
        A CreditCard osztály egy hitelkártyát reprezentál, amelyet a létrehozásakor adott összeggel “feltöltenek” és ebből tudunk gazdálkodni. A feltöltés forintban vagy tetszőleges valutában történhet, ezt a feltöltés során forintra konvertálja a rendszer.
        A kiadás payment() többféle valutában is lehetséges, ezeket a rendszer egész forintra konvertálja és így terheli meg a kártyát. Ha nem adunk meg valutát, automatikusan forintnak veszi a terhelést.
        A hitelkártya “használatba vételekor” (CreditCard osztály betöltése) az aktuális átváltási faktorok (Rate) feltöltésre kerülnek a CreditCard osztályba, egy static final listába (statikus inicializálás).
        Konstruktorok:
public CreditCard(long balance, Currency currency)
public CreditCard(long balance)
        Publikus metódusok:
public long getBalance()
public boolean payment(long amount, Currency currency)
public boolean payment(long amount)
        A Rate osztály az egyes valutákhoz (Currency enum) tartozó átváltási faktorokat tárolja, ezek listájából dolgozik a payment() metódus. Hozzuk létre a Currency enum-ot is HUF, EUR, CHF, GBP, USD értékekkel!
        Konstruktor:
public Rate(Currency currency, double conversionFactor)
        Publikus metódusok:
public Currency getCurrency()
public double getConversionFactor()
*/

package initializer;

import java.util.Arrays;
import java.util.List;

public class CreditCard {

    private static final List<Rate> rates;

    static {
        rates = Arrays.asList(new Rate(Currency.HUF, 1.0),
                new Rate(Currency.EUR, 308.23),
                new Rate(Currency.CHF, 289.24),
                new Rate(Currency.GBP, 362.23),
                new Rate(Currency.USD, 289.77));
    }
    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        for (Rate rate : rates) {
            if (rate.currency() == currency) {
                this.balance = (long) (balance * rate.coefficient());
            }
        }
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = getInForints(balance, currency);
    }
    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }
    private long getInForints(long amount, Currency currency) {
        for (Rate rate : rates) {
            if (rate.currency() == currency) {
                return (long) (amount * rate.coefficient());
            }
        }
        throw new IllegalArgumentException("Wrong currency");
    }
    public boolean payment(long amount, Currency currency) {
        long debit = getInForints(amount, currency);
        if (debit < balance) {
            balance -= debit;
            return true;
        }
        return false;
    }
    public boolean payment(long amount) {
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
