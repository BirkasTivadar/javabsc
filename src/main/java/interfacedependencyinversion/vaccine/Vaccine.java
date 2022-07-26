/*
Oltási sorrend
        Egy járványos betegségre többféle vakcina is létezik, de nem mindegyiket kaphatja mindenki. Ez egészségi állapottól és életkortól függ. A helyzetet bonyolítja még az is, hogy nem mindig elérhető az összes típusú vakcina, illetve az is, hogy vannak a betegségre nézve kifejezetten veszélyeztetett emberek. Mivel fontos, hogy mindenki minél hamarabb oltást kaphasson, és ráadásul olyan típusú vakcinát, amelyet sem az életkora, sem az egészségi állapota nem zár ki, ezért a különböző típusú vakcinákkal való oltáskor sorrendet állítanak fel az oltásra várakozók között.
        A vaccine csomagba készítsd el az alábbiakat:

        Person osztály: String name, int age, ChronicDisease chronic és Pregnancy pregnant attribútumokkal. Az osztály konstruktora állítsa be ezek értékét.
        ChronicDisease enum: YES és NO felsorolókkal.
        Pregnancy enum: YES és NO felsorolókkal.
        Vaccine interfész: List<Person> getVaccinationList() és void generateVaccinationList(List<Person> registrated) absztrakt metódusokkal.
        FirstVaccine osztály: implementálja a Vaccine interfészt. Van egy List<Person> vaccinationList attribútuma, amely kezdetben egy üres lista. Az interfész generateVaccinationList() metódusának implementációja egy olyan listát generál, melyben első helyen a várandósok szerepelnek, közvetlenül utánuk kell besorolni az időseket (65 év felettiek) és csak utánuk jöhet mindenki más. Krónikus betegség senkinél nem kizáró ok.
        SecondVaccine osztály: implementálja a Vaccine interfészt. Van egy List<Person> vaccinationList attribútuma, amely kezdetben egy üres lista. Az interfész generateVaccinationList() metódusának implementációja egy olyan listát generál, amelyben elöl szerepelnek a fiatalok (65 évesek vagy az alattiak), és utánuk következnek az idősek (mert őket is csak akkor oltják ezzel a vakcinával, ha nagyon muszáj). A listában a várandósok és a krónikus betegek ne szerepeljenek (mert nem olthatóak ezzel a vakcinával, életkortól függetlenül)!
        Írd meg a tesztet is az egyes osztályok tesztelésére a VaccineTest osztályban! A tesztosztálynak legyen egy Vaccine vaccine attribútuma, amelyet két különböző tesztmetódusban példányosíts, egyik esetben FirstVaccine, másik esetben pedig SecondVaccine példányt adj neki értékül! Az osztályban attribútumként legyen megadva az oltásra regisztráltak listája is, amelyet egy @BeforeEach annotációval ellátott metódusban készíts el (példányosítsd és adj hozzá néhány embert)!
*/

package interfacedependencyinversion.vaccine;

import java.util.List;

public interface Vaccine {

    List<Person> getVaccinationList();

    void generateVaccinationList(List<Person> registrated);
}
