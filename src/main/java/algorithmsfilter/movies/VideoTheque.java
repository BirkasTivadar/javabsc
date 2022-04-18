package algorithmsfilter.movies;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private final List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        return movies.stream().filter(m -> m.category() == category && m.rating() > 3).toList();
//        List<Movie> result = new ArrayList<>();
//        for (Movie movie : movies) {
//            if (movie.getCategory() == category && movie.getRating() > 3) result.add(movie);
//        }
//        return result;
    }
}
