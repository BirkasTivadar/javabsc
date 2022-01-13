package arraylist;

//Gyakorlati feladat - A mélyhűtő tartalma
//Egy háziasszony egy listán tartja nyilván, hogy mi található a mélyhűtőben. Amikor betesz valamit, felírja a lista végére, amikor pedig kivesz valamit onnan, akkor természetesen kihúzza a listáról. Implementáld ezt a Freezer osztályban! A main() metódusban példányosíts egy String típusú elemeket tartalmazó listát, add hozzá öt ételfajta nevét, majd írd ki a konzolra a lista tartalmát és a méretét! Ezután törölj két elemet, és ekkor is írd ki a konzolra ellenőrzésként a lista tartalmát és a méretét!

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> meals = new ArrayList<>();
        meals.add("kocsonya");
        meals.add("narancs");
        meals.add("felvágott");
        meals.add("vaj");
        meals.add("tej");

        System.out.println(meals.toString());
        System.out.println(meals.size());

        meals.remove("vaj");
        meals.remove("narancs");
        System.out.println(meals.toString());
        System.out.println(meals.size());
    }

}
