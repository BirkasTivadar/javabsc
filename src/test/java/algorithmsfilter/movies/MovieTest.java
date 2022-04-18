package algorithmsfilter.movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @Test
    void testCreate() {
        Movie movie = new Movie("Titanic", Category.ROMANTIC, 5);

        assertEquals("Titanic", movie.title());
        assertEquals(Category.ROMANTIC, movie.category());
        assertEquals(5, movie.rating());
    }
}