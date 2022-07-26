/*
SecondVaccine osztály: implementálja a Vaccine interfészt. Van egy List<Person> vaccinationList attribútuma, amely kezdetben egy üres lista. Az interfész generateVaccinationList() metódusának implementációja egy olyan listát generál, amelyben elöl szerepelnek a fiatalok (65 évesek vagy az alattiak), és utánuk következnek az idősek (mert őket is csak akkor oltják ezzel a vakcinával, ha nagyon muszáj). A listában a várandósok és a krónikus betegek ne szerepeljenek (mert nem olthatóak ezzel a vakcinával, életkortól függetlenül)!
*/

package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private final List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return new ArrayList<>(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        registrated.removeAll(registrated.stream().filter(p -> p.pregnant() == Pregnancy.YES || p.chronic() == ChronicDisease.YES).toList());
        List<Person> first = registrated.stream().filter(p -> p.age() <= 65).toList();
        registrated.removeAll(first);
        vaccinationList.addAll(first);
        vaccinationList.addAll(registrated);
    }
}
