/*
Robotok
        Egy játék során robotokat fogunk mozgatni. Alapvetően kétféle mozgást kell megvalósítani, gyaloglást és repülést. A szükséges alapműveleteket, mint funkciókat, interfészekben definiáljuk. Az egyes konkrét robotok ezeket implementálják, ennek megfelelően fognak majd mozogni.

        Az interfészek nem függetlenek egymástól, a MovableRobot interfész leszármazottja a repülést megvalósító (esetünkben a felemelkedés funkciót leíró) FlyableRobot interfész. A robotok mozgását a koordinátákat tartalmazó Point osztály objektumai segítségével lehet követni.
        A MovableRobot interfészben definiált metódusok a következők:
        void moveTo(Point position);
        void fastMoveTo(Point position);
        void rotate(int angle);
        List<Point> getPath();
        A getPath() metódus azoknak a pontoknak a listáját adja vissza, amelyeket a robot mozgása során érintett (a konkrét mozgató utasítások minden esetben bejegyzik a célként kapott Point objektumot).
        A FlyableRobot extends MoveableRobot interfészben definiált metódus:
        void liftTo(long altitude);
        A Point osztály final long x, long y és long z attribútumokkal rendelkezik. Csak FlyableRobot esetében kap a z attribútum nullától különböző értéket, a MoveableRobot síkban mozog. Konstruktora minden attribútum értékét beállítja.

        Két robotot fogunk létrehozni, az egyik csak síkban mozog (C3PO), a másik repülni is tud (AstroBoy).
        Az egyik robot: C3PO implements MovableRobot osztály Point position, int angle és List<Point> path attribútumokkal:
        Konstruktor:
            public C3PO(Point position)
        Publikus metódusok:
            public void moveTo(Point position)
            public void fastMoveTo(Point position)
            public void rotate(int angle)
        Mivel C3PO nem tud sietni, esetében a moveTo() és fastMoveTo() metódusok ugyanúgy működnek. Célszerű egy privát metódust létrehozni (pl. void walkTo(Point position)), amely beállítja a robot új pozícióját és be is jegyzi ezt a path-ba.

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

import java.util.List;

public interface MoveableRobot {

    void moveTo(Point position);

    void fastMoveTo(Point position);

    void rotate(int angle);

    List<Point> getPath();
}
