package compositionlist;

import java.util.ArrayList;
import java.util.List;

//Gyakorlati feladat - Kávékapszulák
//        Készíts egy Capsules osztályt, mely segít olyan műalkotás megtervezésében, amely újrahasznosított kávékapszulákból áll. Egy hajlítható műanyag csőbe tudjuk helyezni a különböző színű kapszulákat egymás mellé. Így alakul ki az alkotás, amit aztán különböző formára hajlíthatunk.
//        A Capsules osztály egy ArrayList típusú attribútumban tárolja a betett kapszulákat, méghozzá a színüket String-ként.
//        A Capsules osztálynak legyen egy addLast(String), addFirst(String), removeFirst(), removeLast() metódusa, mely betesz, illetve kivesz kapszulákat a csőből. Legyen egy List<String> getColors() metódusa, mely visszaadja a kapszulákat tartalmazó listát, hogy ki lehessen írni.
//        Írj egy main() metódust, mely teszteli a metódusok működését.


public class Capsules {

    private List<String> colors = new ArrayList<>();

    public void addLast(String color) {
        colors.add(color);
    }

    public void addFirst(String color) {
        colors.add(0, color);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {
        return new ArrayList<>(colors);
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("azul");
        capsules.addFirst("rojo");
        System.out.println(capsules.getColors());

        capsules.addLast("verde");
        capsules.addLast("amarillo");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());

        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}

