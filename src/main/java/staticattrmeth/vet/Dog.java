package staticattrmeth.vet;
/*
    Állatorvosi nyilvántartás
    Hozz létre egy Dog osztályt, melynek 4 attribútuma legyen: név, életkor, fajta és kódszám! A kódszám long típusú legyen, és példányosításkor nem kell megadni! A fajta pedig egy Species nevű enumból választható érték, melynek az egyszerűség kedvéért most csak a következő létező példányai legyenek: GERMAN_SHEPHERD, BEAGLE, POINTER, GOLDEN_RETRIEVER, LABRADOR, MIXTURE!
    Ezután hozz létre egy Vet osztályt, amelynek két attribútuma legyen: egy, a rendelőben regisztrált kutyákat tartalmazó lista, valamint egy static long code attribútum, melynek az induló értéke 1 legyen! A listához készíts getter metódust! Legyen az osztályban egy addDog(Dog dog) metódus is, mely úgy adja hozzá a kívánt kutyát a listához, hogy beállítja nála a kódszám attribútum értékét a Vet osztály code attribútumának aktuális értékére, majd a listához adással egyidőben meg is növeli a statikus attribútum értékét eggyel! Így elérhető, hogy minden egyes regisztrált kutya egyedi kódszámmal rendelkezzen.
*/

public final class Dog {

    private final String name;
    private final int age;
    private final Species species;
    private long codeNumber;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public Species species() {
        return species;
    }
    public long getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }
}
