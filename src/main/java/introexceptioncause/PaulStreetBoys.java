package introexceptioncause;

/*
Gyakorlati feladat - Nemecsek
        Készíts egy palutcaifiuk.txt nevű fájlt, és helyezd el benne a következő neveket:

        Boka János
        Geréb Dezső
        Nemecsek Ernő
        Csele
        Csónakos
        Kolnay
        Barabás
        Weisz
        Folytathatod még a sort, ha tudod.

        A PaulStreetBoys osztályban olvasd be a fájl tartalmát és írd ki a konzolra a neveket! Nemecsek neve szerepeljen a konzolon csupa kisbetűvel!

        A fájlbeolvasást és a kiírást is szervezd ki külön metódusba az osztályon belül!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readNames() {
        Path path = Path.of("src/main/resources/palutcaifiuk.txt");
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void printNames(List<String> names) {
        for (String s : names) {
            if (s.equals("Nemecsek Ernő")) {
                System.out.println(s.toLowerCase());
            } else {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        List<String> names = null;
        try {
            names = paulStreetBoys.readNames();
        } catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }

        if (names != null) {
            paulStreetBoys.printNames(names);
        }
    }
}
