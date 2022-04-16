package introexceptioncause;

/*
Gyakorlati feladat - Emelkedések és süllyedések
        Készíts egy tracking.csv fájlt, amelyben egy túrázás adatai vannak eltárolva. Ehhez másold bele a következő adatokat:

        47.497913;19.040236;400
        47.497912;19.040232;420
        47.497916;19.040236;410
        47.497915;19.040237;415
        47.497921;19.040232;420
        47.497922;19.040236;423
        47.497925;19.040236;418
        47.497931;19.040237;422
        47.497933;19.040238;425
        Itt GPS-koordinátákat látsz, valamint a hozzájuk tartozó magassági adatokat.

        Olvasd be a fájl tartalmát, majd írd ki a konzolra, hogy egyik pontról a másikra gyalogolva hány métert emelkedett vagy süllyedt a túrázó!

        A következő kiírást kell tehát megvalósítanod:

        20
        -10
        5
        5
        3
        -5
        4
        3
        Minden egyes műveletet szervezz ki külön metódusokba a TrackPoints osztályban, de ezeket a metódusokat a Tracking osztály main() metódusából hívd meg!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TrackPoints {

    public List<String> readGPS() {
        Path path = Path.of("src/main/resources/tracking.csv");
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void printDifferentsOfAltitude(List<String> coordinates) {
        int previousAltitude = Integer.parseInt(coordinates.get(0).split(";")[2]);

        for (int i = 1; i < coordinates.size(); i++) {
            int actualAltitude = Integer.parseInt(coordinates.get(i).split(";")[2]);
            System.out.println(actualAltitude - previousAltitude);
            previousAltitude = actualAltitude;
        }
    }

}
