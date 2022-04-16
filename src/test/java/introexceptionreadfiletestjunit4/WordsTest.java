package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class WordsTest {

    @Test
    public void testGetFirstWordWithA() {
        String word = new Words().getFirstWordWithA(Path.of("src/test/resources/words.txt"));

        assertEquals("Anna", word);
    }

    @Test
    public void testGetFirstWordWithAWithWrongFile() {
        String word = new Words().getFirstWordWithA(Path.of("src/test/resources/wordsNotA.txt"));

        assertEquals("A", word);
    }
}