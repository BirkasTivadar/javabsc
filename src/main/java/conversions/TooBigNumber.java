package conversions;

//Gyakorlati feladatok
//        A conversions csomagba dolgozz!

public class TooBigNumber {

//    Gyakorlati feladat - Jó végeredmény
//    Az int típus ábrázolási tartományának határa pozitív irányban 2_147_483_647. Készíts a TooBigNumber osztályban egy getRightResult(int number) metódust, amelyben ehhez a számhoz hozzáadod a paraméterként kapott számot! A feladat az, hogy a metódus matematikailag helyes eredményt adjon vissza!
//    Teszteld az osztály main() metódusában!

    public long getRightResult(int number) {
        return (long) 2_147_483_647 + number;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();

        System.out.println(tooBigNumber.getRightResult(10));
    }
}
