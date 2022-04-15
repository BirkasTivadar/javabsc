package introexceptionthrowjunit4;

/*
Gyakorlati feladat - Osztályzatok
        Készíts egy Student osztályt, melynek van egy List<Integer> típusú listája, amiben a tanuló érdemjegyeit tárolja! Legyen hozzá egy getter és egy addNote(int note) metódus, amellyel hozzá lehet adni új osztályzatot a listához! Ez a metódus dobjon IllegalArgumentException-t azzal a szöveggel, hogy "Note must be between 1 and 5!"!

        A StudentTest osztályban írd is meg a teszteseteket a metódus tesztelésére! Legyen négy tesztmetódus: egy, ami a helyes működést vizsgálja, valamint három, amelyben kivétel keletkezik! A három utóbbit a lecke szövegében említett háromféle módszer szerint írd meg, mindegyik alapján egyet-egyet!
*/

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Integer> notes = new ArrayList<>();

    public List<Integer> getNotes() {
        return new ArrayList<>(notes);
    }

    public void addNote(int note) {
        if (0 < note && note < 6) {
            notes.add(note);
        } else {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
    }
}
