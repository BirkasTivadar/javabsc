package cmdarguments.verse;

//Gyakorlati feladat - Verssor összefűzése szavakból
//        A cmdarguments.verse.VerseMain osztály main() metódusának parancssori paraméterként add át egy kedvenc verssorodat szavanként! A main() metódusban először írd ki a konzolra a verssort! Majd írd ki a szavakat fordított sorrenben, szóközökkel elválasztva!

public class VerseMain {

    public static void main(String[] args) {

        for (String word : args) {
            System.out.print(word + " ");
        }

        System.out.println();
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
