/*
FirstVaccine osztály: implementálja a Vaccine interfészt. Van egy List<Person> vaccinationList attribútuma, amely kezdetben egy üres lista. Az interfész generateVaccinationList() metódusának implementációja egy olyan listát generál, melyben első helyen a várandósok szerepelnek, közvetlenül utánuk kell besorolni az időseket (65 év felettiek) és csak utánuk jöhet mindenki más. Krónikus betegség senkinél nem kizáró ok.
*/

package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private final List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return new ArrayList<>(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> first = registrated.stream().filter(p -> p.pregnant() == Pregnancy.YES).toList();
        registrated.removeAll(first);
        vaccinationList.addAll(first);
        List<Person> second = registrated.stream().filter(p -> p.age() > 65).toList();
        registrated.removeAll(second);
        vaccinationList.addAll(second);
        vaccinationList.addAll(registrated);
    }
}
