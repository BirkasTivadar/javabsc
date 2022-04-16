package introexceptioncause;

/*
Gyakorlati feladat - Első betűk
        Készíts egy poem.txt fájlt és másold bele a következő verset:

        Lassan hull alá, csillan a fényben,
        Eltévedt levél rezesen ragyog,
        Vörös-selymét teríti a szélben,
        Életre kelve szállnak a dalok.
        Lombot hullatnak az erdő fái,
        Keringenek aranyló ruhában,
        Egy porszemnyi lét semmivé válik,
        Reszketeg árnyak futnak utánam.
        Itt, hol a csendben ringat az álom,
        Nesztelen táncuk új jövőt ígér,
        Gomolygó köd ül a néma tájon,
        Őszi avaron elmúlás kísért.
        (Ez egy laikus költő, Kristófné Vidók Margit: Őszi tánc című verse.)

        A Poem osztályban olvasd be a fájl tartalmát és írd ki a konzolra egymás mellé minden sor első betűjét!
*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Poem {

    public List<String> linesOfPoem() {
        Path path = Path.of("src/main/resources/poem.txt");
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String getFistCharacter(List<String> poemLines) {
        StringBuilder sb = new StringBuilder();
        for (String s : poemLines) {
            sb.append(s.charAt(0)).append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Poem poem = new Poem();
        List<String> poemLines;
        String result = "";
        try {
            poemLines = poem.linesOfPoem();
            result = poem.getFistCharacter(poemLines);
        } catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }

        System.out.println(result);
    }
}
