package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

//Majd készíts egy Woman és egy Man osztályt, amelyeknek mindkettőnek legyen 2 attribútuma: egy String nameés egy List<RegisterDate> registerDates! Ebben a listában azok a dátumok szerepelnek, amelyekről anyakönyvi kivonat is készül, tehát pl. "születés ideje", 1983-10-22 Ezután pedig legyen egy Marriage osztály, amelyben van egy getMarried(Woman woman, Man man) metódus, amely beállítja mindkét félnél a házasságkötés adatait.

public record Man(String name, List<RegisterDate> registerDates) {

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    @Override
    public List<RegisterDate> registerDates() {
        return new ArrayList<>(registerDates);
    }
}
