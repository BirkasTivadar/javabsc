/*
Egy csésze kávé
Készíts egy coffee.Coffee osztályt, amelynek legyen egy String name és egy int price attribútuma! Az osztálynak ne legyen konstruktora, viszont legyenek az attribútumokhoz setter metódusok, hogy majd később be lehessen állítani az értékeiket! Készíts hozzájuk getter metódusokat is!
Ezután hozz létre egy Cappuccino osztályt, amely a Coffee osztályból öröklődjön! Semmit ne írj ebbe az osztályba, a két kapcsos zárójel közötti rész legyen teljesen üres!
Végül készíts egy CoffeeMain osztályt, amelynek a main() metódusában először példányosíts egy Coffee objektumot, állítsd be az attribútumainak az értékeit majd írd is ki őket a konzolra! Ezután pedig példányosíts egy Cappuccino objektumot, ennél állítsd be az attribútumainak az értékeit, majd ezeket is írd ki a konzolra! Mit tapasztalsz?
*/

package introinheritance.coffee;

public class Coffee {

    private String name;

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
