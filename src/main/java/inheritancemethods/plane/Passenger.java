/*
Repülőjegyek
A létrehozott osztályokat a plane csomagba tedd!
Egy légitársaságnál a repülőjáratokra háromféle jegyet lehet váltani.
Egy Passenger az alap jegyárat fizeti, az osztálynak két attribútuma van: String name és int priceOfPlaneTicket.
Egy PriorityPassenger különféle többletszolgáltatásokat is igénybe vehet, és ezek függvényében az alap jegyárat egy megadott százalékkal kell megemelni, hogy megkapjuk, mennyibe kerül az ő repülőjegye. Az osztály a Passenger leszármazottja, és egy final int percent attribútuma van, a többi attribútumát az ősétől örökli. A percent értékét a konstruktorban állítsd be! Felül kell írni az örökölt getPriceOfPlaneTicket() metódusát úgy, hogy az alap jegyárnak a megadott százalékkal megemelt összegét adja vissza.
Egy FirstClassPassenger is válogathat különféle szolgáltatások közül, mivel a PriorityPassenger osztály leszármazottja. Ezért a percent attribútum értékét itt is a konstruktorban kell megadni. Emellett van az osztálynak egy final int extraCharge = 20000 attribútuma, ami az első osztályon való utazás állandó összegű felára. Itt is felül kell írni a getPriceOfPlaneTicket() metódust úgy, hogy ne csak a megadott százalékkal emelje meg az alap jegyárat, hanem még adja is hozzá az extra felárat.
Végül hozz létre egy Plane osztályt, amelynek main() metódusában példányosíts egy Passenger-t, egy PriorityPassenger-t és egy FirstClassPassenger-t, majd írd ki a konzolra az attribútumaik értékét!
*/

package inheritancemethods.plane;

public class Passenger {
    private final String name;
    private final int priceOfPlaneTicket;

    public Passenger(String name, int priceOfPlaneTicket) {
        this.name = name;
        this.priceOfPlaneTicket = priceOfPlaneTicket;
    }

    public String getName() {
        return name;
    }

    public int getPriceOfPlaneTicket() {
        return priceOfPlaneTicket;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", priceOfPlaneTicket=" + priceOfPlaneTicket +
                '}';
    }
}
