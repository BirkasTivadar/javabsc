/*
A SchoolMain osztály main() metódusában hozz létre három változót! Mindhárom változónak a statikus típusa School legyen, de az egyiknek a dinamikus típusa School legyen, a másiknak PrimarySchool, a harmadiknak SecondarySchool! Végül írd ki mindhárom változót a konzolra! Mit látsz?
*/

package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {

        School school = new School("1/a.", 3);
        School primarySchool = new PrimarySchool("2/b.", 4);
        School secondarySchool = new SecondarySchool("3/c.", 5);

        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
