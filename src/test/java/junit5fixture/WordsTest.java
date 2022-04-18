package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("hello");
        words.addWord("öt");
        words.addWord("cselló");
        words.addWord("sellő");
        words.addWord("kupa");
    }

    @Test
    void testRemoveWordsWithoutLetter() {
        Words wordsWithoutL = new Words();
        wordsWithoutL.addWord("öt");
        wordsWithoutL.addWord("kupa");

        words.removeWordsWithoutLetter("l");

        assertEquals(wordsWithoutL.getWords().size(), words.getWords().size());
    }

    @Test
    void testRemoveWordsWithOtherLength() {
        Words wordsSizeNotFive = new Words();
        wordsSizeNotFive.addWord("hello");
        wordsSizeNotFive.addWord("sellő");

        words.removeWordsWithOtherLength(5);

        assertEquals(wordsSizeNotFive.getWords().size(), words.getWords().size());
    }
}