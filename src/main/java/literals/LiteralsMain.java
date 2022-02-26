package literals;

//        Gyakorlati feladatok
//        A literals.LiteralsMain osztályba dolgozz!

public class LiteralsMain {

    public static void main(String[] args) {

//        Gyakorlati feladat - Összefűzés
//        Fűzd össze szövegként az 1 és 2 literált! Milyen megoldásokat ismersz?
        System.out.println("1" + "2");
        System.out.println(1 + "2");
        System.out.println("1" + 2);

//        Gyakorlati feladat - Osztás
//        Vedd a 3 és a 4 hányadosát, és tárold el a double quotient változóban, majd írd ki! Mi lesz az eredmény? Miért van ez így? Hogyan lehet ezt pontosítani kizárólag literálok használatával?
        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3.0 / 4;
        System.out.println(quotient);
        quotient = 3 / 4.0;
        System.out.println(quotient);
        quotient = 3.0 / 4.0;
        System.out.println(quotient);

//        Gyakorlati feladat - Nagy szám
//        Definiáld a 3_244_444_444 literált, és add értékül a long big változónak! Írd is ki!
        long big = 3_244_444_444L;
        System.out.println(big);

//        Gyakorlati feladat - String mint objektum
//        Definiálj egy String word változót, melynek az értéke legyen a TITLE szöveg nagybetűkkel! A szövegliterál eredetileg kisbetűkből álljon, és hajtsuk végre rajta a toUpperCase() metódust az értékadás előtt!
        String word = "title".toUpperCase();
        System.out.println(word);

//        Gyakorlati feladat - Szám bináris stringként
//        Írasd ki az 1 és a -2 értéket bináris formájában! Keresgélj az Integer osztály metódusai között!

        int one = 1;
        int minusTwo = -2;
        System.out.println(Integer.toBinaryString(one));
        System.out.println(Integer.toBinaryString(minusTwo));
    }
}
