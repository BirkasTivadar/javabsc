package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Titanic", 1911, 435.6);
    }

    @Test
    void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("Hableány", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1911, ship.getYearOfConstruction());
        assertNotEquals(2011, ship.getYearOfConstruction());
    }

    @Test
    void testLength() {
        assertEquals(435.6, ship.getLength());
        assertNotEquals(121.3, ship.getLength());
    }

    @Test
    void testNull() {
        Ship shipNull = null;
        assertNull(shipNull);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship sameShip = ship;
        assertSame(ship, sameShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Titanic", 1911, 435.6);
//        assertSame(ship, anotherShip);
        assertNotSame(ship, anotherShip);
    }
}