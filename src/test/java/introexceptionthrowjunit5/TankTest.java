package introexceptionthrowjunit5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TankTest {
    private final Tank tank = new Tank();

    @Test
    public void testModifyAngle() {
        assertEquals(0, tank.getAngle());

        tank.modifyAngle(60);
        assertEquals(60, tank.getAngle());

        tank.modifyAngle(20);
        assertEquals(80, tank.getAngle());
        tank.modifyAngle(-160);
        assertEquals(-80, tank.getAngle());
    }

    @Test
    public void testModifyAngleWithWrongAngleAssertThrows() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(100));
        assertEquals("Angle of gunpipe must be between -80 and 80", iae.getMessage());
    }
}