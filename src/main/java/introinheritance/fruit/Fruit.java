/*
Gyümölcsök
Készítsd el a következő osztályokat a fruit csomagba úgy, hogy egyikbe sem írsz konstruktort:
Fruit osztály: legyen egy String name és egy double weight attribútuma, valamint a hozzájuk tartozó getter és setter metódusok!
Grape osztály: legyen egy String type attribútuma, valamint a hozzá tartozó getter és setter metódusok! Az osztály a Fruit leszármazottja legyen!
Apple osztály: legyen egy int pieces attribútuma, valamint a hozzá tartozó getter és setter metódusok! Ez az osztály is a Fruit leszármazottja legyen!
Colour nevű enum, benne RED és YELLOW felsorolókkal.
GoldenDelicious osztály, amely az Apple leszármazottja, és legyen benne egy Colour colour = Colour.YELLOW; attribútum, valamint a hozzá tartozó getter metódus!
Starking osztály, amely az Apple leszármazottja, és legyen benne egy Colour colour = Colour.RED; attribútum, valamint a hozzá tartozó getter metódus!

A FruitsMain osztály main() metódusában példányosítsd le az összes osztályt (az enum kivételével, természetesen), valamint minden létrehozott példánynál állíts be minden attribútum értéket (setter metódusokkal), amit csak be tudsz állítani! Írj is ki minden beállított értéket a konzolra! Mit tapasztalsz?
*/

package introinheritance.fruit;

public class Fruit {

    private String name;

    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
