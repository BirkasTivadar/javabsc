package compositionlist.computer;

//Készíts egy computer.PersonalComputer osztályt, amelynek különböző kapcsolódó egységei vannak:
//        List<Hardware> hardwares: a külső egységek listája. A Hardware osztálynak legyen egy String name és egy String model attribútuma a szükséges konstruktorral, getterekkel, setterekkel és egy felülírt toString() metódussal!
//        List<Software> softwares: a számítógépen futó programok listája. A Software osztálynak legyen egy String nameés egy double numberOfVersion attribútuma, itt is a szükséges konstruktorral, getterekkel, setterekkel és egy felülírt toString() metódussal!
//        Cpu cpu: a számítógép processzora. Ennek az osztálynak legyen egy String model és egy double clockSignal attribútuma, természetesen a szükséges konstruktorral, getterekkel, setterekkel és egy felülírt toString() metódussal!
//        A PersonalComputer osztályban a két lista típusú attribútumot üres listaként példányosítsd az attribútumnál, a konstruktorban csak a Cpu-t kelljen megadni! Legyen minden attribútumhoz getter, valamint legyen az osztályban egy addHardware(Hardware hardware) és egy addSoftware(Software software) metódus! Itt is írd felül a toString() metódust!
//        A PersonalComputerMain osztály main() metódusában teszteld az egymáshoz kapcsolódó osztályokat!

import java.util.*;

public class PersonalComputer {

    private List<Hardware> hardwares = new ArrayList<>();

    private List<Software> softwares = new ArrayList<>();

    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    public List<Hardware> getHardwares() {
        return new ArrayList<>(hardwares);
    }

    public List<Software> getSoftwares() {
        return new ArrayList<>(softwares);
    }

    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardwares=" + hardwares +
                ", softwares=" + softwares +
                ", cpu=" + cpu +
                '}';
    }
}
