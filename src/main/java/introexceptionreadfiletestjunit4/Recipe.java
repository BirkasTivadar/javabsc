package introexceptionreadfiletestjunit4;

/*
Gyakorlati feladat - Receptből hozzávalók listája
        Hozd létre a recipe.txt fájlt a következő tartalommal a projekted teszt ágán:

        Almáspite

        40 dkg liszt
        25 dkg margarin
        10 dkg kristálycukor
        1 egész tojás
        1 egész citrom
        1 csomag sütőpor
        3 csomag vanillincukor
        1-2 evőkanál tejföl
        2 kg alma
        1 evőkanál fahéj
        A Recipe osztályban legyen egy List<String> ingredients attribútum, amelyben a recept hozzávalóit tudjuk tárolni! Legyen hozzá getter metódus, valamint egy void addIngredients(Path path) metódus, mely beolvassa a receptet, és az osztály listájához adja a hozzávalókat, a cím, a mennyiségek és a mérési egységek nélkül. A metódus lefutása után a következő legyen tehát a lista tartalma:

        liszt
        margarin
        kristálycukor
        tojás
        citrom
        sütőpor
        vanillincukor
        tejföl
        alma
        fahéj
        A fájlbeolvasást szervezd ki külön privát metódusba! Kivételkezelésnél csomagold be a kötelezően kezelendő kivételt!

        Írj tesztet is a RecipeTest osztályban a metódus helyes és hibás működésének tesztelésére!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private final List<String> ingredients = new ArrayList<>();

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void addIngredients(Path path) {
        List<String> recipe = readFile(path);

        int length = recipe.size();
        for (int i = 2; i < length; i++) {
            ingredients.add(recipe.get(i).split(" ")[2]);
        }
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}
