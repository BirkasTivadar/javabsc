package introexceptionfinally;

/*
Gyakorlati feladat - Dr
        A Names osztályban olvass be egy fájlt, amely emberek neveit tartalmazza, és írd ki a konzolra a névsorból az első “dr” előtaggal rendelkező nevet! Ha nincs ilyen a listában, akkor üres Stringet írj ki! Írj a try-catch blokk végére finally blokkot is, és abban írd ki a konzolra, hogy End of reading.! Nézd meg, mi kerül a konzolra a következő tartalmú fájl esetén:

        Kiss József
        Nagy Béla
        dr. Horváth Lajos
        Gál Ferenc
        dr. József Vilmos
        Németh Elemér
        Nézd meg, mi kerül a konzolra a következő tartalmú fájl esetén:

        Kiss József
        Nagy Béla
        Gál Ferenc
        Németh Elemér
        És nézd meg, mi kerül a konzolra, ha nem található fájlnevet adsz meg!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        Names names = new Names();
        List<String> doctorNames;

        try {
//            doctorNames = Files.readAllLines(Path.of("src/main/resources/namesdr.txt"));
//            doctorNames = Files.readAllLines(Path.of("src/main/resources/namesnotdr.txt"));
            doctorNames = Files.readAllLines(Path.of("src/main/resources/namesnodr.txt"));
            names.printFirstNameWithDr(doctorNames);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        } finally {
            System.out.println("End of reading");
        }

    }

    private void printFirstNameWithDr(List<String> doctorNames) {
        for (String s : doctorNames) {
            if (s.startsWith("dr.")) {
                System.out.println(s);
                return;
            }
        }
        System.out.println();
    }


}
