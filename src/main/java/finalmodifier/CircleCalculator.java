package finalmodifier;

//Gyakorlati feladat - Kerület, terület, felszín és térfogat
//        Definiálj egy finalmodifier.CircleCalculator osztályt, melyben definiáld a Pi-t! Írj egy double calculatePerimeter(double r) metódust, ami a kerületet számolja ki, és egy double calculateArea(double r) metódust, ami a területet!
//        Írj egy finalmodifier.CylinderCalculator osztályt, melyben legyen egy calculateVolume(r, h) metódus, és egy calculateSurfaceArea(r, h) metódus, és használja a Pi értékét a CircleCalculator osztályból!
//        Készíts egy harmadik, finalmodifier.CylinderCalculatorBasedOnCircle osztályt is, melynek felépítése egyezzen meg a CylinderCalculator osztállyal, de metódusai ne a CircleCalculator PI értékét használják, hanem a metódusait!
//        Teszteld a finalmodifier.PiMain osztály main() metódusából az elkészült metódusokat!
//        Írd ki itt a Pi értékét is!

public class CircleCalculator {

    public static final double PI = 3.14159;

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }

    public double calculateArea(double r) {
        return r * r * PI;
    }
}
