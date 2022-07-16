/*
Starking osztály, amely az Apple leszármazottja, és legyen benne egy Colour colour = Colour.RED; attribútum, valamint a hozzá tartozó getter metódus!
*/

package introinheritance.fruit;

public class Starking extends Apple {
    private final Colour colour = Colour.RED;

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Starking{" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() +
                ", pieces=" + super.getPieces() +
                ", colour=" + colour +
                '}';
    }
}
