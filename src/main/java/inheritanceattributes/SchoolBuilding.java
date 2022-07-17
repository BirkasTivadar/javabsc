/*
Ezután hozz létre egy SchoolBuilding osztályt, amelynek legyen egy private int numberOfClassRooms attribútuma! Az osztály legyen a Building leszármazottja! Legyen az osztálynak konstruktora és az attribútumhoz getter metódusa is!
*/

package inheritanceattributes;

public class SchoolBuilding extends Building {
    private final int numberOfClassRooms;

    public SchoolBuilding(String name, double area, int floors, int numberOfClassRooms) {
        super(name, area, floors);
        this.numberOfClassRooms = numberOfClassRooms;
    }

    public int getNumberOfClassRooms() {
        return numberOfClassRooms;
    }
}
