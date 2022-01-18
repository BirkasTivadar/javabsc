package introconstructors;

import java.time.LocalDate;

//Gyakorlati feladat - Biciklitúra
//        Hozd létre a CyclingTour osztályt, amelyben a következő attribútumok legyenek:
//        String description : a túra leírása.
//        LocalDate startTime : a túra kezdő dátuma.
//        int numberOfPeople : a túrázó csapat létszáma.
//        double kms : a túrán megtett kilométerek.
//        A túrát először csak meghirdetik, ezért olyan konstruktort készíts az osztálynak, melynek csak a leírást és a kezdő dátumot kell megadni! Készíts az attribútumokhoz getter metódusokat! Majd legyen egy registerPerson(int person) nevű metódus, amely a csapat létszámához hozzáadja a paraméterként megadott számú embert, valamint egy ride(double km), amely hozzáadja az összesen megtett kilométerhez a paraméterként megadott távot. Az osztály main() metódusában próbáld is ki mindezeket! Először példányosíts egy CyclingTour példányt és írd ki az állapotát (az összes attribútum értékét)! Majd jelentkezzen a túrára néhány ember, tegyenek meg néhány kilométert, és ekkor újra írd ki a CyclingTour példányod állapotát!

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void ride(double km) {
        kms += km;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Bakonyi bicótúra", LocalDate.of(2022, 2, 11));
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPerson(13);
        cyclingTour.ride(45);
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}
