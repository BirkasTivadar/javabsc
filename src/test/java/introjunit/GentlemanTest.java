package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void sayHello() {
        Gentleman gentleman = new Gentleman();

        assertThat(gentleman.sayHello("John Doe"), equalTo("Hello John Doe"));

        // Gyakorlati feladat - Tesztlefedettség mérése
        // Implementáld, hogy ha a sayHello() metódus null paramétert kap, a visszaadott szöveg Hello Anonymous legyen! Futtasd le a tesztlefedettség mérést, és nézd meg, hogy hogyan jelzi a fejlesztőeszköz, hogy az új ág nem lett lefedve! Implementáld a megfelelő tesztesetet a GentlemanTest osztályban, és futtasd le újra a lefedettség mérést!
        assertThat(gentleman.sayHello(null), equalTo("Hello Anonymus"));
    }
}