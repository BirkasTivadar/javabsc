/*
Készíts egy ShippedBook osztályt a Book osztály leszármazottjaként, egy int shippingCost attribútummal!
Konstruktor:
public ShippedBook(String title, int price, int shippingCost)

Publikus metódusok:
public int order(int pieces) // kiszámolja a darabszám ismeretében a teljes árat, postaköltséggel együtt
public String toString() // Egy ehhez hasonló szöveget ad vissza: "Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft"
*/

package inheritanceattributes.book;

public class ShippedBook extends Book {

    private final int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return purchase(pieces) + shippingCost;
    }

    @Override
    public String toString() {
        return String.format("%s: %d Ft, postaköltség: %d Ft", getTitle(), price, shippingCost);
    }
}
