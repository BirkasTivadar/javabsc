/*
Négyzet alakú terítő
    Készíts egy cloth.Square nevű interfészt, melyben négy default metódus is található:
        int getNumberOfSides(): visszaadja egy négyzet oldalainak számát.
        double getLengthOfDiagonal(): az oldal hosszának ismeretében visszaadja a négyzet átlójának hosszát.
        double getPerimeter(): az oldal hosszának ismeretében visszaadja a négyzet kerületét.
        double getArea(): az oldal hosszának ismeretében visszaadja a négyzet területét.
    Legyen az interfészben egy absztrakt double getSide() metódus is! A default metódusok ezt a metódust hívják meg a visszaadott értékeik kiszámolásához!
    Legyen egy TableCloth osztály, amely implementálja ezt az interfészt, és van egy double side attribútuma, melynek értékét konstruktorban állítja be! A getSide() metódus ezt adja vissza!
    Írj tesztet a TableClothTest osztályban a metódusok működésének ellenőrzésére!
*/

package interfacedefaultmethods.cloth;

public interface Square {

    double side();

    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return Math.sqrt(2) * side();
    }

    default double getPerimeter() {
        return 4 * side();
    }

    default double getArea() {
        return side() * side();
    }

}
