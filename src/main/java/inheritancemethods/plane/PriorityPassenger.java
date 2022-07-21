/*
Egy PriorityPassenger különféle többletszolgáltatásokat is igénybe vehet, és ezek függvényében az alap jegyárat egy megadott százalékkal kell megemelni, hogy megkapjuk, mennyibe kerül az ő repülőjegye. Az osztály a Passenger leszármazottja, és egy final int percent attribútuma van, a többi attribútumát az ősétől örökli. A percent értékét a konstruktorban állítsd be! Felül kell írni az örökölt getPriceOfPlaneTicket() metódusát úgy, hogy az alap jegyárnak a megadott százalékkal megemelt összegét adja vissza.
*/

package inheritancemethods.plane;

public class PriorityPassenger extends Passenger {
    private final int percent;

    public PriorityPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return (int) (super.getPriceOfPlaneTicket() * (1 + percent / 100.0));
    }

    @Override
    public String toString() {
        return "PriorityPassenger{" + "name='" + getName() + '\'' +
                ", priceOfPlaneTicket=" + getPriceOfPlaneTicket() +
                ", percent=" + percent +
                '}';
    }
}
