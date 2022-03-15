package enumtype.solarsystem;

//Gyakorlati feladat - A Naprendszer bolygói
//        A solarsystem csomagban készíts egy SolarSystem nevű enumot, amelyben létrehozod a Naprendszer bolygóit példányokként! Legyen az osztálynak egy egész szám attribútuma is, melyből minden bolygónál megtudhatjuk, hogy hány holdja van! Teszteld az enumot a SolarSystemMain osztály main() metódusában!

public class SolarSystemMain {

    public static void main(String[] args) {

        for (SolarSystem s : SolarSystem.values()) {
            System.out.println(s + ": " + s.getNumberOfMoon()+ " holdja van.");
        }
    }
}