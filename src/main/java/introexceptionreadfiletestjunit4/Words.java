package introexceptionreadfiletestjunit4;

/*
Gyakorlati feladat - Első A
        Készíts egy words.txt nevű fájlt a projekted teszt ágán, melybe több sorban írj bele tetszőlegesen szavakat, például így:

        alma
        körte
        Anna
        barack
        András
        szilva
        A Words osztályban legyen egy String getFirstWordWithA(Path path) metódus, mely olvassa be a fájl tartalmát (egy külön privát metódusba kiszervezve), majd adja vissza belőle az első A betűvel kezdődő szót! Ha nem talál ilyet a listában, akkor csak egy egyszerű A betűt adjon vissza!

        A WordsTest osztályban írd meg a teszteseteket is a metódus helyes és hibás működésének ellenőrzésére! Hozz létre egy másik fájlt, ami nem tartalmaz A betűvel kezdődő szót, és azzal is teszteld le a metódus működését!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String getFirstWordWithA(Path path) {
        List<String> words = readFile(path);

        for (String str : words) {
            if (str.startsWith("A")) {
                return str;
            }
        }
        return "A";
    }
}
