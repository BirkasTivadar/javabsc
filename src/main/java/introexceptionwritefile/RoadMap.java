package introexceptionwritefile;

/*
Gyakorlati feladat - Itiner
        A RoadMap osztályban hozz létre egy listát, amelyben fel van sorolva, hogy a lakóhelyedtől egy általad választott úticélig milyen nevű településeket kell érintened útközben! Végül ezt a listát írd ki a roadmap.txt nevű fájlba a projekted gyökérkönyvtárába!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> villages = List.of("Győrújfalu", "Győrzámoly", "Győrladamér", "Dunaszeg", "Dunaszentpál");

        try {
            Files.write(Path.of("src/main/resources/roadmap.txt"), villages);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
