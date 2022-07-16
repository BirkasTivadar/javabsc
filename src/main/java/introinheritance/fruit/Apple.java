/*
Apple osztály: legyen egy int pieces attribútuma, valamint a hozzá tartozó getter és setter metódusok! Ez az osztály is a Fruit leszármazottja legyen!
*/

package introinheritance.fruit;

public class Apple extends Fruit {
    private int pieces;

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Apple{" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() +
                ", pieces=" + pieces +
                '}';
    }
}
