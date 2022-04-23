package methodpass.troopers;

/*
A HeadQuarter tartalmazza a gyalogosok listáját. Ezen osztály irányítja őket, valamint információt szolgáltat róluk. Az addTrooper() metódussal egy katonát lehet áthelyezni a parancsnokság alá. A moveClosestTrooper() a katonák közül a legközelebbit küldi a megadott pozícióra, míg a moveTrooperByName() egy adott nevű katonát. A mozgatandó katona megtalálását és áthelyezését privát segédmetódusok végzik.

        Minden publikus metódus ellenőrizze a paraméterként kapott adatokat. Objektum sehol sem lehet null, illetve a Trooper neve nem lehet üres. Hibás paraméter esetén a metódus dobjon IllegalArgumentException kivételt!
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class HeadQuarter {

    private final List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return new ArrayList<>(troopers);
    }

    public void addTrooper(Trooper trooper) {
//        if (trooper == null) throw new IllegalArgumentException("Trooper must not be null.");
        Objects.requireNonNull(trooper, "Trooper must not be null.");
        troopers.add(trooper);
    }


    public void moveTrooperByName(String name, Position target) {
        if (name.isBlank()) throw new IllegalArgumentException("Name must not be empty");
        moveTrooper((findTrooperByName(name)), target);

//        troopers.stream().filter(t -> t.getName().equals(name)).forEach(t -> t.changePosition(target));

//        for (Trooper trooper : troopers) {
//            if (trooper.getName().equals(name)) trooper.changePosition(target);
//        }
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findClosestTrooper(Position target) {
        return troopers.stream().min(Comparator.comparing(t -> t.distanceFrom(target))).get();
//        Trooper result = troopers.get(0);
//        for (Trooper trooper : troopers) {
//            if (trooper.distanceFrom(target) < result.distanceFrom(target)) result = trooper;
//        }
//        return result;
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) return trooper;
        }
        throw new IllegalArgumentException("Wrong name");
    }

    private void moveTrooper(Trooper trooper, Position target) {
//        if (trooper == null) throw new IllegalArgumentException("Trooper must not be null");
        Objects.requireNonNull(trooper, "Trooper must not be null.");
        trooper.changePosition(target);
    }
}
