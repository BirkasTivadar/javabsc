package immutable;

/*
Gyakorlati feladat - Autó
        Hozd létre a Car osztályt, amelynek három attribútuma a márka, a típus és a gyártás éve! Legyen az osztály immutable!

        Hibakezelés: a példányosításkor nem fogadható el a márkánál null értékű vagy üres String, illetve a jelenleginél későbbi év, ilyen esetekben dobj IllegalArgumentException-t a tesztből kiolvasható tájékoztató szöveggel!
*/

import java.time.LocalDate;

public record Car(String brand, String model, int yearOfProduction) {
    public Car(String brand, String model, int yearOfProduction) {
        if (isEmpty(brand)) throw new IllegalArgumentException("Brand name cannot be empty!");
        this.brand = brand;

        this.model = model;
        if (yearOfProduction > LocalDate.now().getYear())
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        this.yearOfProduction = yearOfProduction;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
