package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    void sayHello() {
        Gentleman gentleman = new Gentleman();

        String name = "John Doe";

        assertEquals("Hello John Doe", gentleman.sayHello(name));

//        Gyakorlati feladat - Tesztlefedettség mérése
//        Implementáld, hogy ha a sayHello() metódus null paramétert kap, a visszaadott szöveg Hello Anonymous legyen! Futtasd le a tesztlefedettség mérést, és nézd meg, hogy hogyan jelzi a fejlesztőeszköz, hogy az új ág nem lett lefedve! Implementáld a megfelelő tesztesetet a GentlemanTest osztályban, és futtasd le újra a lefedettség mérést!
        assertEquals("Hello Anonymus", gentleman.sayHello(null));

    }
}