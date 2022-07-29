/*
Ülések száma
    Készíts a seats csomagban egy Seat interfészt, amelyben egyetlen metódus legyen: int getNumberOfSeats()! A metódusnak legyen egy alapértelmezett implementációja, adja vissza azt az értéket, hogy 5! Készíts ezenkívül három osztályt is:
        A FamilyCar csak implementálja az interfészt, mást nem kell írni az osztályba.
        A SportsCar implementálja az interfészt, és írja felül a metódust oly módon, hogy a metódus itt 2-t adjon vissza!
        A Car osztálynak pedig legyen egy String brand és egy int numberOfSeats attribútuma, a konstruktora pedig állítsa be ezek értékét! Az osztály implementálja az interfészt és írja felül annak metódusát úgy, hogy az a numberOfSeats attribútum értékét adja vissza!
    Írj tesztet is mindhárom implementáció tesztelésére a SeatTest osztályban!
*/

package interfacedefaultmethods.seats;

public interface Seat {

    default int getNumberOfSeats() {
        return 5;
    }
}
