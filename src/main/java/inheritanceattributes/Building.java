/*
Épületek
Hozz létre egy Building osztályt, amelynek legyen egy protected String name, egy protected double area és egy private int floors attribútuma! Készíts egy konstruktort, amely beállítja az attribútumok értékeit! Getter metódus csak a floors attribútumhoz legyen!
Ezután hozz létre egy SchoolBuilding osztályt, amelynek legyen egy private int numberOfClassRooms attribútuma! Az osztály legyen a Building leszármazottja! Legyen az osztálynak konstruktora és az attribútumhoz getter metódusa is!
Végül hozz létre egy BuildingMain osztályt, amelynek main() metódusában példányosíts egy Building és egy SchoolBuilding példányt is! Írd ki a konzolra az attribútumaik értékét!
*/

package inheritanceattributes;

public class Building {

    protected String name;
    protected double area;
    private final int floors;

    public Building(String name, double area, int floors) {
        this.name = name;
        this.area = area;
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }
}
