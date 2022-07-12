package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModifiedWordTest {

    @Test
    void testModify() {
        assertEquals("AxMy", new ModifiedWord().modify("alma"));
        assertEquals("AxBy", new ModifiedWord().modify("abban"));
        assertEquals("KxRy", new ModifiedWord().modify("körte"));
        assertEquals("SxIy", new ModifiedWord().modify("szilva"));
    }
}