package introexceptionwritefiletestjunit4;

/*
Gyakorlati feladat - Áramszünet
        Amikor az Elektromos Művek hálózatkarbantartást végez, ki szokott plakátolni egy listát, hogy a munkálatok miatt melyik napokon melyik utcákban nem lesz áram. A feladatod az lesz, hogy először az Electricity osztályban legyen egy külön metódus, mely létrehozza ezt a listát és beleteszi a megfelelő értékeket! Úgy nézzen ki a lista, hogy az elejére rakd a mai dátumot, utána az utcaneveket! Majd legyen az osztályban egy writeStreets(Path path) metódus, mely az egész listát kiírja a paraméterül kapott fájlba!

        Írj tesztet a metódus helyes működésének ellenőrzésére!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    private final List<String> streetList = new ArrayList<>(List.of(LocalDate.now().toString()));

    public List<String> getStreets() {
        return new ArrayList<>(streetList);
    }

    public void addStreets(List<String> streets) {
        streetList.addAll(streets);

    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, streetList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
