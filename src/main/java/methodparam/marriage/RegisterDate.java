package methodparam.marriage;

/*
Gyakorlati feladat - Anyakönyvi adatok
        Készíts egy marriage.RegisterDate (anyakönyv) osztályt, amelynek van 2 attribútuma: String description és LocalDate date! Majd készíts egy Woman és egy Man osztályt, amelyeknek mindkettőnek legyen 2 attribútuma: egy String nameés egy List<RegisterDate> registerDates! Ebben a listában azok a dátumok szerepelnek, amelyekről anyakönyvi kivonat is készül, tehát pl. "születés ideje", 1983-10-22 Ezután pedig legyen egy Marriage osztály, amelyben van egy getMarried(Woman woman, Man man) metódus, amely beállítja mindkét félnél a házasságkötés adatait.

        Az egyes kisebb műveleteket szervezd ki külön metódusokba! Állítsa be egy külön privát metódus a hölgy házasságkötés után használatos nevét! Ezt szabadon választhatod. Tegyük fel, hogy mindketten egy vezetéknévvel és egy keresztnévvel rendelkeztek a házasságkötés előtt! Legyen külön privát metódus arra is, hogy a mai nap, mint a házasságkötés dátuma bekerüljön az anyakönyvi dátumaik közé a listába úgy, hogy "házasságkötés ideje", 2021-10-25 (az aktuális mai dátummal, természetesen)!

        Végül írd is meg a teszteseteket a metódus tesztelésére!
*/

import java.time.LocalDate;

public record RegisterDate(String description, LocalDate date) {

}
