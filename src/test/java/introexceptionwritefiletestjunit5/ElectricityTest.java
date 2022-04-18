package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("streets.txt");

        List<String> streets = List.of("Cuha u.", "Lomnic utca", "Andrássy út");

        Electricity electricity = new Electricity();
        electricity.addStreets(streets);
        electricity.writeStreets(path);

        String date = LocalDate.now().toString();
        List<String> expectedList = new ArrayList<>(List.of(date));

        List<String> readStreets = Files.readAllLines(path);
        expectedList.addAll(streets);

        assertEquals(expectedList, readStreets);
    }
}