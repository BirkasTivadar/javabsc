package enumtype.university;

//Gyakorlati feladat - Egyetemek
//        A university csomagban hozz létre egy University nevű enumot, amelynek példányai néhány, általad tetszőlegesen választott magyarországi egyetem rövidített neve (pl. BME)! Legyen az enumnak egy String name attribútuma is, amelynek értékét a konstruktorában állítsa be: ez legyen minden példánynál az adott egyetem hivatalos neve, rövidítések nélkül kiírva. Teszteld a UniversityMain osztály main() metódusában!

public class UniversityMain {

    public static void main(String[] args) {

        for (University u : University.values()) {
            System.out.println(u + ": " + u.getName());
        }
    }
}
