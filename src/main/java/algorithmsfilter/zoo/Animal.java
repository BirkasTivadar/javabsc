package algorithmsfilter.zoo;

/*
Gyakorlati feladat - Állatkert
        Hozz létre egy Animal osztályt, amelynek két attribútuma van: az állat neve (name) és lábainak száma (numberOfLegs)! Készíts hozzá természetesen konstruktort és gettereket is! Majd hozz létre egy zoo.Zoo osztályt, amelynek van egy állatokat tartalmazó lista attribútuma! Ez a lista úgy kap értéket, hogy az osztály példányosításakor a konstruktornak kell megadni paraméterként. Legyen hozzá getter és egy addAnimal(Animal) metódus! Továbbá legyen az osztálynak egy olyan metódusa (getAnimalsWithNumberOfLegsGiven(int numberOfLegs)), amely kikeresi és egy másik listában összegyűjtve visszaadja az állatkert azon állatait, amelyeknek annyi lábuk van, mint a paraméterül kapott szám!
*/

public record Animal(String name, int numberOfLegs) {
}
