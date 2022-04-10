package introexceptiontrycatch;

/*
Gyakorlati feladat - Első betű
        A FirstLetter osztályban hozz létre egy listát, amely szavakat tartalmazzon, majd írd ki minden szó első betűjét a konzolra!

        Gondold végig, hogy ebben a kódban melyik utasítás végrehajtásánál keletkezhet kivétel, és kezeld is le azt úgy, hogy kiírod a konzolra a kivétel üzenetét!
*/

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {

        try {
            List<String> words = List.of("hello", "", "hola", "csőváz", null, "zdrasztvujtye");
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }


        List<String> words = Arrays.asList("hello", "", "hola", "csőváz", null, "zdrasztvujtye");

        for (String str : words) {
            try {
                System.out.println(str.charAt(0));
            } catch (NullPointerException | IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("End");
    }
}

