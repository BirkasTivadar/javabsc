package enumtype.position;

//Gyakorlati feladat - Vállalati pozíciók
//        A position csomagban készíts egy Position nevű enumot, melynek példányaiként felveszel néhány vállalati pozíciót! Legyen az enumnak két attribútuma: int salary és String benefit, amelyekben megadod minden példányhoz egyenként, hogy melyik pozícióban mennyi a fizetés, illetve milyen béren kívüli juttatások járnak! Teszteld az enumot a PositionMain osztály main() metódusában!

public class PositionMain {

    public static void main(String[] args) {
        for (Position p : Position.values()) {
            System.out.println(p.name() + ": " + p.getSalary() + " + " + p.getBenefit());
        }
    }
}
