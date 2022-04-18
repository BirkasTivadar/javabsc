package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void testCreate() {
        Animal animal = new Animal("zsiráf", 4);

        assertEquals("zsiráf", animal.name());
        assertEquals(4, animal.numberOfLegs());
    }
}