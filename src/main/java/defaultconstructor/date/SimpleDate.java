/*
Formázott dátumok
        A SimpleDate osztály dátumokat reprezentál (év, hó, nap), de csak 1900. január 1. utáni dátumokat, ezeket year, month, day nevű (int típusú) attribútumokban tárolja, konstruktora nincs. Az értékek beállítása publikus metódusból történik.
        Publikus metódusok:
public void setDate(int year, int month, int day)
public int getYear()
public int getMonth()
public int getDay()
        A dátum részek megadásakor legyen ellenőrzés, csak korrekt év (>= 1900), korrekt hónap (1-12) és a hónapnak megfelelő nap érték fogadható el! Vegyük figyelembe a szökőéveket is! Inkorrekt paraméter értékek esetén a metódus dobjon IllegalArgumentException-t, a megfelelő tájékoztató szöveggel! Az ellenőrzést szervezzük ki privát metódusokba! Pl. a következők lehetnek:
        Privát metódusok:
private boolean isCorrect(int year, int month, int day)
private boolean isLeapYear(int year)
private int calculateMonthLength(int year, int month)
        A dátum adatot formázni is kellene, mégpedig országonként eltérő módon. Ezt a SimpleDateFormatter osztály fogja végezni. Hozzunk létre egy CountryCode enumot HU, EN, US értékekkel. Az osztály egyik publikus metódusa átvesz egy enum értéket és annak alapján állítja össze a dátum Stringet, a másik az alapértelmezett ország kódját használja (ez a mi esetünkben természetesen Magyarország). Ezt az osztály paraméter nélküli konstruktora állítja be.
        Konstruktor:
public SimpleDateFormatter()
        Publikus metódusok:
public String formatDateString(SimpleDate simpleDate)
public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate)
        A dátum String formátuma az országok kódjai alapján a következők legyenek:
        HU esetén: 2016-2-29
        EN esetén: 29-2-2016
        US esetén: 2-29-2016
*/

package defaultconstructor.date;

public class SimpleDate {

    private static final String SEPARATOR = ", ";
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! " + year + SEPARATOR + month + SEPARATOR + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isCorrect(int year, int month, int day) {
        int monthLength = calculateMonthLength(year, month);
        return isCorrectYear(year) && isCorrectMonth(month) && isCorrectDay(monthLength, day);
    }

    private boolean isCorrectYear(int year) {
        return year >= 1900;
    }

    private boolean isCorrectMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isCorrectDay(int monthLength, int day) {
        return day >= 1 && day <= monthLength;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private int calculateMonthLength(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> isLeapYear(year) ? 29 : 28;
        };
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
