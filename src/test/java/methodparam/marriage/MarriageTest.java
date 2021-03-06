package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarriageTest {

    @Test
    void testGetMarriage() {
        Woman woman = new Woman("Nagy Rozália", new ArrayList<>(List.of(
                new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22)))));
        Man man = new Man("Kiss József", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés ideje", LocalDate.of(1979, 3, 14)),
                new RegisterDate("házasságkötés ideje", LocalDate.of(2007, 4, 6)),
                new RegisterDate("válás ideje", LocalDate.of(2010, 7, 9)))));
        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Kiss-Nagy Rozália", woman.getName());
        assertEquals(4, man.registerDates().size());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).date());
    }
}