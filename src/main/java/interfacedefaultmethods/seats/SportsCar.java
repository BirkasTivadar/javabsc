/*
A SportsCar implementálja az interfészt, és írja felül a metódust oly módon, hogy a metódus itt 2-t adjon vissza!
*/

package interfacedefaultmethods.seats;

public class SportsCar implements Seat {

    @Override
    public int getNumberOfSeats() {
        return 2;
    }
}
