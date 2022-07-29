/*
A Car osztálynak pedig legyen egy String brand és egy int numberOfSeats attribútuma, a konstruktora pedig állítsa be ezek értékét! Az osztály implementálja az interfészt és írja felül annak metódusát úgy, hogy az a numberOfSeats attribútum értékét adja vissza!
*/

package interfacedefaultmethods.seats;

public class Car implements Seat {

    private String brand;
    private int numberOfSeats;

    public Car(String brand, int numberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
