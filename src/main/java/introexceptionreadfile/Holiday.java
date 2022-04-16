package introexceptionreadfile;

/*
Gyakorlati feladat - Nyaralási lista
        Hozd létre a holiday.txt fájlt, amelynek a következő legyen a tartalma:

        ruhák
        piperecucc
        fogkefe
        sátor
        matracok
        hálózsákok
        kempingasztal és székek
        autó papírjai
        család iratai
        A Holiday osztályban olvasd be a lista tartalmát, majd írd ki a konzolra!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/holiday.txt");
        List<String> holiday = null;
        try {
            holiday = Files.readAllLines(path);
        } catch (IOException ioException) {
            System.out.println("Can not read file");
        }

        System.out.println(holiday);
    }
}
