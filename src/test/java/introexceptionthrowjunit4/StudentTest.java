package introexceptionthrowjunit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class StudentTest {

    private Student student;

    @Before
    public void init() {
        student = new Student();
    }

    @Test
    public void testAddNote() {
        student.addNote(2);
        student.addNote(3);
        student.addNote(5);

        assertThat(student.getNotes().get(0), equalTo(2));
        assertThat((student.getNotes().size()), equalTo(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNoteWithWrongNote() {
        student.addNote(13);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAddNoteWithWrongNoteRule() {
        exception.expect(IllegalArgumentException.class);
        student.addNote(0);
    }

    @Test
    public void testAddNoteWithWrongNoteAssertThrows() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(21));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}