package staticattrmeth.vet;

//Ezután hozz létre egy Vet osztályt, amelynek két attribútuma legyen: egy, a rendelőben regisztrált kutyákat tartalmazó lista, valamint egy static long code attribútum, melynek az induló értéke 1 legyen! A listához készíts getter metódust! Legyen az osztályban egy addDog(Dog dog) metódus is, mely úgy adja hozzá a kívánt kutyát a listához, hogy beállítja nála a kódszám attribútum értékét a Vet osztály code attribútumának aktuális értékére, majd a listához adással egyidőben meg is növeli a statikus attribútum értékét eggyel! Így elérhető, hogy minden egyes regisztrált kutya egyedi kódszámmal rendelkezzen.

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private static long code = 1;

    private final List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dog.setCodeNumber(code);
        dogs.add(dog);
        code++;
    }

    public static long getCode() {
        return code;
    }

    public List<Dog> getDogs() {
        return new ArrayList<>(dogs);
    }
}
