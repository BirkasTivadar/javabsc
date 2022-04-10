package introexceptiontrycatchtrace;

/*
Gyakorlati feladat - A mai nyertes
        Készíts egy Winner osztályt, melynek legyen egy listája, benne emberek neveivel, akik jelentkeztek egy nyereményjátékra. Hozd létre ezt a listát, adj hozzá értékeket, de úgy, hogy legyen köztük null értékű név is! Legyen az osztályban egy getWinner() metódus is, amely kisorsolja valaki nevét a listából, és nagybetűs formában visszaadja azt. A Jackpot osztály main() metódusában írd ki a konzolra, hogy ki a mai nyertes!

        Gondold végig, hogy ebben a kódban melyik utasítás végrehajtásánál keletkezhet kivétel, és kezeld is le azt a Jackpot osztályban!
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> names = Arrays.asList("Jani", "Mari", null, "Lali", "Miki", "Misi", "Orsi");

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public String getWinner() {
        int length = names.size();
        Random rnd = new Random();
        int winIndex = rnd.nextInt(length);
        return names.get(winIndex);
    }
}
