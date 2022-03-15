package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {


//      Gyakorlati feladat - Kontinensek
//      Hozz létre a firstenum csomagban egy Continent nevű enumot, melynek példányai a Földön található kontinensek nevei! Az enumtype.firstenum.FirstEnumMain osztály main() metódusában írd ki a konzolra az enum értékeit egyenként! Majd írd ki őket egyszerre egy tömbben!

        for (Continent c : Continent.values()) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(Continent.values()));


//      Gyakorlati feladat - Óceánok
//      Hozz létre a firstenum csomagban egy Ocean nevű enumot, melynek példányai a Földön található óceánok nevei! Az enumtype.firstenum.FirstEnumMain osztály main() metódusában írd ki a konzolra az enum értékeit úgy, hogy az enum valueOf() metódusát használod!

        for (Ocean o : Ocean.values()) {
            System.out.println(Ocean.valueOf(o.name()));
        }


//        Gyakorlati feladat - Foci
//        Hozz létre a firstenum csomagban egy Football nevű enumot, melynek példányai egy focista csapaton belül elfoglalt pozíciói (pl. hátvéd, csatár, stb.)! Az enumtype.firstenum.FirstEnumMain osztály main() metódusában írd ki a konzolra az enum értékeit úgy, hogy az enum name() metódusát használod!

        for (Football f : Football.values()) {
            System.out.println(f.name());
        }
    }
}
