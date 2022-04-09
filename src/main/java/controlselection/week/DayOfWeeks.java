package controlselection.week;

//Gyakorlati feladat - Hét napjai
//        Írj egy metódust, mely várja a hét egy napját, és hétfő esetén azt adja vissza, hogy “hét eleje” van, kedd, szerda és csütörtök esetén, hogy “hét közepe” van, pénteken “majdnem hétvége”, és szombat és vasárnap esetén “hét vége”!
//        Figyelj arra, hogy ne számítson a kis- és nagybetű különbség!
//        Ha nem ismert a nap, a metódus adja vissza azt, hogy “ismeretlen nap”!
//        A controlselection.week.DayOfWeeks osztályba dolgozz!

public class DayOfWeeks {

    public String whichDay(String nameOfDay) {

        String day = nameOfDay.trim().toLowerCase();

        String result = "ismeretlen nap";
        switch (day) {
            case "hétfő" -> result = "hét eleje";
            case "kedd", "szerda", "csütörtök" -> result = "hét közepe";
            case "péntek" -> result = "majdnem hétvége";
            case "szombat", "vasárnap" -> result = "hét vége";
        }

        return result;
    }
}
