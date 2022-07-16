/*
Bicikli apróhirdetés
        Az advertisement csomagba dolgozz!
        Hozz létre egy BikeAdvertisement osztályt, amely egy apróhirdetést reprezentál. Az apróhirdetés feladásakor megadható adatok a következők: rövid leírás, ár, extrák listája (List<String> típusú), márka, sorozatszám (String típusú).
        Biciklikről többféle módon lehet feladni apróhirdetést, az egyetlen közös az összesben, hogy meg kell adni egy rövid leírást és egy árat. Ezenkívül lehet olyan apróhirdetés, amelyben ezek mellé még meg van adva a bicikli márkája. Tovább lehet olyan is, ahol a leírás, az ár és a márka mellé még fel van sorolva pár extra is (pl. váltó, kormányra szerelhető kosár, stb.). Illetve, ha valaki esetleg egy nagyon komoly darabot szeretne eladni, megadhat minden adatot, tehát a sorozatszámot is az előzőekkel együtt.
        Összesen tehát 4 db konstruktor szükséges az osztályba, teleszkóp módon létrehozva.
*/

package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    private final String description;
    private final int price;
    private String brand;
    private List<String> extras;
    private String serialNumber;

    public BikeAdvertisement(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, int price, String brand) {
        this(description, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras) {
        this(description, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras, String serialNumber) {
        this(description, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
