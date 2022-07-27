package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AstroBoyTest {

    @Test
    void testMoveTo() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(initialPoint);
        Point targetPoint = new Point(12L, 23L, 0);
        //When
        astroBoy.moveTo(targetPoint);
        //Then
        assertEquals(targetPoint, astroBoy.getPosition());
        assertEquals(1, astroBoy.getPath().size());
        assertEquals(targetPoint.x(), astroBoy.getPath().get(0).x());
        assertEquals(targetPoint.y(), astroBoy.getPath().get(0).y());
        assertEquals(targetPoint.z(), astroBoy.getPath().get(0).z());
    }

    @Test
    void testFastMoveTo() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(initialPoint);
        Point targetPoint = new Point(12L, 23L, 0);
        //When
        astroBoy.fastMoveTo(targetPoint);
        //Then
        assertEquals(targetPoint.x(), astroBoy.getPosition().x());
        assertEquals(targetPoint.y(), astroBoy.getPosition().y());
        assertEquals(targetPoint.z(), astroBoy.getPosition().z());

        assertEquals(3, astroBoy.getPath().size());
        assertEquals(initialPoint.x(), astroBoy.getPath().get(0).x());
        assertEquals(initialPoint.y(), astroBoy.getPath().get(0).y());
        assertEquals(AstroBoy.ALTITUDE, astroBoy.getPath().get(0).z());

        assertEquals(targetPoint.x(), astroBoy.getPath().get(1).x());
        assertEquals(targetPoint.y(), astroBoy.getPath().get(1).y());
        assertEquals(AstroBoy.ALTITUDE, astroBoy.getPath().get(1).z());

        assertEquals(targetPoint.x(), astroBoy.getPath().get(2).x());
        assertEquals(targetPoint.y(), astroBoy.getPath().get(2).y());
        assertEquals(0L, astroBoy.getPath().get(2).z());
    }

    @Test
    void testRotate() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(initialPoint);
        final int angle = 12;
        //When
        astroBoy.rotate(angle);
        //Then
        assertEquals(angle, astroBoy.getAngle());
    }

    @Test
    void testLiftTo() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(initialPoint);
        final long altitude = 12;
        //When
        astroBoy.liftTo(altitude);
        //Then
        assertEquals(altitude, astroBoy.getAltitude());
    }
}