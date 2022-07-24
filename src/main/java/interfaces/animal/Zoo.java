/*
Használd az előző állat példányokat az Animal interfész segítségével a Zoo osztályban! Miután létrehoztad a Zoo osztályt, szükség lesz egy List<Animal> animals privát attribútumra, amelyben Animal interfészt implementáló példányok vannak. Az állatok listáját kívülről adják majd meg, ezért szükség van egy olyan konstruktorra, melynek ez az egy paramétere van, és ezt a kapott listát értékül adja az attribútumnak. Hozz létre egy publikus metódust getNumberOfAnimals() névvel, amely visszaadja, hogy hány állat található a területen (a lista mérete)! Hozz létre egy publikus metódust getNumberOfAllLegs() névvel, amely visszaadja, hogy összesen hány lába van az állatoknak (összegezd az állatok lábát, használva a példányok getNumberofLegs() metódusát)!
*/

package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public int getNumberOfAllLegs() {
        return animals.stream().mapToInt(Animal::getNumberOfLegs).sum();
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }
}
