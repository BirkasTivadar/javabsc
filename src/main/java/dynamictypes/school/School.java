/*
Iskolarendszer
Hozd létre a school.School osztályt, amely a PrimarySchool és a SecondarySchool osztályok őse legyen! A School-ban két attribútum legyen: String name és int numberOfYears! Írj hozzájuk gettert is! A School konstruktora állítsa be ezek értékét és generálj a School-ba felülírt toString() metódust is! A PrimarySchool és a SecondarySchool osztályokban most elég megírnod csupán a megfelelő konstruktort, másra nem lesz szükség. A SchoolMain osztály main() metódusában hozz létre három változót! Mindhárom változónak a statikus típusa School legyen, de az egyiknek a dinamikus típusa School legyen, a másiknak PrimarySchool, a harmadiknak SecondarySchool! Végül írd ki mindhárom változót a konzolra! Mit látsz?
*/

package dynamictypes.school;

public class School {

    private String name;
    private int numberOfYears;

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }
}
