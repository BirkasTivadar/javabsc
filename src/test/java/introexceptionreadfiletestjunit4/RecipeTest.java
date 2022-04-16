package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RecipeTest {

    @Test
    public void tesGetIngredients() {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));

        List<String> ingredients = recipe.getIngredients();

        assertEquals(List.of("liszt", "margarin", "kristálycukor", "tojás", "citrom",
                "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"), ingredients);
    }

    @Test
    public void testGetIngredientsWithWrongFileName() {
        Recipe recipe = new Recipe();
        Path wrongPath = Path.of("src/test/resources/recip.txt");

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> recipe.addIngredients(wrongPath));
        assertEquals("Can not read file", ise.getMessage());
    }
}