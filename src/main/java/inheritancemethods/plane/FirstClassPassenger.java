/*
Egy FirstClassPassenger is válogathat különféle szolgáltatások közül, mivel a PriorityPassenger osztály leszármazottja. Ezért a percent attribútum értékét itt is a konstruktorban kell megadni. Emellett van az osztálynak egy final int extraCharge = 20000 attribútuma, ami az első osztályon való utazás állandó összegű felára. Itt is felül kell írni a getPriceOfPlaneTicket() metódust úgy, hogy ne csak a megadott százalékkal emelje meg az alap jegyárat, hanem még adja is hozzá az extra felárat.
*/

package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger {

    private static final int EXTRA_CHARGE = 20000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket, percent);
    }

    public int getExtraCharge() {
        return EXTRA_CHARGE;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return super.getPriceOfPlaneTicket() + EXTRA_CHARGE;
    }

    @Override
    public String toString() {
        return "FirstClassPassenger{" + "name='" + getName() + '\'' +
                ", priceOfPlaneTicket=" + getPriceOfPlaneTicket() +
                ", percent=" + getPercent() +
                ", extraCharge=" + EXTRA_CHARGE +
                '}';
    }
}

