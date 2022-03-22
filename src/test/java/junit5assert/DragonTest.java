package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    Dragon susu = new Dragon("Süsü", 1, 1.75);

    @Test
    void testName() {
        assertEquals("Süsü", susu.getName());
        assertNotEquals("Drago", susu.getName());
    }

    @Test
    void testNumberOfHeads() {
        assertEquals(1, susu.getNumberOfHeads());
        assertNotEquals(7, susu.getNumberOfHeads());
    }

    @Test
    void testHeight() {
        assertEquals(1.75, susu.getHeight());
        assertNotEquals(2.10, susu.getHeight());
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Draco", 7, 2.10);
        Dragon nullDragon = null;

        assertNull(nullDragon);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Draco", 7, 2.10);
        Dragon otherDragon = dragon;

        assertSame(dragon, otherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Draco", 7, 2.10);
        Dragon otherDragon = new Dragon("Draco", 7, 2.10);

        assertNotSame(dragon, otherDragon);
    }
}