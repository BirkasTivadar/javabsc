package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {

    Labels labels = new Labels();

    @Test
    void getTableOfNumbers() {
        int[][] table = labels.getTableOfNumbers(5);

        assertEquals(2, table[0][0]);
        assertEquals(7, table[2][3]);
        assertEquals(7, table[3][2]);
    }
}