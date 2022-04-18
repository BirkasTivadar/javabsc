package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int legs) {
        return animals.stream().filter(a -> a.numberOfLegs() == legs).toList();
//        List<Animal> result = new ArrayList<>();
//        for (Animal animal : animals) {
//            if (animal.getNumberOfLegs() == legs) result.add(animal);
//        }
//        return result;
    }
}
