package chars;

//Gyakorlati feladatok
//        A chars csomagba dolgozz!
//        Gyakorlati feladat - Betű vagy számjegy?
//        A LettersAndDigits osztályban legyen egy printLetterOrDigit(String text) metódus, amely paraméterként vár egy szöveget, benne összevissza mindenféle karakterrel, és az egyes karakterekre vonatkozóan kiírja a konzolra, hogy az az adott karakter betű, számjegy vagy egyéb karakter. Tehát egy ilyen szövegre: bfa68fF;X ilyesmi kiírást kell megvalósítani:
//        b : betű
//        f : betű
//        a : betű
//        6 : számjegy
//        8 : számjegy
//        f : betű
//        F : betű
//        ; : egyéb
//        X : betű
//        Az osztály main() metódusában teszteld!

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println(c + ": " + "betű");
            } else if (Character.isDigit(c)) {
                System.out.println(c + ": " + "számjegy");
            } else if (Character.isWhitespace(c)) {
                System.out.println(c + ": " + "whitespace");
            } else {
                System.out.println(c + ": " + "egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();

        String text = "afds453 gf d";

        lettersAndDigits.printLetterOrDigit(text);
    }
}
