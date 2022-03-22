package junit5assert;

//Gyakorlati feladat - Sárkányok
//        Hozz létre egy Dragon osztályt, melynek legyen három attribútuma: String name, int numberOfHeads és double height! Készíts az osztályba konstruktort és minden attribútumhoz gettert is! Ezután készítsd el a DragonTest osztályt, amelyben szerepeljenek a következő metódusok:
//        testName(), melyben assertEquals() és assertNotEquals() metódus segítségével vizsgáld meg a példányosított sárkány nevét!
//        testNumberOfHeads(), melyben assertEquals(), assertTrue() és assertFalse() metódusokkal is vizsgáld meg a példányosított sárkány fejeinek számát!
//        testHeight(), melyben három paraméteres assertEquals() metódus segítségével vizsgáld meg a példányosított sárkány magasságát!
//        testNull(), melyben példányosíts két sárkányt, az egyiknek null-t adj értékül! Vizsgáld meg az egyik példányt az assertNull(), a másikat az assertNotNull() metódus segítségével!
//        testSameObjects(), melyben példányosíts egy sárkányt, majd még egyet, amelynek add értékül az előzőt! Vizsgáld meg az egyezőségüket az assertSame() metódus segítségével!
//        testNotSameObjects(), melyben példányosíts két sárkányt, mindkettőt ugyanazokkal az értékekkel! Vizsgáld meg az egyezőségüket az assertSame() és assertNotSame() metódusok közül a megfelelővel!

public class Dragon {

    private final String name;
    private final int numberOfHeads;
    private final double height;

    public Dragon(String name, int numberOfHeads, double height) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public double getHeight() {
        return height;
    }
}
