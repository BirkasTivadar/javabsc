package algorithmssum.sales;

/*
Gyakorlati feladat - Értékesítők számai
        Hozz létre egy Salesperson osztályt a szükséges attribútumokkal:

        name, az értékesítő kolléga neve
        amount, az üzletkötéseiből származó árbevétel
        A feladat egy metódus megírása a SalesAmountSumCalculator osztályban, ami paraméterül kapja a cég értékesítőit tartalmazó listát, és összegzi a cég összes értékesítőjének árbevételét. A metódus pontos nevét megtalálod a tesztesetben.
*/
public class Salesperson {

    private final String name;
    private final int amount;

    public Salesperson(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
