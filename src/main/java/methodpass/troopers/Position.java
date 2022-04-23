package methodpass.troopers;

/*
Gyakorlati feladat - Katonák
        A megoldás a methodpass.troopers csomagba kerüljön!

        Hozz létre egy Position immutable osztályt, mely egy síkbeli pontot reprezentál! A pont távolságát egy másiktól a distanceFrom() metódusa adja vissza.

        Két pont távolságát síkban az alábbi képlettel lehet kiszámítani:

        A Trooper osztály egy gyalogos adatait tartalmazza. A gyalogos alapértelmezetten a (0;0) pontról indul. Tudja változtatni a pozícióját, illetve meg tudja mondani, hogy egy adott ponttól milyen távol van. A HeadQuarter tartalmazza a gyalogosok listáját. Ezen osztály irányítja őket, valamint információt szolgáltat róluk. Az addTrooper() metódussal egy katonát lehet áthelyezni a parancsnokság alá. A moveClosestTrooper() a katonák közül a legközelebbit küldi a megadott pozícióra, míg a moveTrooperByName() egy adott nevű katonát. A mozgatandó katona megtalálását és áthelyezését privát segédmetódusok végzik.

        Minden publikus metódus ellenőrizze a paraméterként kapott adatokat. Objektum sehol sem lehet null, illetve a Trooper neve nem lehet üres. Hibás paraméter esetén a metódus dobjon IllegalArgumentException kivételt!

        Mely metódusoknak van és melyeknek nincs visszahatása?
*/

import java.util.Objects;

public record Position(double posX, double posY) {

    public double distanceFrom(Position position) {
//        if (position == null) throw new IllegalArgumentException("The position must not be null");
        Objects.requireNonNull(position, "The position must not be null");
        return Math.sqrt(Math.pow(posX - position.posX(), 2) + Math.pow(posY - position.posY(), 2));
    }
}
