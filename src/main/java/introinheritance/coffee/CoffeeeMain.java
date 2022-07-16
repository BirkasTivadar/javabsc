/*
Végül készíts egy CoffeeMain osztályt, amelynek a main() metódusában először példányosíts egy Coffee objektumot, állítsd be az attribútumainak az értékeit majd írd is ki őket a konzolra! Ezután pedig példányosíts egy Cappuccino objektumot, ennél állítsd be az attribútumainak az értékeit, majd ezeket is írd ki a konzolra! Mit tapasztalsz?
*/

package introinheritance.coffee;


public class CoffeeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Sao Paolo");
        coffee.setPrice(2400);
        System.out.println(coffee);

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Mocca");
        cappuccino.setPrice(560);
        System.out.println(cappuccino);
    }
}
