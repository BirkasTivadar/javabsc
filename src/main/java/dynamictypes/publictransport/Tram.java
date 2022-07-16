/*
Tram osztály, amely szintén a PublicVehicle leszármazottja, és van egy int numberOfTramcars (kocsik darabszáma) attribútuma getter metódussal, valamint legyen konstruktor is!
*/

package dynamictypes.publictransport;

public class Tram extends PublicVehicle {
    private final int numberOfTramcars;

    public Tram(int lineNumber, double length, int numberOfTramcars) {
        super(lineNumber, length);
        this.numberOfTramcars = numberOfTramcars;
    }

    public int getNumberOfTramcars() {
        return numberOfTramcars;
    }
}
