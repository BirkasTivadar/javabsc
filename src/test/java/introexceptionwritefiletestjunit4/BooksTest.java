package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteBooks() throws IOException {
        Books books = new Books();
        Path path = temporaryFolder.newFile("books.txt").toPath();
        books.readBooks();

        books.writeBooks(path);

        List<String> result = Files.readAllLines(path);

        assertEquals(result, books.getBookList());
    }
}