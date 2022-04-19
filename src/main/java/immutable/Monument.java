package immutable;

/*
Gyakorlati feladat - Műemlék
        Hozd létre a Monument osztályt, amelynek négy attribútuma a megnevezése, a címe, a nyilvántartásba vétel dátuma és a nyilvántartásba vételi szám! Legyen az osztály immutable!

        Hibakezelés: a példányosításkor nem fogadható el semelyik adatnál null értékű vagy üres String, ilyen esetekben dobj IllegalArgumentException-t a tesztből kiolvasható tájékoztató szöveggel! Végezd ezeket a validációkat egy külön private boolean isEmpty(String text) metódus segítségével!
*/

import java.time.LocalDate;

public record Monument(String name, String address, LocalDate dateOfRegistry, String registryNumber) {
    public Monument {
        if (isEmpty(name) || isEmpty(address) || isEmpty(registryNumber))
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
    }

    private boolean isEmpty(String text) {
        return text == null || text.isBlank();
    }
}
