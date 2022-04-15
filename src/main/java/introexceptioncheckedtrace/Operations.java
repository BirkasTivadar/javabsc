package introexceptioncheckedtrace;

/*
Gyakorlati feladat - Metrókocsik
        Egy tömegközlekedési vállalatnál minden napra elkészítik a beosztást, hogy aznapra mely metrókocsiknak kell üzemkésznek lenniük. Hozz létre egy underground.txt fájlt a következő tartalommal:

        20134
        31023
        41112
        25110
        41002
        25630
        23450
        35320
        24567
        Készíts egy Operations osztályt, amelyben legyen két metódus! A List<String> readFile() beolvassa ennek a fájlnak a tartalmát, de a kötelezően kezelendő kivételt nem kezeli, csak továbbengedi. A String getDailySchedule(List<String>) metódus pedig megkapja az előző metódus által visszaadott listát, amelyből kiválogatja a 2-essel kezdődő kocsiszámokat, összerakja őket egy szövegbe és így adja vissza! A visszaadott String elejére tegye oda az aktuális napi dátumot is!

        Az Underground osztály main() metódusában hívd meg ezeket a metódusokat, a kötelezően kezelendő kivételt is itt kezeld le! Végül pedig írd ki a konzolra a mai napi beosztást, amelyet a metódus szöveges formában ad vissza! Ez a következőhöz hasonló módon nézzen ki:

        2021-10-07, 20134 25110 25630 23450 24567
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {
        Path path = Path.of("src/main/resources/underground.txt");
        return Files.readAllLines(path);
    }

    public String getDailySchedule(List<String> wagonNumbers) {
        StringBuilder str = new StringBuilder(LocalDate.now().toString()).append(", ");
        for (String s : wagonNumbers) {
            if (s.startsWith("2")) {
                str.append(s).append(" ");
            }
        }
        return str.toString();
    }
}
