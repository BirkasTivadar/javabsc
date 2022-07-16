/*
Grape osztály: legyen egy String type attribútuma, valamint a hozzá tartozó getter és setter metódusok! Az osztály a Fruit leszármazottja legyen!
*/

package introinheritance.fruit;

public class Grape extends Fruit {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Grape{" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() +
                ", type='" + type + '\'' +
                '}';
    }
}
