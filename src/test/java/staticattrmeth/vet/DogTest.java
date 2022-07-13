package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void testCreate() {
        Dog dog = new Dog("Buksi", 8, Species.GERMAN_SHEPHERD);

        assertEquals("Buksi", dog.name());
        assertEquals(8, dog.age());
        assertEquals(Species.GERMAN_SHEPHERD, dog.species());
        assertEquals(0L, dog.getCodeNumber());
    }
}