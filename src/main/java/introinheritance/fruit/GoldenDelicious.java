/*
GoldenDelicious osztály, amely az Apple leszármazottja, és legyen benne egy Colour colour = Colour.YELLOW; attribútum, valamint a hozzá tartozó getter metódus!
*/

package introinheritance.fruit;

public class GoldenDelicious extends Apple {
    private final Colour colour = Colour.YELLOW;

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "GoldenDelicious{" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() +
                ", pieces=" + super.getPieces() +
                ", colour=" + colour +
                '}';
    }
}
