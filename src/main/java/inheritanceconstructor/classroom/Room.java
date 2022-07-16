/*
Oktatócég
A feladatban létrehozandó osztályok egy oktatócég termeit és kurzusait reprezentálják, meg kell tudni mondani, hogy adott kurzust annak létszáma és eszközigénye (facility) alapján egy adott teremben meg lehet-e tartani. Az osztályokat a classroom csomagba tedd!
Legyen egy Room osztály String location és int capacity attribútumokkal:
Konstruktor:
public Room(String location, int capacity)

Kell egy Facility enum: PROJECTOR, COMPUTERS és CHALKBOARD elemekkel.
A Room leszármazottja a ClassRoom osztály Facility facility attribútummal:
Konstruktor:
public ClassRoom(String location, int capacity, Facility facility)
        Publikus metódus:
public boolean isSuitable(Course course)

Végül legyen egy Course osztály int participants és Facility facilityNeeded attribútumokkal
Konstruktor:
public Course(int participants, Facility facilityNeeded)

A felsoroltakon kívül az osztályokban szükség lesz getter metódusokra is.
*/

package inheritanceconstructor.classroom;

public class Room {
    private final String location;
    private final int capacity;
    public Room(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
    }
    public String getLocation() {
        return location;
    }
    public int getCapacity() {
        return capacity;
    }
}
