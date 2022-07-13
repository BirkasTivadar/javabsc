package methodchain;
/*
Gyakorlati feladat - Szó módosítása
        Készíts a ModifiedWord osztályba egy modify(String word) metódust, amely paraméterül kap egy 3 betűnél hosszabb szót, és azt láncoltan hívott String metódusokkal átalakítja az alább is látható módon! (Tehát a szó első betűje megmarad, de nagybetű lesz, a második helyére egy kis x kerüljön, a harmadik betűje megint csak nagybetű, a negyedik helyén pedig egy kis y legyen. A többi betűjére nem lesz szükség.) A feladat többféleképpen is megoldható, az alábbi kimeneteket várjuk:
        alma megadása esetén AxMy,
        körte megadása esetén KxRy,
        szilva megadása esetén pedig SxIy
        legyen a visszatérési érték!
        Írd meg a tesztesetet is a metódus működésének tesztelésére!
*/
public class ModifiedWord {
    public String modify(String str) {
        return String.valueOf(str.charAt(0)).toUpperCase().concat("x").concat(String.valueOf(str.charAt(2)).toUpperCase()).concat("y");
    }


}
