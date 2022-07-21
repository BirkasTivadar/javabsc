/*
Autók
A Car osztályból öröklődik a Jeep osztály, egyes metódusokat felülírva és használva az ős attribútumait. Mindkét autótípus esetében van drive(int) metódus, ami a vezetést szimulálja, adott km megtételét és közben az elhasznált üzemanyaggal csökkenti annak mennyiségét is, valamint ki tudjuk számítani a tankolható üzemanyagot is (calculateRefillAmount()). A Jeep abban különbözik ősosztályától, hogy üzemanyagot nem csak a tankban, hanem kannákban is tud szállítani. Felhasználáskor mindig először a kannákat ürítjük ki, utána a tankban levő üzemanyag mennyisége csökken.
Készíts egy Car osztályt double fuelRate, double fuel, double tankCapacity attribútumokkal:
Konstruktor:
public Car(double fuelRate, double fuel, double tankCapacity)
Publikus metódusok:
public void modifyFuelAmount(double fuel)
public void drive(int km) // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
public double calculateRefillAmount() //kiszámolja, mennyit lehet tankolni

Készíts egy Jeep osztályt double extraCapacity és double extraFuel attribútumokkal:
Konstruktor:
public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel)
Publikus metódusok:
public void modifyFuelAmount(double fuel)
public void drive(int km) // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
public double calculateRefillAmount() //kiszámolja, mennyit lehet tankolni
Érdemes egy külön metódusba kiszervezni, hogy adott km megtételéhez van-e elegendő üzemanyagunk!
*/

package inheritancemethods.cars;

public class Car {

    private final double fuelRate;
    private double fuel;
    private final double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (tankCapacity < fuel) throw new IllegalArgumentException("Tank capacity is less than fuel!");
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        double fuelConsumption = km / 100.0 * fuelRate;
        if (fuelConsumption > fuel) throw new IllegalArgumentException("Not enough fuel available!");
        modifyFuelAmount(-fuelConsumption);
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

}
