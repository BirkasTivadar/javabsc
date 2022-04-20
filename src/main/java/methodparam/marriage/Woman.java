package methodparam.marriage;

//Majd készíts egy Woman és egy Man osztályt, amelyeknek mindkettőnek legyen 2 attribútuma: egy String nameés egy List<RegisterDate> registerDates! Ebben a listában azok a dátumok szerepelnek, amelyekről anyakönyvi kivonat is készül, tehát pl. "születés ideje", 1983-10-22 Ezután pedig legyen egy Marriage osztály, amelyben van egy getMarried(Woman woman, Man man) metódus, amely beállítja mindkét félnél a házasságkötés adatait.

import java.util.ArrayList;
import java.util.List;

public class Woman {

    private String name;
    private final List<RegisterDate> registerDates;

    public Woman(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return new ArrayList<>(registerDates);
    }
}
