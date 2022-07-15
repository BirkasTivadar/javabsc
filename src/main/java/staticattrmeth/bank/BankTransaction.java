/*
Banki tranzakciók követése
        A BankTransaction osztály követi a létrehozott példányai által reprezentált banki tranzakciókat. Számolja a tranzakciókat, azok értékét összegzi, és utasításra átlagolja azokat. Minden tranzakció értékét megvizsgálja, és a nap elején beállított statikus currentMinValue és currentMaxValue változókban nyilvántartja az adott tranzakcióig előforduló minimális és maximális tranzakció értékeket.
        Attribútumok:
private static final long MIN_TRANSACTION_VALUE
private static final long MAX_TRANSACTION_VALUE
private static long countOfTransactions
private static long sumOfTransactions
private static long currentMinValue
private static long currentMaxValue
        Konstruktor:
public BankTransaction(long transactionValue)
        Publikus statikus metódusok:
public static void initTheDay()
public static long getAverageOfTransaction()
public static long getCurrentMinValue()
public static long getCurrentMaxValue()
public static long getSumOfTransactions()
        Publikus metódus:
public long getTransactionValue()
        Amennyiben a létrejövő BankTransaction objektum tranzakció értéke kívül esik a konstansként megadott min és max határokon (1 és 10 000 000), IllegalArgumentException-t várunk a megfelelő értesítő szöveggel. A megoldás készüljön fel arra az (egyébként nem túl valószínű) esetre is, ha egyetlen érvényes tranzakció sem volt. Ilyenkor az averageOfTransaction, a getCurrentMinValue és a getCurrentMaxValue metódusok nullát adjanak vissza! Több esetben jól alkalmazható a Java három operandusú művelete!
*/

        package staticattrmeth.bank;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        this.transactionValue = transactionValue;
        countOfTransactions++;
        sumOfTransactions += transactionValue;

        if (transactionValue < MIN_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("This transaction cannot be accepted! " + transactionValue);
        }
        if (transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("This transaction cannot be accepted! " + transactionValue);
        }

        if (currentMinValue == 0 || transactionValue < currentMinValue) currentMinValue = transactionValue;
        if (transactionValue > currentMaxValue) currentMaxValue = transactionValue;
    }

    public long getTransactionValue() {
        return transactionValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = 0;
        currentMaxValue = 0;
    }

    public static long getAverageOfTransaction() {
        return sumOfTransactions / countOfTransactions;
    }
}
