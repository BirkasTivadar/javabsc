package introexceptionthrowjunit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TankTest {

    Tank tank;

    @Before
    public void init() {
        tank = new Tank();
    }

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

    @Test(expected = IllegalArgumentException.class)
    public void testModifyAngleeWithWrongAngle() {
        tank.modifyAngle(50);
        tank.modifyAngle(50);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testModifyAngleWithWrongAngleRule() {
        exception.expect(IllegalArgumentException.class);
        tank.modifyAngle(10);
        tank.modifyAngle(-100);
    }

    @Test
    public void testModifyAngleWithWrongAngleAssertThrows() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(100));
        assertEquals("Angle of gunpipe must be between -80 and 80", iae.getMessage());
    }
}