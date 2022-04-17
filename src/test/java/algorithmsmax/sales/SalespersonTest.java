package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalespersonTest {

    @Test
    void testCreateIsOk() {
        Salesperson person = new Salesperson("Somebody", 1000, 200);

        assertEquals(1000, person.amount());
        assertEquals(200, person.target());
        assertEquals(800, person.getDifferenceFromTarget());
    }
}