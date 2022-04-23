package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22));
        Man man = new Man("Kiss József", new ArrayList<>(List.of(registerDate)));

        assertEquals("Kiss József", man.name());
        assertEquals(1, man.registerDates().size());
        assertEquals(LocalDate.of(1983, 10, 22), man.registerDates().get(0).date());
    }
}