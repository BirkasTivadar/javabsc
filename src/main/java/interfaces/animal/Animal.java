/*
Saját interfész definiálása, implementálása, használata
    A következő interfészt és osztályokat mind a interfaces.animal csomagba tedd!

    Hozz létre egy Animal interfészt, amely két metódust deklarál: az int getNumberofLegs() metódust, amely visszaadja az állat lábainak a számát, valamint a String getName() metódust, amely visszaadja az állat nevét!
        Az első állat a kacsa (Duck) lesz, amely implementálja az Animal interfészt úgy, hogy a lábak száma kettő, a név pedig “Duck”.
        A második állat az oroszlán (Lion) lesz, amely implementálja az Animal interfészt úgy, hogy a lábak száma négy, a név pedig “Lion”
        A harmadik állat a féreg (Worm) legyen, amely implementálja az Animal interfészt úgy, hogy a lábak száma nulla, a név pedig “Worm”.
        Használd az előző állat példányokat az Animal interfész segítségével a Zoo osztályban! Miután létrehoztad a Zoo osztályt, szükség lesz egy List<Animal> animals privát attribútumra, amelyben Animal interfészt implementáló példányok vannak. Az állatok listáját kívülről adják majd meg, ezért szükség van egy olyan konstruktorra, melynek ez az egy paramétere van, és ezt a kapott listát értékül adja az attribútumnak. Hozz létre egy publikus metódust getNumberOfAnimals() névvel, amely visszaadja, hogy hány állat található a területen (a lista mérete)! Hozz létre egy publikus metódust getNumberOfAllLegs() névvel, amely visszaadja, hogy összesen hány lába van az állatoknak (összegezd az állatok lábát, használva a példányok getNumberofLegs() metódusát)!
*/

package interfaces.animal;

public interface Animal {

    int getNumberOfLegs();

    String getName();
}
