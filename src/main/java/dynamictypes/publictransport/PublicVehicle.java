/*
Tömegközlekedés
A publictransport csomagban hozd létre a következő osztályokat:
PublicVehicle osztály, amelynek legyen egy int lineNumber és egy double length attribútuma, a hozzájuk tartozó getterekkel, valamint legyen egy konstruktor is, amely beállítja ezek értékét!
Bus osztály, amely a PublicVehicle leszármazottja, és van egy String brand attribútuma. Kell természetesen megfelelő konstruktor és getter is.
Tram osztály, amely szintén a PublicVehicle leszármazottja, és van egy int numberOfTramcars (kocsik darabszáma) attribútuma getter metódussal, valamint legyen konstruktor is!
Metro osztály. Ez is a PublicVehicle leszármazottja, és legyen egy int numberOfStations attribútuma, valamint konstruktora és getter metódusa!
PublicTransport osztály, amelynek legyen egy List<PublicVehicle> típusú attribútuma, a hozzátartozó getter metódussal és egy addVehicle(PublicVehicle vehicle) metódussal, amellyel új járművet adhatunk a listához.
PublicTransportTest osztály (természetesen a test ágon), amelyben legyen egy teszteset! Ebben először hozz létre PublicVehicle statikus típusú változókat, amelyeknek a dinamikus típusa az első esetben Bus, a második esetben Tram, a harmadik esetben pedig Metro legyen! Add hozzá a most létrehozott példányokat a PublicTransport listájához! Végül pedig írj assertet a lista hosszára vonatkozóan!
*/

package dynamictypes.publictransport;

public class PublicVehicle {
    private final int lineNumber;
    private final double length;

    public PublicVehicle(int lineNumber, double length) {
        this.lineNumber = lineNumber;
        this.length = length;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLength() {
        return length;
    }
}
