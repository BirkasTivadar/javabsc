package introconstructors;

//Gyakorlati feladat - Feladatok
//        Hozz létre egy Task osztályt, mely az elvégzendő feladatokról tartalmaz információkat. A feladatnak van címe (title), leírása (description), elkezdésének időpontja (startDateTime), időtartama percben mérve (duration).
//        Fordítsd le az osztályt, és nyisd meg az editorban a Task.class fájlt! Van benne konstruktor? Ha van, mi a tartalma?
//        Task példányt a feladat címének és leírásának megadásával lehet létrehozni. Ennek megfelelően készítsd el az osztály konstruktorát! Fordítás után újra nézd meg a Task.class fájl tartalmát! Milyen és hány konstruktor van benne?
//        Készíts minden attribútumhoz gettert, a duration attribútumhoz settert, és egy start() metódust, mely a startDateTime attribútumot az aktuális dátumra és időpontra állítja be!
//        A TaskMain osztály main() metódusában teszteld az osztályt!

public class TaskMain {

    public static void main(String[] args) {
        Task washing = new Task("washing", "washing of the clothes");

        washing.setDuration(134);
        washing.start();

        System.out.println(washing.getTitle());
        System.out.println(washing.getDescription());
        System.out.println(washing.getStartDateTime());
        System.out.println(washing.getDuration());
    }
}
