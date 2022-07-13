package methodchain;
/*
Gyakorlati feladat - Szöcske
        Adott a következő matematika feladat:
        Egy szöcske ugrál a számegyenesen. Ugrálásainak hossza 1 egység. A számegyenesen a 0-t jelölő pontból a +3-at jelölő pontba 5 ugrással jutott el. Hányféleképpen tehette ezt meg? 5
        A Grasshopper osztályban modellezd az egyik lehetséges megoldást! Legyen az osztálynak egy int position attribútuma, valamint egy Grasshopper hopOnce(Direction direction) metódusa, amellyel a szöcske egy pozitív vagy negatív irányú ugrást tud tenni. A Direction egy enum legyen, POSITIVE és NEGATIVE értékekkel! Ezenkívül pedig legyen egy void moveFromZeroToThreeWithFiveHops() metódus is az osztályban, amely 5 ugrással eljuttatja a szöcskét a feladatkiírásban szereplő módon a +3-as pozícióra!
        Írd meg a teszteseteket is mindkét metódus működésének tesztelésére!
*/
public class Grasshopper {

    private int position;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce(Direction direction) {
        position += direction.getLength();
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        this.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE);
    }
}
