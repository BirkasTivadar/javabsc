/*
Könyvek
Készíts egy book.Book osztályt az alábbiak alapján!
Attribútumok:
private String title;
protected int price;

Konstruktor:
public Book(String title, int price)

Publikus metódusok:
public String getTitle()
public int purchase(int pieces) // kiszámolja a darabszám ismeretében a teljes árat

Készíts egy ShippedBook osztályt a Book osztály leszármazottjaként, egy int shippingCost attribútummal!
Konstruktor:
public ShippedBook(String title, int price, int shippingCost)

Publikus metódusok:
public int order(int pieces) // kiszámolja a darabszám ismeretében a teljes árat, postaköltséggel együtt
public String toString() // Egy ehhez hasonló szöveget ad vissza: "Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft"
*/


package inheritanceattributes.book;

public class Book {

    private final String title;

    protected int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int purchase(int pieces) {
        return pieces * price;
    }

    public String getTitle() {
        return title;
    }
}
