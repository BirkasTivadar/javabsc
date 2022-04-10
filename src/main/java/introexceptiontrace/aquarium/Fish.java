package introexceptiontrace.aquarium;
/*

Gyakorlati feladat - Akvárium
        Hozd létre az alábbi két osztályt az aquarium csomagban:

public class Fish {

    private String type;
    private String colour;

    public Fish(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
import java.util.List;

public class Aquarium {

    private List<Fish> ornamentalFish;

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }
}
    Ezután az AquariumMain osztály main() metódusában példányosíts egy Aquarium példányt és néhány halat, amit azután adj hozzá az akvárium listájához! Végül írd ki a konzolra az akváriumban található halak számát a getNumberOfFish() metódus segítségével!

        Indítsd el az alkalmazást! Hol keletkezik a kivétel és miért? Kövesd vissza a hívási láncot!
*/

public class Fish {

    private String type;
    private String colour;

    public Fish(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
