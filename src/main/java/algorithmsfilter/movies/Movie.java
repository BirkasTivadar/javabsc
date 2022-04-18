package algorithmsfilter.movies;

/*
Gyakorlati feladat - Jó filmek
        Készíts egy movie.Movie osztályt, amelynek három attribútuma:

        String title
        Category category (ez egy enum, néhány általad megadott filmkategóriával, pl. akciófilm, thriller, romantikus, stb.)
        int rating (minden filmnek van egy 1 és 5 közötti értékelése)
        Majd készíts egy VideoTheque osztályt, amelynek van egy filmeket tartalmazó lista attribútuma, amelyet példányosíts is le! Legyen hozzá getter és egy másik metódus, amellyel új filmeket lehet a listához adni! Ezenkívül legyen az osztálynak egy metódusa (a nevét megtudhatod a megfelelő tesztesetből), amely segíteni tudja a videotékába látogató emberek választását úgy, hogy egy listába összegyűjtve visszaadja a paraméterként megadott kategóriájú, 3-asnál jobb értékelést kapott filmeket!
*/

public record Movie(String title, Category category, int rating) {
}
