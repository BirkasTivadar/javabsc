/*
Létező interfész használata
    A következőkben írunk egy olyan osztályt, amely implementálja a Runnable interfészt.
        public interface Runnable {
            public abstract void run();
        }
    Ennek az interfésznek csak egy void run() metódusa van, amit majd nekünk kell implementálnunk.
    A feladat egy olyan osztály készítése, amely megkapja a feladatok listáját, majd végrehajtja azokat (rendre kiveszi a listából a feladatokat egyenként).
        Hozz létre egy SimpleTasks nevű osztályt a interfaces.simpletasks csomagban, amely implementálja a Runnable interfészt.
        Hozd létre (generáltasd le) a megfelelő metódust, amelyet megkövetel az interfész.
        Hozz létre egy tasks nevű privát String listát.
        Hozz létre egy getter metódust a tasks attribútumhoz.
        Írj egy konstruktort, ami megkapja a tasks listát kívülről, erre állítja be a tasks attribútum értékét
        A részlépések végrehajtásához hozz létre egy private boolean nextStep() metódust, amely kiveszi a legutolsó elemet a tasks listából, és amelynek visszatérési értéke igaz, ha még van szöveg a listában, egyébként hamis.
        A run() metódus implementációját úgy írd meg, hogy mindaddig hívd a nextStep() metódust, amíg van feladat (amíg a nextStep() igazzal tér vissza)!
*/

package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

    private final List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    private boolean nextStep() {
        if (!tasks.isEmpty()) tasks.remove(0);
        return !tasks.isEmpty();
    }

    @Override
    public void run() {
        while (nextStep()) ;
    }
}
