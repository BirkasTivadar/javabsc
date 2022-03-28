package stringscanner;

import java.util.Scanner;

//Gyakorlati feladatok
//        A stringscanner csomagba dolgozz!
//        Gyakorlati feladat - Szöveg beolvasása és kiírása
//        Készíts egy StringScanner osztályt, melynek main() metódusában létrehozol egy Scanner-t, amely bekér egy mondatot a felhasználótól! Fontos, hogy olyan mondat legyen megadva, mely több tagmondatból áll, és azokat ugyanaz a karaktersorozat (például vessző és szóköz) választja el egymástól. (Például: “Ez egy olyan mondat, amely több tagmondatból áll, és ezért megfelel a feladatkiírásnak.”) Ezt írasd ki szavanként a konzolra! Majd ezután hozz létre egy másik Scanner-t, kérj be egy másik hasonló mondatot, azt pedig írasd ki tagmondatonként! Kiíratás közben mindkét esetben legyen ellenőrzés arra is, hogy van-e még mit kiírni!

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a mondatot: ");
        String sentence = scanner.nextLine();

        try (Scanner wordsScanner = new Scanner(sentence)) {
            while (wordsScanner.hasNext()) {
                String word = wordsScanner.next();
                if (word.contains(",") || word.contains(".")) {
                    word = word.substring(0, word.length() - 1);
                }
                System.out.println(word);
            }
        }

        System.out.println();

        System.out.println("Kérek egy új mondatot: ");
        sentence = scanner.nextLine();

        try (Scanner sentencePartScanner = new Scanner(sentence).useDelimiter(", ")) {

            while (sentencePartScanner.hasNext()) {
                String sentencePart = sentencePartScanner.next();
                if (sentencePart.contains(".")) {
                    sentencePart = sentencePart.substring(0, sentencePart.length() - 1);
                }
                System.out.println(sentencePart);
            }
        }
    }
}
