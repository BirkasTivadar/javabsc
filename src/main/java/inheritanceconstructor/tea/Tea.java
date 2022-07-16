/*
Egy csésze tea
A tea csomagban hozd létre a Tea osztályt, melynek legyen egy String name és egy int price attribútuma! Legyen az osztályban egy konstruktor, amely beállítja az attribútumok értékeit, valamint getter metódusok!
Majd hozd létre a HerbalTea osztályt, amely a Tea osztály leszármazottja legyen! Ne írj semmi egyebet az osztályba, csak készítsd el a konstruktorát (amely nélkül le sem fog fordulni az osztály)!
Ezután a TeaMain osztály main() metódusában példányosítsd először a Tea, majd a HerbalTea osztályt, és írd ki a konzolra az attribútumaik értékét!
*/

package inheritanceconstructor.tea;

public class Tea {
    private final String name;
    private final int price;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
