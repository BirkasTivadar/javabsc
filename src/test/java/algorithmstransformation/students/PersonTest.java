package algorithmstransformation.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person("Kiss Béla", 56, "1118 Budapest, Sasadi út 34.");

        assertEquals("Kiss Béla", person.name());
        assertEquals(56, person.age());
        assertEquals("1118 Budapest, Sasadi út 34.", person.address());
    }
}