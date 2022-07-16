/*
Bus osztály, amely a PublicVehicle leszármazottja, és van egy String brand attribútuma. Kell természetesen megfelelő konstruktor és getter is.
*/

package dynamictypes.publictransport;

public class Bus extends PublicVehicle {
    private final String brand;

    public Bus(int lineNumber, double length, String brand) {
        super(lineNumber, length);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
