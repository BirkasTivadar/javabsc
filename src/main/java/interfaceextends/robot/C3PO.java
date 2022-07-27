/*
Az egyik robot: C3PO implements MovableRobot osztály Point position, int angle és List<Point> path attribútumokkal:
        Konstruktor:
            public C3PO(Point position)
        Publikus metódusok:
            public void moveTo(Point position)
            public void fastMoveTo(Point position)
            public void rotate(int angle)
        Mivel C3PO nem tud sietni, esetében a moveTo() és fastMoveTo() metódusok ugyanúgy működnek. Célszerű egy privát metódust létrehozni (pl. void walkTo(Point position)), amely beállítja a robot új pozícióját és be is jegyzi ezt a path-ba.
*/

package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot {

    private Point position;
    private int angle;
    private final List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
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
        walkTo(position);
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
