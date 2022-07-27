package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C3POTest {

    @Test
    void testMoveTo() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(initialPoint);
        Point targetPoint = new Point(12L, 23L, 0);
        //When
        c3PO.moveTo(targetPoint);
        //Then
        assertEquals(targetPoint, c3PO.getPosition());
        assertEquals(targetPoint.x(), c3PO.getPath().get(0).x());
        assertEquals(targetPoint.y(), c3PO.getPath().get(0).y());
        assertEquals(targetPoint.z(), c3PO.getPath().get(0).z());
    }

    @Test
    void testFastMoveTo() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(initialPoint);
        Point targetPoint = new Point(12L, 23L, 0);
        //When
        c3PO.fastMoveTo(targetPoint);
        //Then
        assertEquals(targetPoint, c3PO.getPosition());
        assertEquals(targetPoint.x(), c3PO.getPath().get(0).x());
        assertEquals(targetPoint.y(), c3PO.getPath().get(0).y());
        assertEquals(targetPoint.z(), c3PO.getPath().get(0).z());
    }

    @Test
    void testRotate() {
        //Given
        Point initialPoint = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(initialPoint);
        final int angle = 12;
        //When
        c3PO.rotate(angle);
        //Then
        assertEquals(angle, c3PO.getAngle());
    }
}