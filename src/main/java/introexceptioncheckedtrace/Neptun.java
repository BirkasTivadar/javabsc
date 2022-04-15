package introexceptioncheckedtrace;

/*
Gyakorlati feladat - Neptun-kódok
        Készíts egy neptun.csv fájlt az alábbi tartalommal:

        Kiss József,GH4E6T
        Nagy Béla,Z765RD
        Németh Nóra,8G4LOK
        Szabó Dániel,34JGHF
        Horváth Gizella,LDT12O
        A Neptun osztályban olvasd be a fájlt és gyűjtsd ki belőle egy külön listába a Neptun-kódokat! A fájl beolvasását szervezd ki egy külön privát metódusba, de a kötelezően kezelendő IOException kivételt a main()-ben kezeld le! Végül írd is ki a lista tartalmát a konzolra!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Neptun {

    public List<String> readNeptunCodes() throws IOException {
        Path path = Path.of("src/main/resources/neptun.csv");
        return Files.readAllLines(path);
    }

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        List<String> neptunCodes = null;

        try {
            neptunCodes = neptun.readNeptunCodes();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println(neptunCodes);
    }
}
