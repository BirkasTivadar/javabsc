package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class BooksTest {
    @TempDir
    File temporaryFolder;

    @Test
    void writeBooks() throws IOException {
        Path path = temporaryFolder.toPath().resolve("books.txt");
        Books books = new Books();
        books.readBooks();

        books.writeBooks(path);

        List<String> result = Files.readAllLines(path);

        Assertions.assertEquals(result, books.getBookList());
    }
}