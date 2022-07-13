package methodoverloading;
/*
Gyakorlati feladat - Ki felel ma?
        Az 5.A osztályban egy alkalmazás választja ki az elektronikus osztálynaplóból a mai napon felelő diákot. Ehhez csupán egy számot kell megadni, és így a névsorból megkaphatjuk az adott sorszámú diák nevét. A számot viszont háromféle formában is megadhatjuk.
        Hozz létre egy ClassFiveA nevű osztályt, amelynek legyen egy String listája a tanulók neveivel! Legyen az osztályban három túlterhelt metódus, melyeknek paraméterezését a következők szerint add meg:
        getTodayReferringStudent(int number): ez a metódus egy egész számot vár, és visszaadja a lista ilyen sorszámú elemét.
        getTodayReferringStudent(Number number): ez a metódus a Number enum egy értékét várja. Ez az enum a számok neveit tartalmazza, annyit, ahány diák van a listában (ONE, TWO, THREE, stb.), és ez alapján tudja visszaadni az ilyen sorszámú diák nevét a listából.
        getTodayReferringStudent(String numberName): ez a metódus pedig String formában várja ugyanazt a szöveget, mint ami a Number enum értékeinek a neve (tehát pl. "one"), és ez alapján adja vissza a megfelelő diák nevét.
        A Number enumnál vedd fel minden egyes felsoroló példány számértékét is attribútumként (int value), mert szükséged lesz rá!
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private final List<String> names = new ArrayList<>(Arrays.asList("Nagy Bea", "Horváth Béla", "Kiss József", "Varga Éva"));

    public String getTodayReferringStudent(int number) {
        return names.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getNumber() - 1);
    }

    public String getTodayReferringStudent(String numberString) {
        return names.get(Number.valueOf(numberString.toUpperCase()).ordinal());
    }
}
