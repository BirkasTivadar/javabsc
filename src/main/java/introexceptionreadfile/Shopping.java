package introexceptionreadfile;

/*
Gyakorlati feladat - Bevásárlólista
        Hozd létre a shoppinglist.txt fájlt, amelynek a következő legyen a tartalma:

        kenyér
        tej
        felvágott
        sajt
        fogkrém
        szalvéta
        csoki a gyerekeknek
        valami üdítő
        tejföl
        A Shopping osztályban olvasd be a lista tartalmát, majd írd ki a konzolra!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/shoppinglist.txt");
        List<String> shoppingList = null;

        try {
            shoppingList = Files.readAllLines(path);
        } catch (IOException ioException) {
            System.out.println("File can not read");
        }

        System.out.println(shoppingList);
    }

}


