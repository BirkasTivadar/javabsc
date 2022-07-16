/*
A FruitsMain osztály main() metódusában példányosítsd le az összes osztályt (az enum kivételével, természetesen), valamint minden létrehozott példánynál állíts be minden attribútum értéket (setter metódusokkal), amit csak be tudsz állítani! Írj is ki minden beállított értéket a konzolra! Mit tapasztalsz?
*/

package introinheritance.fruit;
public class FruitsMain {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("bánan");
        fruit.setWeight(0.35);
        System.out.println(fruit);

        Grape grape = new Grape();
        grape.setName("delavári");
        grape.setWeight(1.2);
        grape.setType("csemege");
        System.out.println(grape);

        Apple apple = new Apple();
        apple.setName("jonatán");
        apple.setWeight(3.25);
        apple.setPieces(13);
        System.out.println(apple);

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("golden");
        goldenDelicious.setWeight(2.37);
        goldenDelicious.setPieces(5);
        System.out.println(goldenDelicious);

        Starking starking = new Starking();
        starking.setName("starking");
        starking.setWeight(5.6);
        starking.setPieces(7);
        System.out.println(starking);
    }
}
