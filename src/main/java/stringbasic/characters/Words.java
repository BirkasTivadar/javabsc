package stringbasic.characters;

import java.util.Scanner;

//Gyakorlati feladat - Online oktatás
//        Ebben a feladatban írj meg egy nagyon egyszerű programot, amely online vagy interaktív oktatás közben használható (általános iskola első osztályosoknál, a magyar, mint idegennyelv tanításánál vagy tíz ujjas vakon gépelés tanulásához).
//        A characters.Words osztályban legyen az alkalmazás!
//        A menete az, hogy a tanár megad egy szót, amelyet az alkalmazás kér be tőle. Ezután a program írja ki a konzolra, hogy ezt a szót le kell betűznie a tanulónak. Majd az alkalmazás az egyenként beírt betűket írja ki a konzolra, írja ki a belőlük összeállítható szót, és végül értékelje ki, hogy jól oldotta-e meg a tanuló a feladatot.

public class Words {

    private String word;
    private String check = "";


    public void setWord(String word) {
        this.word = word;
    }

    public void buildCheck(String letter) {
        check = check + letter;
    }

    public String getWord() {
        return word;
    }

    public String getCheck() {
        return check;
    }

    public boolean areEqual() {
        return word.equals(check);
    }


    public static void main(String[] args) {
        Words words = new Words();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a feladat szavát:");
        String word = scanner.nextLine();

        words.setWord(word);
        System.out.println(word);

        System.out.println("Kérem betűnként begépelni a megadott szót:");

        for (int i = 0; i < words.getWord().length(); i++) {
            words.buildCheck(scanner.nextLine());
        }

        System.out.println(words.areEqual() ? "Helyes" : "Rossz");
    }
}
