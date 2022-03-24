package junit5fixture;

//Gyakorlati feladatok
//        A junit5fixture csomagba dolgozz!
//        Gyakorlati feladat - Hajók
//        Hozz létre egy Ship osztályt, melynek legyen három attribútuma: String name, int yearOfConstruction és double length! Készíts az osztályba konstruktort és minden attribútumhoz gettert is! Ezután készítsd el a ShipTest osztályt, amelyben legyen Ship ship attribútum, és egy @BeforeEach annotációval ellátott metódus! Ebben a metódusban példányosítsd le ezt a hajót! Az osztályban ezek után szerepeljenek a következő metódusok:
//        testName(), melyben assertEquals() és assertNotEquals() metódus segítségével vizsgáld meg a hajó nevét!
//        testYearOfConstruction(), melyben assertEquals(), assertTrue() és assertFalse() metódusokkal is vizsgáld meg a hajó készítésének évét!
//        testLength(), melyben három paraméteres assertEquals() metódus segítségével vizsgáld meg hajó hosszát!
//        testNull(), melyben példányosíts még egy hajót, melynek null-t adj értékül! Vizsgáld meg az eredeti hajót és a most példányosítottat is, egyiket az assertNull(), a másikat az assertNotNull() metódus segítségével!
//        testSameObjects(), melyben példányosíts még egy hajót, melynek add értékül az eredetit! Vizsgáld meg a két objektum egyezőségét az assertSame() metódus segítségével!
//        testNotSameObjects(), melyben példányosíts még egy hajót ugyanazokkal az értékekkel! Vizsgáld meg a két objektum egyezőségét az assertSame() és assertNotSame() metódusok közül a megfelelővel!

public class Ship {

    private final String name;
    private final int yearOfConstruction;
    private final double length;

    public Ship(String name, int yearOfConstruction, double length) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public double getLength() {
        return length;
    }
}
