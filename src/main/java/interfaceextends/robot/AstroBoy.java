/*
A másik robot: AstroBoy implements FlyableRobot osztály Point position, int angle és List<Point> path attribútumokkal, valamint long ALTITUDE = 5 konstans értékkel:
        Konstruktor:
            public AstroBoy(Point position)
        Publikus metódusok:
            public void walkTo(Point position)
            public void flyTo(Point position)
            public void liftTo(long altitude)
            public void moveTo(Point position) // delegálja a funkciót
            public void fastMoveTo(Point position) //komplex mozgás, felemelkedik, elrepül a célpont fölé, majd leereszkedik
            public void rotate(int angle)
        Mindegyik mozgásos metódus bejegyzi, hogy milyen koordináták mentén történt a mozgás.
*/

package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {


    private Point position;
    private int angle;
    private final List<Point> path = new ArrayList<>();

    public static final long ALTITUDE = 5;
    private long altitude;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return altitude;
    }

    @Override
    public void liftTo(long altitude) {
        this.position = new Point(position.x(), position.y(), altitude);
        this.altitude = altitude;
    }

    private void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        path.add(this.position);
        moveTo(new Point(position.x(), position.y(), ALTITUDE));
        liftTo(0);
        path.add(this.position);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return new ArrayList<>(path);
    }
}
