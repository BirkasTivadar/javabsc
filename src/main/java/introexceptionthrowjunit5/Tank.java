package introexceptionthrowjunit5;

/*
Gyakorlati feladat - Lövegcső
Egy tank lövegcsöve alapesetben előrefelé áll, ez számít a 0°-os állásnak. Ebből a helyzetből csak korlátozott elfordulásra képes, jobbra és balra is csak 80°-ot tud fordulni, körbefordulni egyáltalán nem tud, valamint a többi állásban sem állhat (tehát például nem állhat hátrafelé). Készíts egy Tank osztályt, amelynek legyen egy int angle attribútuma, amelyben a lövegcső aktuális állását tárolja, egész fokban mérve! Legyen hozzá getter, valamint egy void modifyAngle(int angleNumber) metódus, amely paraméterként egy egész számot vár, hogy mennyivel fordítsa el a tank csövét! A metódus úgy működjön, hogy először hozzáadja a metódusnak megadott értéket az aktuális értékhez, majd megvizsgálja, hogy tudja-e ilyen állásba fordítani a csövet (jobbra vagy balra fordulással)! Ha nem, dobjon IllegalArgumentException-t egy megfelelő tájékoztató szöveggel!

Ezután írd meg a teszteseteket is a metódus helyes működésének ellenőrzésére a TankTest osztályba! Legyen két tesztmetódus: egy, ami a helyes működést vizsgálja, valamint egy, amelyben kivétel keletkezik!
*/

public class Tank {
    private int angle = 0;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        int proAngle = angle + angleNumber;
        if (-80 <= proAngle && proAngle <= 80) {
            angle = proAngle;
        } else {
            throw new IllegalArgumentException("Angle of gunpipe must be between -80 and 80");
        }
    }
}
