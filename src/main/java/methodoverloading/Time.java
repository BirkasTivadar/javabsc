package methodoverloading;
/*
Gyakorlati feladat - Időpontok
        Szükségünk van egy időpontot reprezentáló Time osztályra, amely többféle paraméterezéssel példányosítható. Az osztály metódusai segítségével adott objektumát össze tudjuk hasonlítani másik Time objektummal. Így két metódusban is meg tudjuk mondani a kapott objektumról, hogy azonos időpontot reprezentál-e, két másik metódusban pedig azt, hogy az adott objektum korábbi időpontot reprezentál-e (mindkét esetben egy-egy napon belül vagyunk). (A Java természetesen rendelkezik a megfelelő dátum- és időkezelő osztályokkal, és azok esetében is hasonló módon lett megoldva a többféle paraméterezés.)
        Publikus metódusok:
public boolean isEqual(Time time)
public boolean isEqual(int hours, int minutes, int seconds)
public boolean isEarlier(Time time)
public boolean isEarlier(int hours, int minutes, int seconds)
*/

public record Time(int hours, int minutes, int seconds) {

    private int timeInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.timeInSeconds() == new Time(hours, minutes, seconds).timeInSeconds();
    }

    public boolean isEqual(Time time) {
        return this.timeInSeconds() == time.timeInSeconds();
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.timeInSeconds() < new Time(hours, minutes, seconds).timeInSeconds();
    }

    public boolean isEarlier(Time time) {
        return this.timeInSeconds() < time.timeInSeconds();
    }
}
