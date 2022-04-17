package algorithmsmax.sales;

/*
Gyakorlati feladat - Legjobb értékesítő
        Hozz létre egy sales.Salesperson osztályt a szükséges attribútumokkal:

        name, az értékesítő kolléga neve
        amount, az üzletkötéseiből származó árbevétel
        target, a cél árbevétel, amit az adott értékesítő számára előírt az értékesítési igazgató
*/


public record Salesperson(String name, int amount, int target) {

    public int getDifferenceFromTarget() {
        return amount - target;
    }
}
