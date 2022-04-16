package introexceptionwritefiletestjunit5;

/*
Gyakorlati feladat - Kötelező olvasmányok
        Az iskolai kötelező olvasmányok listája a könyvtári nyilvántartás szerint a következőképpen néz ki:

        G 25;Egri csillagok;Gárdonyi Géza
        M 79;Pál utcai fiúk;Molnár Ferenc
        F 37;Tüskevár;Fekete István
        J 68;Kőszívű ember fiai;Jókai Mór
        Hozz létre a projekted teszt ágán egy books.txt fájlt, amibe másold bele ezt a könyvtári listát! Ezután a Books osztályban olvasd be ennek a fájlnak a tartalmát, hozz létre belőle egy jobban olvasható listát, végül írd ki az egészet fájlba! Például egy ilyen lista jobban olvasható:

        Gárdonyi Géza: Egri csillagok
        Molnár Ferenc: Pál utcai fiúk
        Fekete István: Tüskevár
        Jókai Mór: Kőszívű ember fiai
        Írj tesztet a metódus helyes működésének ellenőrzésére!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> books = new ArrayList<>();

    public void readBooks() {
        Path path = Path.of("src/test/resources/books.txt");
        try {
            books = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<String> getBookList() {
        List<String> result = new ArrayList<>();

        for (String s : books) {
            String[] bookArr = s.split(";");
            result.add(bookArr[2] + ": " + bookArr[1]);
        }
        return result;
    }

    public void writeBooks(Path path) {
        try {
            Files.write(path, getBookList());
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
