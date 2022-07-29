/*
Legyen egy TableCloth osztály, amely implementálja ezt az interfészt, és van egy double side attribútuma, melynek értékét konstruktorban állítja be! A getSide() metódus ezt adja vissza!
*/

package interfacedefaultmethods.cloth;

public record TableCloth(double side) implements Square {
}
