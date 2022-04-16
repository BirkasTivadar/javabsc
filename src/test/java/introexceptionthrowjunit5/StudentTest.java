package introexceptionthrowjunit5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StudentTest {
    private final Student student = new Student();

    @Test
    public void testAddNote() {
        student.addNote(2);
        student.addNote(3);
        student.addNote(5);

        assertEquals(2, student.getNotes().get(0).intValue());
        assertEquals(3, student.getNotes().size());
    }

    @Test
    public void testAddNoteWithWrongNote() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(21));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}