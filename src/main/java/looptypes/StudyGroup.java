package looptypes;

import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - Tanulócsoportok
//        Hozz létre egy StudyGroup osztályt, melynek printStudyGroups(List<String> students) metódusa a kapott listában szereplő tanulókat két külön tanulócsoportra osztja, és ki is írja a konzolra, hogy ki melyik csoportba kerül. Az 1-es csoportba kerüljenek azok, akiknek a neve legfeljebb 10 betű hosszú, a 2-es csoportba pedig az ennél hosszabb nevűek! Az osztály main() metódusában példányosítsd le a listát, add meg benne a tanulók neveit, majd oszd őket két csoportba (hívd meg a listán a metódust)!

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        for (String student : students) {
            if (student.length() >= 10) {
                System.out.println(student + " 1. csoport");
            } else {
                System.out.println(student + " 2. csoport");
            }
        }
    }

    public static void main(String[] args) {

        List<String> students = Arrays.asList("Birkás Tivadar", "Bató Pálma", "Alejandro Rodriguez", "John Doe", "Kiss Ibolya", "Nagy Zita");

        StudyGroup studyGroup = new StudyGroup();

        studyGroup.printStudyGroups(students);
    }
}
