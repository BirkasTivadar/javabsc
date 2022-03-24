package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        Name nameWithTitleAndMiddleName = new Name("Kovács", "Lajos", "József", Title.DR);
        Name nameWithTitleWithoutMiddleName = new Name("Kovács", "", "József", Title.DR);
        Name nameWithoutTitleWithMiddleName = new Name("Kovács", "Lajos", "József", null);
        Name nameWithoutTitleWithoutMiddleName = new Name("Kovács", "", "József", null);

        System.out.println("Név címmel és középsőnévvel:");
        System.out.println(nameWithTitleAndMiddleName.concatNameHungarianStyle());
        System.out.println(nameWithTitleAndMiddleName.concatNameWesternStyle());
        System.out.println();

        System.out.println("Név címmel, középső név nélkül:");
        System.out.println(nameWithTitleWithoutMiddleName.concatNameHungarianStyle());
        System.out.println(nameWithTitleWithoutMiddleName.concatNameWesternStyle());
        System.out.println();

        System.out.println("Név középsőnévvel, cím nélkül:");
        System.out.println(nameWithoutTitleWithMiddleName.concatNameHungarianStyle());
        System.out.println(nameWithoutTitleWithMiddleName.concatNameWesternStyle());
        System.out.println();

        System.out.println("Név cím nélkül, középső név nélkül:");
        System.out.println(nameWithoutTitleWithoutMiddleName.concatNameHungarianStyle());
        System.out.println(nameWithoutTitleWithoutMiddleName.concatNameWesternStyle());
        System.out.println();
    }
}
