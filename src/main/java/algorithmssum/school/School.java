package algorithmssum.school;

/*
Gyakorlati feladat - Iskolába járó diákok száma
        A school csomagban hozz létre egy School osztályt, amelyben a getNumberOfStudents(List<Integer> headcounts) metódus kap egy listát az iskola osztályainak létszámáról. A metódus a lista alapján számolja ki és adja vissza az iskola összes diákjának számát!
*/

import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        return headcounts.stream().mapToInt(h -> h).sum();
//        int sum = 0;
//        for (int number : headcounts) sum += number;
//        return sum;
    }
}
