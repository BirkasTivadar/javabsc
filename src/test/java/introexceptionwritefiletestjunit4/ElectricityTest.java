package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ElectricityTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteStreets() throws IOException {
        Path path = temporaryFolder.newFile("streets.txt").toPath();

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