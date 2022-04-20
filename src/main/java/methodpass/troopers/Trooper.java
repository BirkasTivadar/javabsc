package methodpass.troopers;

//A Trooper osztály egy gyalogos adatait tartalmazza.A gyalogos alapértelmezetten a(0;0)pontról indul.Tudja változtatni a pozícióját,illetve meg tudja mondani,hogy egy adott ponttól milyen távol van.

public class Trooper {
    private final String name;
    private Position position;

    public Trooper(String name) {
        if (isEmpty(name)) throw new IllegalArgumentException("Name must not be empty.");
        this.name = name;
        this.position = new Position(0, 0);
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) throw new IllegalArgumentException("The new position must not be null");
        this.position = target;
    }

    public double distanceFrom(Position target) {
        return getPosition().distanceFrom(target);
    }
}
