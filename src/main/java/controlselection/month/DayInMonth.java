package controlselection.month;

//Gyakorlati feladat - Hónap napjainak visszaadása
//        Írj egy olyan metódust, mely az év és a hónap magyar neve alapján visszaadja, hogy az hány napos! Használj switch szerkezetet! Figyelj arra, hogy ne számítson a kis- és nagybetű különbség!
//        A controlselection.month.DayInMonth osztályba dolgozz!
//        Ha nem ismert a hónap, a metódus 0-t adjon vissza!
//        Figyelj a szökőévre (év osztható néggyel, de nem osztható százzal, kivéve, ha osztható 400-zal)!

public class DayInMonth {

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public int numberOfDays(int year, String nameOfMonth) {
        int result = 0;
        String month = nameOfMonth.trim().toLowerCase();
        switch (month) {
            case "január", "március", "május", "augusztus", "október", "december" -> result = 31;
            case "április", "június", "július", "szeptember", "november" -> result = 30;
            case "február" -> result = isLeapYear(year) ? 29 : 28;
        }
        return result;
    }
}
