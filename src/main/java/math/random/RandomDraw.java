package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//Gyakorlati feladat - Két szerencsés ember
//        A math.random.RandomDraw osztályban egy nyereménysorsolást kell szimulálnod. Itt 10 emberből sorsolnak ki kettőt. Először hozz létre egy String listát, amelyhez adj hozzá 10 tetszőleges nevet! Majd példányosíts egy Random objektumot, melynek segítségével kérj két (pszeudo)random számot, az első 1 és 5 közé essen, a második pedig 6 és 10 közé! A kapott két szám a listában szereplő két nyertes ember sorszáma (abban a sorrendben, ahogy a listában szerepelnek). Írd ki a megfelelő neveket a konzolra!

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Lilike",
                "Bá",
                "Marci",
                "Lóri",
                "Lajos",
                "Niki",
                "Eszti",
                "Zsuzsika",
                "Jimmy",
                "Józsi bá"
        );

        Random rnd = new Random();
        int number1 = rnd.nextInt(1, 6);
        int number2 = rnd.nextInt(6, 11);

        System.out.println(names.get(number1 - 1));
        System.out.println(names.get(number2 - 1));
    }
}
